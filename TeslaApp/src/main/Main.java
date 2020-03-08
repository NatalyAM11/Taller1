package main;

import processing.core.PApplet;
import processing.core.PImage;


public class Main extends PApplet {
	
	
	//Todos los PImage
	PImage PInicio;
	PImage PSub;
	PImage PExi;
	PImage bContinuar;
	PImage pMenu;
	PImage bFlecha;
	PImage PHistorial;
	

	private int pantalla = 0;
	private UserRegisterView userRegView;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");
	}
	
	public void settings() {
		size (414,690);
	}
	
	public void setup() {
		
		
		//Todas la imagenes
		PInicio=loadImage("img/Inicio.png");
		PSub=loadImage("img/Sub.png");
		PExi=loadImage("img/pExito.png");
		bContinuar=loadImage("img/bcontinuar.png");
		pMenu=loadImage("img/pMenu.png");
		bFlecha=loadImage("img/flecha.png");
		PHistorial=loadImage("img/pMenuHisto.png");
	//	userRegView = new UserRegisterView(this);
		
		
		
		
		
	}
	
	
	public void draw() {
		
		
		//switch que controla las pantallas 
		switch (pantalla) {
		case 0:
			image(PInicio,0,0);
			
			break;
		case 1:
			//image(PSub,0,0);
			image(PSub,0,0);
			//userRegView.drawScreen();
			break;

		default:
		case 2:
			image(PExi,0,0);
			break;
			
		case 3:
			image(pMenu,0,0);
			
			break;
			
		case 4:
			image(PHistorial,0,0);
			break;
			
		}
		
		fill(255);
	    textSize(20);
	    text("x=" + mouseX + "y=" + mouseY, mouseX, mouseY);
		
		
	
}
	
	public void mousePressed() {
		
		
		switch (pantalla) {
		
		
		case 0:  if((mouseX>0 && mouseX<width)&&(mouseY>0 && mouseY<height)) {
					pantalla=1;
									}
		

		
		break;
		case 1: //userRegView.getInfoForm();
		
		      if((mouseX>127 && mouseX<276)&&(mouseY>553 && mouseY<605)) {
				pantalla=2;
			}
		      
		break;
		case 2:    if((mouseX>130 && mouseX<294)&&(mouseY>531 && mouseY<578)) {
			       image(bContinuar,130,531);
			       pantalla=3;
		}
		break;
		case 3:    if((mouseX>346 && mouseX<618)&&(mouseY>28 && mouseY<70)) {
			       pantalla=4;
			      
		}
		
	}
		

		
	}
}