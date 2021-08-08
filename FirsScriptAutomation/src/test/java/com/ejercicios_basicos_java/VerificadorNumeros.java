package com.ejercicios_basicos_java;

public class VerificadorNumeros {

	public static void main(String[] args) {
		
		imprimirVerificadorNumeros(1, 2, 3);

	}
	
	public static void imprimirVerificadorNumeros(int param1, int param2, int param3) {
		
		if (param1 <0 || param2 <0 || param3 <0){
			System.out.println("Valor no valido");
		}else if(param1 == param2 && param1 == param3 && param2 == param1 && param2 == param3 && param3 == param1 && param3 == param2){
			System.out.println("Todos los números son iguales");
			}else if(param1 != param2 && param1 != param3 && param2 != param1 && param2 != param3 && param3 != param1 && param3 != param2){
				System.out.println("Todos los números son diferentes");
			}else {
				System.out.println("Ni todos son iguales ni diferentes");
			}
        }	
}