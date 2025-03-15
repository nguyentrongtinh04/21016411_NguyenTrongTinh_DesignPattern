package BT_Adapter;

public class Main {
	public static void main(String[] args) {
        XMLService xmlService = new XMLService();
        XMLToJSONAdapter adapter = new XMLToJSONAdapter(xmlService);
        
        // XML data
        String xmlData = "<user><name>Alice</name><age>25</age></user>";
        
        // Chuyển đổi XML thành JSON và hiển thị
        String jsonData = adapter.convertXMLtoJSON(xmlData);
        System.out.println("Chuyển XML thành JSON: " + jsonData);
        
        // Chuyển đổi JSON thành XML và hiển thị
        String revertedXML = adapter.convertJSONtoXML(jsonData);
        System.out.println("Chuyển JSON thành XML: " + revertedXML);
    }
}