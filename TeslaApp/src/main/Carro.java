package main;
import processing.core.PApplet;
import processing.core.PImage;

public class Carro {
	
	private PApplet app;
	int autonomia;
	int aceleracion;
	int rines;
	int velocidad;
	int carro;
	int tam;
	
public Carro (PApplet app, int autonomia,int aceleracion,int rines, int velocidad) {
	
	this.app=app;
	this.aceleracion=aceleracion;
	this.autonomia=autonomia;
	this.rines=rines;
	this.velocidad=velocidad;

	
}

public void comparar() {
	
}

/*public void comparaVel(){
    app.rect(104,265,20,this.velocidad);
    this.velocidad -= 5;
    if(this.velocidad <= -100) {
        this.velocidad = -100;
    }
}

public void comparaResis(){
    app.rect(183,265,20,this.aceleracion);
    this.aceleracion -= 5;
    if(this.aceleracion <= -90) {
        this.aceleracion= -90;
    }
}*/



}

