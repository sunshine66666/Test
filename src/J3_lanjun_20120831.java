import java.util.ArrayList;
import java.util.List;


/**
 * stack
 * 
 * @author lanjun
 *
 */
public class J3_lanjun_20120831 {

    public void push(List<Integer> stack, Integer i){
	stack.add(i);
    }
    
    public Integer pop(List<Integer> stack) {
	if (0 == stack.size()) {
	    System.out.println("栈为空");
	    return null;
	}
	int index = stack.size()-1;
	Integer i = stack.get(index);
	stack.remove(index);
	return i;
    }
    
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	List<Integer> stack = new ArrayList<Integer>();
	J3_lanjun_20120831 j3 = new J3_lanjun_20120831();
	j3.push(stack, Integer.valueOf(1));
	j3.push(stack, Integer.valueOf(2));
	System.out.println(j3.pop(stack));
	System.out.println(j3.pop(stack));
	System.out.println(j3.pop(stack));
    }

}
