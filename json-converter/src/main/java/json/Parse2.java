package json;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


public class Parse2 {
	
	public static void main(String args[]) throws JSONException{

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
		JSONObject outerObject = new JSONObject();
		JSONArray outerArray = new JSONArray();		
		JSONObject [] innerObject = new JSONObject[list1.size()];
		
		for (int i = 0; i < list1.size(); i++){
			
			innerObject[i]=new JSONObject();
			innerObject[i].put("Item" , list1.get(i));
			outerArray.put(innerObject[i]);
		}
		outerObject.put("rows", outerArray);
		System.out.println(outerObject);		
	}   
}
