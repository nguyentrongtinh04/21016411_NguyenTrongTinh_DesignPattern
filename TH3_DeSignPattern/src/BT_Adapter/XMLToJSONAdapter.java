package BT_Adapter;

import org.json.JSONObject;
import org.json.XML;

public class XMLToJSONAdapter implements JSONService {
    private XMLService xmlService;
    
    public XMLToJSONAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }
    
    @Override
    public void processJSON(String jsonData) {
        // Chuyển đổi JSON sang XML
        String xmlData = convertJSONtoXML(jsonData);
        System.out.println("Chuyển JSON thành XML: " + xmlData);
        xmlService.processXML(xmlData);
    }
    
    public String convertXMLtoJSON(String xmlData) {
        JSONObject json = XML.toJSONObject(xmlData);
        return json.toString(4);
    }
    
    public String convertJSONtoXML(String jsonData) {
        JSONObject json = new JSONObject(jsonData);
        return XML.toString(json);
    }
}