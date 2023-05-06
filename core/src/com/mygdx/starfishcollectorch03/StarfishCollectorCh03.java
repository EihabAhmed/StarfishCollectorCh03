package com.mygdx.starfishcollectorch03;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class StarfishCollectorCh03 extends GameBeta {
	private Turtle turtle;
	private Starfish starfish;
	private BaseActor ocean;

	public void initialize() {
		ocean = new BaseActor(0, 0, mainStage);
		ocean.loadTexture("water.jpg");
		ocean.setSize(800, 600);

		starfish = new Starfish(380, 380, mainStage);

		turtle = new Turtle(20, 20, mainStage);
	}

	public void update(float dt) {

	}
}
