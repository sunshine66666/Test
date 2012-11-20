import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * count
 * 
 * @author lanjun
 *
 */
public class J4_lanjun_20120831 {

    public void readfile() {
	File file = new File("/var/log/messages");
//	File file = new File("/home/lanjun/messages");
	BufferedReader reader = null;
	Map<String, Integer> map = new HashMap<String, Integer>();

	try {
	     reader = new BufferedReader(new FileReader(file));
	     String text = null;

	     // repeat until all lines is read
	     while ((text = reader.readLine()) != null) {
		String[] strs = text.split(" ", -2);
		for (int i = 0; i < strs.length; i++) {
		    if (strs[0].trim().equals("") || strs[0].trim().equals(":") || strs[0].trim().equals(".")) continue;
		    if (map.containsKey(strs[0])) {
			map.put(strs[0], map.get(strs[0]) + 1);
		    } else {
			map.put(strs[0], 1);
		    }
		}
	     }
	     

	     for (Map.Entry<String, Integer> entry : map.entrySet()) {

	         System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());

	     }
	 }
	 catch (FileNotFoundException e) {
	     e.printStackTrace();
	 }
	 catch (IOException e) {
	     e.printStackTrace();
	 }
	 finally {
	     try {
	  if (reader != null) {
	      reader.close();
	  }
	     }
	     catch (IOException e) {
	  e.printStackTrace();
	     }
	 }
    }
    
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	J4_lanjun_20120831 j4 = new J4_lanjun_20120831();
	j4.readfile();
    }

}
