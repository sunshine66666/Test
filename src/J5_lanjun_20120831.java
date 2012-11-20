import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * query
 * 
 * @author lanjun
 *
 */
public class J5_lanjun_20120831 {

    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {

	String[] strs = new String[1000 * 10000];
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	// 输入字符串数组
	
	for (int i = 0; i < 1000; i ++)
	for (int j = 0; j < 10000; j++) {
	    map.put(strs[i*10000 + j], 1);
	}

	java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.println("请输入一个string:");                        
	String str = scan.nextLine(); 
	Integer i = map.get(str);
	if (null == i) {
	    System.out.println("没有这个字付串" + str);
	} else {
	    System.out.println(str);
	}
	
	
    }

}
