package cn.com.css;

public class px {
	public static void main(String[] args) {
		int[] arr = {1,4,7,3,6,2,9};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
