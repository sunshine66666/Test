/**
 * 查找最长公共子串
 * 
 * @author lanjun
 *
 */
public class J2_lanjun_20120831 {
    
    public String MaxSubString(String str1, String str2) {
        int k = 0, index = 0, max = 0;
        
        for(int i = 0; i < str1.length(); i++) {
            for(int j = 0; j < str2.length(); j++) {
        	
        	for(k = 0; (j + k) < str2.length() && (i + k) < str1.length(); ) 
        	    if (str1.charAt(i + k) == str2.charAt(j + k)) 
        		k++;
        	    else 
        		break;
        	if (k > max)  {
        	    index = j;
        	    max = k; 
        	} 
            }
        }
            
        String str = str2.substring(index, index + max);
        return str;
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
	J2_lanjun_20120831 j2 = new J2_lanjun_20120831();
	String subStr = j2.MaxSubString(str1, str2);
	System.out.println("最长子串是: " + subStr);
    }

}
