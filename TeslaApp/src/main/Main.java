package main;

import processing.core.PApplet;
import processing.core.PImage;


public class Main extends PApplet {
	
	
	//Todosss los PImage
	PImage PInicio;
	PImage PSub;
	PImage PExi;
	PImage bContinuar;
	PImage bFlecha;
	PImage pMenu,pHistorial,pMenuHistorial;
	PImage pModelS,pModel3,pModelX,pModelY;
	PImage pCompra;
	PImage pInfoS,pInfo3,pInfoX,pInfoY;
	

	private int pantalla = 0;
	
	
	public Pantalla pantallas;
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");
	}
	
	public void settings() {
		size (414,690);
	}
	
	public void setup() {
		
		
		//Todas la imagenes
		//PInicio=loadImage("img/Inicio.png");
		PSub=loadImage("img/Sub.png");
		PExi=loadImage("img/pExito.png");
		bContinuar=loadImage("img/bcontinuar.png");
		pMenu=loadImage("img/pMenu.png");
		bFlecha=loadImage("img/flecha.png");
		pMenuHistorial=loadImage("img/pMenuHisto.png");
		pModelS=loadImage("img/modelS.png");
		pModel3=loadImage("img/model3.png");
		pModelX=loadImage("img/modelX.png");
		pModelY=loadImage("img/modelY.png");
		pHistorial=loadImage("img/pHistorial.png");
		pCompra=loadImage("img/pCompra.png");
		pInfoS=loadImage("img/pInfoS.png");
		pInfo3=loadImage("img/pInfo3.png");
		pInfoX=loadImage("img/pInfoX.png");
		pInfoY=loadImage("img/pInfoY.png");
		
		pantallas= new Pantalla(this);
		pantallas.cargar();
		
		
		
		
	   //userRegister = new UserRegisterView(this);
		
		
		
		
		
	}
	
	
	public void draw() {
		
		pantallas.pintar(); 
		fill(255);
	    textSize(20);
	    text("x=" + mouseX + "y=" + mouseY, mouseX, mouseY);
	    

		
		fill(255);
	    textSize(20);
	    text("x=" + mouseX + "y=" + mouseY, mouseX, mouseY);
		

	
	}
	public void mousePressed() {
		
		pantallas.pasarPantalla();
	

		
	}
}
