package cn.com.css;

public class chengfabiao {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(i >= j){
					System.out.print(j + "*"+ i + "=" + i*j + "\t");
				}
			}
			System.out.println();
		}
	}
}
