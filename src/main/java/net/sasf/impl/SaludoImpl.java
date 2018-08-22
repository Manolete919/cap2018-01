package net.sasf.impl;

import net.sasf.interfaces.ISaludo;

public class SaludoImpl implements ISaludo {

	public void saludar(String nombre) {
		
		System.out.println("HOLA " + nombre);

	}

}
