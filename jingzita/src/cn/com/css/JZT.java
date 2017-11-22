package cn.com.css;

public class JZT {
	public static void main(String[] args) {
		function1();
	}
	
	public static void function1(){
		for (int i = 1; i <= 9; i+=2) {
			for (int j = 1; j <= 9; j++) {
				if(i >= j){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
