package com.ejercicios_basicos_java;

public class VerificadorSumaNumero {
	

	public static void main(String[] args) {
		
		hasEqualSum(1, 1 , 1);

	}
	
	public static boolean hasEqualSum(int p1, int p2, int p3) {
		
		boolean verificadorSuma;
		
		if (p1 + p2 == p3){
			verificadorSuma = true;
			System.out.println(verificadorSuma);
		}else {
			verificadorSuma = false;
			System.out.println(verificadorSuma);
		}
		return verificadorSuma;
	}
      
}
