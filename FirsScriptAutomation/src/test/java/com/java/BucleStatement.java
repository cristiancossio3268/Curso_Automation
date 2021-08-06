package com.java;

public class BucleStatement {

	public static void main(String[] args) {
		
//		// While
//		int numero= 1;
//		while(numero <= 10) {
//			System.out.println("El número es "+ numero);
//		   ++numero;	// numero= +1
//		}
//		
//		//Do-while - Cuantas veces se tiene que sumar a si mismo "numeroSum" para llegar a 100?
//		
//		int numeroSum = 5;
//		int sumTotal = 0;
//		int count = 0;
//		
//		do {
//			sumTotal = sumTotal + numeroSum; // sumTotal += numeroSum;
//			++count;
//		}while(sumTotal < 100);
//		
//		System.out.println("El número se sumo "+count);
		
		//For
		
//		int numeroFor= 10;
		
//		for (int i = 1; i <= numeroFor; i++) {
//	    	// Block code
//			System.out.println("El número For es "+i);
//			if (i==5) {
//			break;
//			}	
//		}
		LoginCreateUser(20, 3, 3);
//		contador(100);
//		System.out.println(suma(2,3));
	}
		//Metodos
	public static void contador(int numero) {
		for(int i=1 ; i<=numero ; i++) {
			//Block code
			System.out.println("El numero FOR es "+ i);
		}
	}
	//Sobrecarga de metodos
	public static int suma(int num1, int num2) {
		int sumTotal = num1+num2;
		return sumTotal;
	}
	
	public static int suma(int num1, int num2, int num3) {
		int sumTotal = num1+num2+num3;
		return sumTotal;
	}
	
	public static int suma(int num1, int num2, boolean valor) {
		int sumTotal = num1+num2;
		return sumTotal;
	}
	
	public static void LoginCreateUser(int numero, int num1, int num2) {
		contador(numero);
		int sumaTotal = suma(num1, num2);
		System.out.println("La suma es "+ sumaTotal);
	}

}
