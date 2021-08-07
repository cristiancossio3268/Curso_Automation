package com.ejerciciobasico.gato;

public class GatoJugando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isCatPlaying (false, 37);
	}
	
	public static string isCatPlaying(boolean verano, int temperatura) {

		if (verano = true){
			if (temperatura >= 25){				
			    if (temperatura <= 45) {
			       String gatito = "Verdadero";
			       return gatito;
				   System.out.println("Verdadero "+ temperatura);
			   }else {
				   System.out.println("Falso "+ temperatura);
			   }	
			}else {
				System.out.println("Falso "+ temperatura);
			}
		}else if(verano = false){
			if (temperatura >= 25){				
			    if (temperatura <= 35) {
				   System.out.println("Verdadero "+ temperatura);
			   }else {
				   System.out.println("Falso "+ temperatura);
			   }	
			}else {
				System.out.println("Falso "+ temperatura);
			}
		}
		
	}

}
