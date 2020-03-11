package main;

import processing.core.PApplet;

public class ModelY extends Carro{
	
	public ModelY (PApplet app, int autonomia,int aceleracion,int rines, int velocidad) {
		super(app,autonomia,aceleracion,rines,velocidad);
		this.aceleracion=2;
		this.autonomia=51;
	}

}
