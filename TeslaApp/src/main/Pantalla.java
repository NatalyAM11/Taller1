package main;
import processing.core.PApplet;
import processing.core.PImage;
import controller.UserRegisterController;

public class Pantalla {
	
	private PApplet app;
	
	int posX, posY;
	
	//pantalla
	private PImage PInicio,PSub,PExi,pMenu,pMenuHistorial;
	private PImage pModelS,pModel3,pModelX,pModelY;
	private PImage pHistorial,pCompra, pCompra2, pCompra3;
	private PImage pInfoS,pInfo3,pInfoX,pInfoY;
	private PImage modelSFoto,model3Foto,modelXFoto,modelYFoto;
	
	//botones
	private PImage bContinuar;
	
	
	//Variable que va en el switch
	int pantalla;
	
	private UserRegisterView userRegister;

	int compra;
	
	public Pantalla (PApplet app) {
		this.app=app;
		this.pantalla=0;
	}
	

	public void cargar() {
		
	//aca cargo todas las imagenes que voy a usar 
		PInicio=app.loadImage("img/Inicio.png");
		PSub=app.loadImage("img/Sub.png");
		PExi=app.loadImage("img/pExito.png");
		bContinuar=app.loadImage("img/bcontinuar.png");
		pMenu=app.loadImage("img/pMenu.png");
		pHistorial=app.loadImage("img/pHistorial.png");
		pMenuHistorial=app.loadImage("img/pMenuHisto.png");
		pModelS=app.loadImage("img/modelS.png");
		pModel3=app.loadImage("img/model3.png");
		pModelX=app.loadImage("img/modelX.png");
		pModelY=app.loadImage("img/modelY.png");
		pInfoS=app.loadImage("img/pInfoS.png");
		pInfo3=app.loadImage("img/pInfo3.png");
		pInfoX=app.loadImage("img/pInfoX.png");
		pInfoY=app.loadImage("img/pInfoY.png");
		pCompra=app.loadImage("img/pCompra.png");
		pCompra2=app.loadImage("img/pCompra2.png");
		pCompra3=app.loadImage("img/pCompra3.png");
		modelSFoto=app.loadImage("img/modelSFoto.png");
		model3Foto=app.loadImage("img/model3Foto.png");
		modelXFoto=app.loadImage("img/modelXFoto.png");
		modelYFoto=app.loadImage("img/modelYFoto.png");
		
		
		//userRegister = new UserRegisterView(app);
}
	


//Con este metodo pinto todas las pantallas y todo lo que necesite 
	public void pintar() {
		
		switch(pantalla) {
		case 0:
			app.image(PInicio,0,0);
			break;
			
			
			//pantalla de registro
		case 1:
			 app.image(PSub,0,0);
			//userRegister.drawScreen();
			break;
			
			//pantalla de exito 
		case 2:
			app.image(PExi,0,0);
			break;
			
		case 3:
			app.image(pMenu,0,0);
			break;
			
			//pantalla de menu con historial
		case 4:
			app.image(pMenuHistorial,0,0);
			break;
			//pantalla modelo S
		case 5:
			app.image(pModelS,0,0);
		break;
		//pantalla carro modelo 3
		case 6:
		     app.image(pModel3,0,0);
		break;
					
		case 7:
		//pantalla carro modelo X
			app.image(pModelX,0,0);
		break;
		case 8:
		//pantalla carro modelo Y
		app.image(pModelY,0,0);
		break;
		case 9:
			app.image(pHistorial,0,0);
			break;
			
		case 10:
			app.image(pCompra,0,0);
			ponerImagenPrecio();
			
			break;
		case 11:
			app.image(pInfoS,0,0);
			break;
		case 12:
			app.image(pInfo3,0,0);
			break;
		case 13:
			app.image(pInfoX,0,0);
			break;
		case 14:
			app.image(pInfoY,0,0);
			break;
		case 15:
			app.image(pInfoY,0,0);
			break;
		case 16:
			app.image(pCompra2,0,0);
			break;
		case 17:
			app.image(pCompra3,0,0);
			break;
			
			
			
		}
	
	}
	
	
	//metodo para pasar las pantallas, esto es todo lo que iria en el mouse pressed
	public void pasarPantalla() {
	
		
		switch (pantalla) {
		
		//pantalla con logo
		case 0:  if((app.mouseX>0 && app.mouseX<app.width)&&(app.mouseY>0 && app.mouseY<app.height)) {
					pantalla=1;
					}
					break;
		
					
		//pantalla de registro
		case 1: //userRegister.getInfoForm();
		        //userRegister.getInfoForm();
		
		      if((app.mouseX>127 && app.mouseX<276)&&(app.mouseY>560 && app.mouseY<605)) {
				pantalla=2;
		      	}
		      	break;
		
		      	
		//pantalla de exito de registro
				case 2:    if((app.mouseX>130 && app.mouseX<294)&&(app.mouseY>531 && app.mouseY<578)) {
					       app.image(bContinuar,130,531);
					       pantalla=3;
				}
				break;
				
				//pantalla del menu 
				case 3:  if(( app.mouseX>346 &&  app.mouseX<618)&&( app.mouseY>28 &&  app.mouseY<70)) {
					       pantalla=4;
					      }
				//delimito las coordenadas de las opciones de los carros pero en la pantalla de historial
				if((app.mouseX>0 && app.mouseX<207)&&(app.mouseY>289 && app.mouseY<479)) {
					pantalla=5;
					}
				
				if((app.mouseX>206 && app.mouseX<app.width)&&(app.mouseY>289 &&app. mouseY<479)) {
					pantalla=6;
					}
				
				if((app.mouseX>0 && app.mouseX<207)&&(app.mouseY>507 && app.mouseY<app.height)) {
					pantalla=7;
					}
				if((app.mouseX>206 && app.mouseX<app.width)&&(app.mouseY>507 && app.mouseY<app.height)) {
					pantalla=8;
					}
				break;
				
				case 4:
					
					if((app.mouseX>346 && app.mouseX<385)&&(app.mouseY>28 && app.mouseY<70)) {
					       pantalla=3;
					      }
					
					if((app.mouseX>187 && app.mouseX<375)&&(app.mouseY>107 && app.mouseY<158)) {
					       pantalla=9;
					      }
				
				//delimito las coordenadas de las opciones de los carros pero en la pantalla de historial
				if((app.mouseX>0 && app.mouseX<207)&&(app.mouseY>289 && app.mouseY<479)) {
					pantalla=5;
					}
				
				if((app.mouseX>206 && app.mouseX<app.width)&&(app.mouseY>289 &&app. mouseY<479)) {
					pantalla=6;
					}
				
				if((app.mouseX>0 && app.mouseX<207)&&(app.mouseY>507 && app.mouseY<app.height)) {
					pantalla=7;
					}
				if((app.mouseX>206 && app.mouseX<app.width)&&(app.mouseY>507 && app.mouseY<app.height)) {
					pantalla=8;
					}
				break;
				
				
				//modeloS
				case 5: if((app.mouseX>41 && app.mouseX<81)&&(app.mouseY>30 && app.mouseY<69)) {
					pantalla=3;
					
					if((app.mouseX>224 && app.mouseX<334)&&(app.mouseY>518 && app.mouseY<479)) {
						pantalla=5;
						}
		      		}
				
				//Para pasar a la pantalla de info
				if((app.mouseX>225 &&app. mouseX<334)&&(app.mouseY>588 && app.mouseY<620)) {
					pantalla=11;}
				
				//Para pasar a la pantalla de compra
				if((app.mouseX>104 &&app. mouseX<310)&&(app.mouseY>631 && app.mouseY<675)) {
					pantalla=10;
					compra=0;
					}
				break;
			
				
				
				
				
				//modelo3
				case 6: if((app.mouseX>41 && app.mouseX<81)&&(app.mouseY>30 && app.mouseY<69)) {
					pantalla=3;}
				
				//Para pasar a la pantalla de info
				if((app.mouseX>225 &&app. mouseX<334)&&(app.mouseY>588 && app.mouseY<620)) {
					pantalla=12;}
				//Para pasar a la pantalla de compra
				if((app.mouseX>104 &&app. mouseX<310)&&(app.mouseY>631 && app.mouseY<675)) {
					pantalla=10;
					compra=1;}
				break;
				
				
				//modelX
				case 7: if((app.mouseX>41 && app.mouseX<81)&&(app.mouseY>30 && app.mouseY<69)) {
					pantalla=3;
				 }
				//Para pasar a la pantalla de info
						if((app.mouseX>225 &&app. mouseX<334)&&(app.mouseY>588 &&app. mouseY<620)) {
							pantalla=13;}
						//pantalla compra
						if((app.mouseX>104 &&app. mouseX<310)&&(app.mouseY>631 && app.mouseY<675)) {
							pantalla=10;
							compra=2;}
				break;
						
						
				//modelX
				case 8: if((app.mouseX>41 && app.mouseX<81)&&(app.mouseY>30 && app.mouseY<69)) {
					pantalla=3;
		  		}	
				//Para pasar a la pantalla de info
				if((app.mouseX>225 &&app. mouseX<334)&&(app.mouseY>588 && app.mouseY<620)) {
					pantalla=14;}
				
				if((app.mouseX>104 &&app. mouseX<310)&&(app.mouseY>631 && app.mouseY<675)) {
					pantalla=10;
					compra=3;}
					break;
				
				//pantalla historial
				case 9: if((app.mouseX>41 && app.mouseX<81)&&(app.mouseY>30 && app.mouseY<69)) {
					pantalla=3;
		  		}
				break;
				
			
				case 10:
					if((app.mouseX>41 && app.mouseX<81)&&(app.mouseY>30 && app.mouseY<69)) {
						
					//Con estos if controlo que el regreso de pantalla sea el correspondiente para cada modelo de carro
					if (compra==0) {
						pantalla=5;
					}
					if (compra==1) {
						pantalla=6;
					}
					if (compra==2) {
						pantalla=7;
					}
					if (compra==3) {
						pantalla=8;
					}
		  		}
					
					//para seguir a la segunda pantalla de compra
					if((app.mouseX>348 && app.mouseX<385)&&(app.mouseY>643 && app.mouseY<666)) {
						pantalla=16;
			  		}
					
					
					break;
					
					//pantallas info del carro model s,3,x,y
				case 11: if((app.mouseX>41 && app.mouseX<81)&&(app.mouseY>30 && app.mouseY<69)) {
					pantalla=5;
		  		}
				break;
				case 12: if((app.mouseX>41 && app.mouseX<81)&&(app.mouseY>30 && app.mouseY<69)) {
					pantalla=6;
		  		}
				break;
				
				case 13: if((app.mouseX>41 && app.mouseX<81)&&(app.mouseY>30 && app.mouseY<69)) {
					pantalla=7;
		  		}
				break;
				case 14: if((app.mouseX>41 && app.mouseX<81)&&(app.mouseY>30 && app.mouseY<69)) {
					pantalla=8;
		  		}
				break;
				
				//segunda pantalla de compra
				case 16: if((app.mouseX>41 && app.mouseX<81)&&(app.mouseY>30 && app.mouseY<69)) {
					pantalla=10;
		  		}
				if((app.mouseX>348 && app.mouseX<385)&&(app.mouseY>643 && app.mouseY<666)) {
					pantalla=17;
		  		}
				break;
				//tercera pantalla de compra
				case 17: if((app.mouseX>41 && app.mouseX<81)&&(app.mouseY>30 && app.mouseY<69)) {
					pantalla=16;
		  		}
			}
			}
	
	
	//Para evitarme crear 4 pantallas de compra diferentes, es la misma pantalla pero cambia el modelo y el precio 
	//del carro 
	public void ponerImagenPrecio() {
		switch(compra) {
		case 0:app.image(modelSFoto,40,140); 
			break;
		case 1:app.image(model3Foto,40,140); 
		break;
		case 2:app.image(modelXFoto,40,140); 
		break;
		case 3:app.image(modelYFoto,40,140); 
		break;
		}
	}
		
}

	
	
