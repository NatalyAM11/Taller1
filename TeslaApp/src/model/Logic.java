package model;

import java.util.ArrayList;

public class Logic {
	private ArrayList<UserModel> listUsers;
	public Logic() {
		listUsers = new ArrayList<UserModel>();
	}
	public void registerUser(String username, String password, String email) {
		listUsers.add(new UserModel(username, password, email));
		
		for (UserModel userModel : listUsers) {
			System.out.println(userModel.getUsername());
			System.out.println(userModel.getPassword());
			System.out.println(userModel.getEmail());
			System.out.println("====================");
		}
		
		/*
		 * Es lo mismo que arriba pero con indice
		 * for (int i = 0; i < listUsers.size(); i++) {
			System.out.println(listUsers.get(i).getUsername());
			System.out.println(listUsers.get(i).getPassword());
			System.out.println(listUsers.get(i).getEmail());
			System.out.println("====================");
		}*/
	}
}
