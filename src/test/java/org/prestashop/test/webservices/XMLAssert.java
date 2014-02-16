/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.prestashop.test.webservices;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
 
import org.junit.Assert;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

public class XMLAssert {
    
    public static void assertEquals(File in, File out) throws ParserConfigurationException, SAXException, IOException {
        StringBuffer sbIn = calculate(in);
        StringBuffer sbOut = calculate(out);
        Assert.assertEquals(sbIn.toString(), sbOut.toString());
    }
    
    private static StringBuffer calculate(File file) throws ParserConfigurationException, SAXException, IOException {
        StringBuffer sb = new StringBuffer();

        Depth depth = new Depth();
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(file);
 
        Element elements = doc.getDocumentElement();
 
        int level = 1;
        List<String>  list  = new ArrayList<String>();
        list.add(elements.getNodeName() + "[" + level + "]");
 
        NodeList nodeList = elements.getChildNodes();
        
        printNode(doc, nodeList, level, list, depth);
 
        Collections.sort(list);
        list.add("The deepest level is : " + depth.depthOfXML);
        for (String string : list) {
            sb.append(string);
            sb.append("\n");
        }
 
        return sb;
    }
    
    private static void printNode(Document doc, NodeList nodeList, int level, List<String> list, Depth depthOfXML) {
        level++;
        if (nodeList != null && nodeList.getLength() > 0) {

            for (int i = 0; i < nodeList.getLength(); i++) {

                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    
                    int count = doc.getElementsByTagName(node.getNodeName()).getLength();
                    String value = getTrimValue(node);
                    list.add(node.getNodeName() + " " +value+ "[" + level + "] [" + count + "]" );
                    
                    printNode(doc, node.getChildNodes(), level, list, depthOfXML);

                    if (level > depthOfXML.depthOfXML) {
                        depthOfXML.depthOfXML = level;
                    }
                    
                }
            }
        }
    }
    
    private static String getTrimValue(Node node){
        String value = null;

        if(node.getFirstChild()!=null && node.getFirstChild().getNodeValue()!=null){
            value = node.getFirstChild().getNodeValue();
        }
        
        if(value != null){
            value = value.replaceAll("\\n", "");
            value = value.replaceAll("\\r", "");
            value = value.replaceAll("\\t", "");
            value = value.replaceAll(" ", "");
        }else{
            value="";
        }
        
        return value;
    }
    
    private static class Depth {
        public int depthOfXML; 
    }
    
   
}
