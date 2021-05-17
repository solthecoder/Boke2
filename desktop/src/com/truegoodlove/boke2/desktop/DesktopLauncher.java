package com.truegoodlove.boke2.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.truegoodlove.boke2.desktop.Drop;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title ="Drop";
		config.width = 600;
		config.height = 600;
		new LwjglApplication(new Drop(), config);
	}
}