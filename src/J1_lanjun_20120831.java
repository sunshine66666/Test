/**
 * 冒泡排序
 * 
 * @author lanjun
 *
 */
public class J1_lanjun_20120831 {

    /**
     * sort
     * 
     * @param array
     * @return
     */
    public int[] arraySort(int[] array) {
	
	for(int i = 0; i < array.length-1; i++) {
	    for(int j = 0; j < array.length - i - 1; j++) {
		if(array[j]>array[j+1]) {
		   int tmp=array[j];
		   array[j]=array[j+1]; 
		   array[j+1]=tmp; 
		}
	    } 
	}
	
	return array;
    }
    
    /**
     * print
     * 
     * @param array
     */
    public void printArray(int[] array) {
	for (int i = 0; i < array.length-1; i++) {
	    System.out.print(array[i] + " , ");
	}
	System.out.print(array[array.length - 1] + "\n");
    }
    
    
    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] array = {1, 3, 4, 5, 2, 8, 7, 9, 6, 0};
	J1_lanjun_20120831 j1 = new J1_lanjun_20120831();
	
	System.out.println("排序前的数组： ");
	j1.printArray(array);
	
	j1.arraySort(array);
	
	System.out.println("排序后的数组： " );
	j1.printArray(array);
    }

}
