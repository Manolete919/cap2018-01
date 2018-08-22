package com.mycompany.app;

import net.sasf.impl.ClaseDeSaludo;
import net.sasf.impl.SaludoImpl;
import net.sasf.impl.SaludoImpl2;
import net.sasf.interfaces.ISaludo;
import net.sasf.interfaces.ISaludo2Personas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//Java
    	ISaludo saludo = new SaludoImpl();   	
    	ClaseDeSaludo claseDeSaludo = new ClaseDeSaludo("SANDY");
    	claseDeSaludo.saludar(saludo);
    	
    	ISaludo saludo2 = new SaludoImpl2();   	
    	ClaseDeSaludo claseDeSaludo2 = new ClaseDeSaludo("SANDY");
    	claseDeSaludo2.saludar(saludo2);
    	
    	
    	ClaseDeSaludo claseDeSaludo3 = new ClaseDeSaludo("SANDY");
    	claseDeSaludo3.saludar(new  ISaludo() {

			public void saludar(String nombre) {
				
				System.out.println("JET AIMME " + nombre);
				
			}
    		
    	});
    	
    	//JAVA 8
    	
    	ClaseDeSaludo claseDeSaludo4 = new ClaseDeSaludo("SANDY");
    	
    	claseDeSaludo4.saludar(nombre -> System.out.println("I LOVE YOU " + nombre));
    	
    	claseDeSaludo4.
    	saludar2Personas(
    			
    			( pepita,  x) -> 
    	             System.out.println(x + " loves " + pepita) );
    	
    	
    	claseDeSaludo4.saludar2Personas(new ISaludo2Personas() {
    		
    		public void saludar(String pepita, String x) {
    			
    			System.out.println(x + " loves " + pepita) ;
    		}
    	});
    	
    	claseDeSaludo4.saludar2Personas((String pepita, String x) ->
    			
    			System.out.println(x + " loves " + pepita)
    	);
    	
    	
    	
       // System.out.println( "Hola mundo!" );
    }
}
