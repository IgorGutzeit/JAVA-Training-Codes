package unidade5;

import java.util.Scanner;

public class Fibonacci {
	
	public static void fibo(int num) {
		int s1 = 1;
		int s2 = 1;
		int s = 0;
		System.out.println(s1+","+s2+",");
		for(int i =3; i<=num; i++) { //Início
			s = s1 + s2;
			s1 = s2;
			s2 = s;
			System.out.println(s+",");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informar um número:");
		int numero = sc.nextInt();
		fibo(numero);
		sc.close();

	}

}
