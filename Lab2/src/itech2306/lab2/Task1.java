/**
 * 
 */
package itech2306.lab2;
import java.util.Scanner;
/**
 * @author huawei
 *
 */
public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10;
		int j;
		int x=0;
		double[] numbers = new double[size];
		Scanner scan = new Scanner(System.in);
		  for (int i = 0; i < 10; i++) {
			  System.out.println("ÇëÊäÈë");
			  j=scan.nextInt();
			  numbers[i]=j;
		      }
		  do {
			  System.out.println(numbers[x]);
			  x++;
			  System.out.println("\n");
			  
		  }while(x<10);
		 double objx = numbers[0];
		  for(int m=0 ; m<10 ; m++) {
		  	if(objx < numbers[m]) {
		  		objx = numbers[m];
		  	}
		  }
		  System.out.println("max value is "+objx);
			double []reverse=new double[10];
			for(int k=9;k>=0;k--) {
				reverse[k]=numbers[9-k];
			}
			int l=0;
			while(l<10){
				System.out.println(reverse[l]);
				l++;
			}
	}
}
