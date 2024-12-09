package com.gn.practice04.controller;

public class AppController {

	public void starMyApp() {
		AppFeatures ap = new LoginMenu();
		
		ap.dusplay();
		ap.input();
		ap.close();
	}
}
