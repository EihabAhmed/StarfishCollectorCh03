package com.mygdx.starfishcollectorch03;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;

public abstract class GameBeta extends Game {
    protected Stage mainStage;
    protected Stage uiStage;

    public void create() {
        mainStage = new Stage();
        uiStage = new Stage();
        initialize();
    }

    public abstract void initialize();

    public void render() {
        float dt = Gdx.graphics.getDeltaTime();

        // act method
        mainStage.act(dt);
        uiStage.act(dt);

        // defined by user
        update(dt);

        // clear the screen
        ScreenUtils.clear(0, 0, 0, 1);

        // draw the graphics
        mainStage.draw();
        uiStage.draw();
    }

    public abstract void update(float dt);
}
