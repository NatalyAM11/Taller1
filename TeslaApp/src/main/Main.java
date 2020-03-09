package main;

import processing.core.PApplet;
import processing.core.PImage;


public class Main extends PApplet {
	
	
	//Todosss los PImage
	PImage PInicio;
	PImage PSub;
	PImage PExi;
	PImage bContinuar;
	PImage pMenu;
	PImage bFlecha;
	PImage pMenuHistorial;
	PImage pModelS,pModel3,pModelX,pModelY;
	PImage pHistorial;
	PImage pCompra;
	PImage modelS;

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
		pMenuHistorial=loadImage("img/pMenuHisto.png");
		pModelS=loadImage("img/modelS.png");
		pModel3=loadImage("img/model3.png");
		pModelX=loadImage("img/modelX.png");
		pModelY=loadImage("img/modelY.png");
		pHistorial=loadImage("img/pHistorial.png");
		pCompra=loadImage("img/pCompra.png");
		modelS=loadImage("img/modelSFoto.png");
		
	//	userRegView = new UserRegisterView(this);
		
		
		
		
		
	}
	
	
	public void draw() {
		
		
		//switch que controla las pantallas 
		switch (pantalla) {
		
		//pantalla con el logo
		case 0:
			image(PInicio,0,0);
			break;
			
			
			//pantalla de registro
		case 1:
			//image(PSub,0,0);
			image(PSub,0,0);
			//userRegView.drawScreen();
			break;

			
			//pantalla de exito de registro
		case 2:
			image(PExi,0,0);
			break;
			
			
			//pantalla de menu
		case 3:
			image(pMenu,0,0);
			
			break;
			
			
			//pantalla de menu con historial
		case 4:
			image(pMenuHistorial,0,0);
			break;
			
			
			//pantalla carro modelo S
		case 5:
			image(pModelS,0,0);
			break;
			
			
		//pantalla carro modelo 3
		case 6:
			image(pModel3,0,0);
			break;
			
		case 7:
			//pantalla carro modelo X
			image(pModelX,0,0);
			break;
		case 8:
			//pantalla carro modelo Y
			image(pModelY,0,0);
			break;
			//pantalla historial
		case 9:
			image(pHistorial,0,0);
			break;
			
		case 10:
			image(pCompra,0,0);
			
			
			break;
			
		}
		
		fill(255);
	    textSize(20);
	    text("x=" + mouseX + "y=" + mouseY, mouseX, mouseY);
		
		
	
}
	
	public void mousePressed() {
		
		
		switch (pantalla) {
		
		//pantalla con logo
		case 0:  if((mouseX>0 && mouseX<width)&&(mouseY>0 && mouseY<height)) {
					pantalla=1;
					}
		break;
		
		//pantalla de registro
		case 1: //userRegView.getInfoForm();
		
		      if((mouseX>127 && mouseX<276)&&(mouseY>553 && mouseY<605)) {
				pantalla=2;
			}
		break;
		
		
		//pantalla de exito de registro
		case 2:    if((mouseX>130 && mouseX<294)&&(mouseY>531 && mouseY<578)) {
			       image(bContinuar,130,531);
			       pantalla=3;
		}
		break;
		
		//pantalla del menu 
		case 3:  if((mouseX>346 && mouseX<618)&&(mouseY>28 && mouseY<70)) {
			       pantalla=4;
			      }
		
		//delimito las coordenadas de las opciones de los carros
				if((mouseX>0 && mouseX<207)&&(mouseY>289 && mouseY<479)) {
					pantalla=5;
					}
				
				if((mouseX>206 && mouseX<width)&&(mouseY>289 && mouseY<479)) {
					pantalla=6;
					}
				
				if((mouseX>0 && mouseX<207)&&(mouseY>507 && mouseY<height)) {
					pantalla=7;
					}
				if((mouseX>206 && mouseX<width)&&(mouseY>507 && mouseY<height)) {
					pantalla=8;
					}	
		break;
		
		
		
		//pantalla del menu pero con ventana de historial
		case 4:
			
			if((mouseX>346 && mouseX<385)&&(mouseY>28 && mouseY<70)) {
			       pantalla=3;
			      }
			
			if((mouseX>187 && mouseX<375)&&(mouseY>107 && mouseY<158)) {
			       pantalla=9;
			      }
		
		//delimito las coordenadas de las opciones de los carros pero en la pantalla de historial
		if((mouseX>0 && mouseX<207)&&(mouseY>289 && mouseY<479)) {
			pantalla=5;
			}
		
		if((mouseX>206 && mouseX<width)&&(mouseY>289 && mouseY<479)) {
			pantalla=6;
			}
		
		if((mouseX>0 && mouseX<207)&&(mouseY>507 && mouseY<height)) {
			pantalla=7;
			}
		if((mouseX>206 && mouseX<width)&&(mouseY>507 && mouseY<height)) {
			pantalla=8;
			}
		break;
		
		//modeloS
		case 5: if((mouseX>41 && mouseX<81)&&(mouseY>30 && mouseY<69)) {
			pantalla=3;
      		}
		
		if((mouseX>102 && mouseX<308)&&(mouseY>633 && mouseY<673)) {
			pantalla=10;
			
      		}
		break;
		
		//modelo3
		case 6: if((mouseX>41 && mouseX<81)&&(mouseY>30 && mouseY<69)) {
			pantalla=3;
  		}
		break;
		
		//modelX
		case 7: if((mouseX>41 && mouseX<81)&&(mouseY>30 && mouseY<69)) {
			pantalla=3;
		 }
		break;
				
				
		//modelX
		case 8: if((mouseX>41 && mouseX<81)&&(mouseY>30 && mouseY<69)) {
			pantalla=3;
  		}	
		break;
		
		case 9: if((mouseX>41 && mouseX<81)&&(mouseY>30 && mouseY<69)) {
			pantalla=3;
  		}
		break;
			
	}
		if(pantalla==5) {
			image(modelS,156,0);
		}
		

		
	}
}
