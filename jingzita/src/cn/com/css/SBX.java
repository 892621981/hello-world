package cn.com.css;

import java.util.Scanner;

public class SBX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������:");
		int i = sc.nextInt();
		function1(i);
	}
	
	public static void function1(int n){
		if(n%2 == 0){
			n = n-1;
		}
		for (int i = 1; i <= n; i+=2) {
			for (int k = 1; k <= n; k+=2) {
				if(i < k){
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= n; j++) {
				if(i >= j){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//�°벿��
		for (int i = n-2; i >= 1; i-=2) {
			for (int k = 1; k <= n; k+=2) {
				if(i < k){
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= n; j++) {
				if(i >= j){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
