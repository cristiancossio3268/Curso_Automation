package com.ejerciciobasico.gato;

public class GatoJugando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isCatPlaying (false, 36);
	}
	
	public static void isCatPlaying(boolean verano, int temperatura) {
		
		if (verano == true){
			if (temperatura >= 25 && temperatura <= 45){	
				   System.out.println("Verdadero "+ temperatura);			   
		   }else {
				   System.out.println("Falso "+ temperatura);
			   }
		}else if(verano == false){
			if (temperatura >= 25 && temperatura <= 35){
				   System.out.println("Verdadero "+ temperatura);
			}else {
				   System.out.println("Falso "+ temperatura);
			      }	
		    }	
	   }
   }
