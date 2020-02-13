package json;

import org.json.*;

public class JSONPArse {
	public static void main(String[] args) {
		JSONArray array = new JSONArray();
	      array.put("INDIA");
	      array.put("AUSTRALIA");
	      array.put("ENGLAND");

	      JSONObject obj = new JSONObject();
	      obj.put("COUNTRIES", array);
	      System.out.println(obj);
	}
}
