import java.util.HashSet;
import java.util.Set;

/**
 * 查找最长公共子串
 * 
 * @author lanjun
 *
 */
public class J2_2_lanjun_20120831 {
    
    public String MaxSubString(String str1, String str2) {
    	int len = 0;
    	int beginIndex = 0;
    	Set<String> strSet = new HashSet<String>();
    	for (int i = 0; i < str1.length(); i++) {
    		for (int j = i + 1; j <= str1.length(); j++) {
    			String str = str1.substring(i, j);
//    			System.out.println(str);
    			strSet.add(str);
    		}
    	}
    	
    	for (int i = 0; i < str2.length(); i++) {
    		for (int j = i + 1; j <= str2.length(); j++) {
    			String str = str2.substring(i, j);
    			boolean flag = strSet.contains(str); 
    			if (flag) {
    				if (str.length() > len) {
    					len = str.length();
    					beginIndex = i;
    				}
    			}
    		}
    	}
    	return str2.substring(beginIndex, beginIndex + len);
    }

    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String str1 = "abcdefghi";
//	String str1 = "13";
	String str2 = "bcdbcdefgg";
//	String str2 = "13";
	J2_2_lanjun_20120831 j2 = new J2_2_lanjun_20120831();
	
	String subStr = j2.MaxSubString(str1, str2);
	System.out.println("最长子串是: " + subStr);
    }

}
