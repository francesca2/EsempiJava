import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMappe {

	public static void main(String[] args) {

//		HashMap<String, String> hsm= new HashMap<String,String>();
	TreeMap<String,String> hsm = new TreeMap<String,String>();
		
		hsm.put("ccc", "CCCC");
		hsm.put("aaa", "BBBB");	
		hsm.put("bbb", "AAAA");
		
		for(Map.Entry e : hsm.entrySet())
		{
		System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
