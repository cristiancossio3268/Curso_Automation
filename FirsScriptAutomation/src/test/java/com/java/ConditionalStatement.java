package com.java;

public class ConditionalStatement {

	public static void main(String[] args) {


		int velocidad = 80; // Km/h
		int limiteVelocidad = 80;
		
		// IF Anidado - IF ELSE IF
		
	    boolean carretera = true;
		
		
	    if (carretera) {
	    	// Block code
	    	System.out.println("Carretera");
	    	
	    	limiteVelocidad = 110; // Km/h
	    
	    	if(velocidad > limiteVelocidad) {
	    		System.out.println("El coche va a acceso de velocidad, Multa!!");
	    	}else {
	    		System.out.println("El coche va a una velocidad adecuada, Felicitaciones!!");
	    	}
	    	
	    	}else if(velocidad > limiteVelocidad) {
	    		System.out.println("Calle");
	    		System.out.println("El coche va a acceso de velocidad, Multa!!");
	    	}else {
	    		System.out.println("El coche va a una velocidad adecuada, Felicitaciones!!");	    
	    	}
	    
	    //SWITCH CASE
	    
	    int temperatura = 20;
	    
	    switch(temperatura) {
	    
	    case 5:
	    
	    	System.out.println("Clima muy frio");
	    	break;
	    	
	    case 10:
	    case 15:
	    	System.out.println("Clima frio");
	    	break;
	    	
	    case 20:
	    case 25:
	    	System.out.println("Clima templado");
	    	break;
	    	
	    case 30:
		    
	    	System.out.println("Clima calido");
	    	break;
	    	
	    	default:
	    		System.out.println("Clima no reconocible por el sistema");
	    		break;
	    
	    }
	}

}
