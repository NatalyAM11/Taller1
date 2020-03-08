package main;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.UserRegisterController;
import processing.core.PApplet;

public class UserRegisterView {
	private String username, password, confirmPassword, email;
	private PApplet app;
	private ControlP5 cp5;
	private String[] inputs;
	private UserRegisterController userRegisController;

	public UserRegisterView(PApplet app) {
		this.app = app;
		cp5 = new ControlP5(app);
		inputs = new String[4];
		// inputs[] = {"username","password","confirmPassword","email"};
		inputs[0] = "username";
		inputs[1] = "password";
		inputs[2] = "confirmPassword";
		inputs[3] = "email";

		for (int i = 0; i < inputs.length; i++) {
	
			cp5.addTextfield(inputs[i]).setPosition((app.width / 2) - 115, 242 + (i * 73)).setSize(236, 31)
					.setAutoClear(true);
		}
		
		userRegisController = new UserRegisterController();

	}

	public void drawScreen() {
		
		drawButton();
	}

	private void drawInput() {

	}

	private void drawButton() {
		app.rect((app.width / 2) - 80, (app.height) - 136, 150, 51);
	}

	public void getInfoForm() {
		/*if (app.mouseX > 210 && app.mouseX < 290 && app.mouseY > 450 && app.mouseY < 490) {
			username = cp5.get(Textfield.class, "username").getText();
			password = cp5.get(Textfield.class, "password").getText();
			confirmPassword = cp5.get(Textfield.class, "confirmPassword").getText();
			email = cp5.get(Textfield.class, "email").getText();
			
		
		}*/
	}

}