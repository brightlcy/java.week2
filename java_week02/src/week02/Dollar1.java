package week02;
import java.util.Scanner;
public class Dollar1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("원화를 입력하세요(단위 원)>>");
	int i=sc.nextInt();
	int dallar_rate =1100;
	
	System.out.println(i/dallar_rate);
	
	sc.close();
	
	
	}
}