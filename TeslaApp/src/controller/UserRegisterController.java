package controller;

import model.Logic;

public class UserRegisterController {
	private Logic logic;
	public UserRegisterController() {
		logic = new Logic ();
	}
	
	public void getInfoForm(String username, String password, String confirmPassword, String email) {
		logic.registerUser(username,password,email);
	}

}


