package com.pyrogaming.kevin;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.pyrogaming.tim.helper.PyroScreen;

public class TitleScreen extends PyroScreen
{
	Stage stage;
	
	public TitleScreen(Game game)   //
	{                               //DO NOT TOUCH
		super(game);                //
	}                               //
	
	@Override
	public void render(float delta)
	{
		//Logic code
		stage.act(delta);
		
		//Render code
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
	}

	@Override
	public void resize(int width, int height)
	{
		stage.getViewport().update(width, height);
	}

	@Override
	public void show()
	{
		stage = new Stage(new FitViewport(1080, 720));
	}

	@Override
	public void hide()
	{
		dispose();
	}

	@Override
	public void pause()
	{
		
	}

	@Override
	public void resume()
	{
		
	}

	@Override
	public void dispose()
	{
		stage.dispose();
	}

}
