package net.nosek.tutorialclicker;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import screens.SplashScreen;

public class TutorialClickerGame extends Game {

	public final static String GAME_NAME = "Tutorial Game";

	public final static int WIDTH = 480;
	public final static int HEIGHT = 700;

	private boolean paused;

	@Override
	public void create () {
		this.setScreen(new SplashScreen(this));
	}

//	Getters and setters

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

}
