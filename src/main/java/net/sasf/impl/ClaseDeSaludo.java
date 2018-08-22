package net.sasf.impl;

import net.sasf.interfaces.ISaludo;
import net.sasf.interfaces.ISaludo2Personas;

public class ClaseDeSaludo {
	
	String nombre;
	
	public ClaseDeSaludo(String nombre) {
		this.nombre = nombre;
	}
	
	public void saludar(ISaludo iSaludo) {
		iSaludo.saludar(nombre);
	}
	
	public void saludar2Personas(ISaludo2Personas iSaludo) {
		iSaludo.saludar(nombre, "Manuel");
	}
	
	
	

}
