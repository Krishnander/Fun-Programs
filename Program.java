package com;

public class Program {

	public static void main(String[] args) {
		for(int i=5;i>0;i--) {
			for(int j=i;j>=1;j--) {
				for(int k=5;k>=j;k--) {
					System.out.print(k);
				}
				System.out.println();
			}
		}
	}

}
