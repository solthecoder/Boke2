package com.truegoodlove.boke2.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
//import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
//import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
//import com.truegoodlove.boke2.desktop.Drop;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("Drop");
		new Lwjgl3Application(new Drop(), config);
	}
}