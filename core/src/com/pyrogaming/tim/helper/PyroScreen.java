package com.pyrogaming.tim.helper;

import com.badlogic.gdx.*;

public abstract class PyroScreen extends ScreenAdapter
{
	protected final Game game;
	
	public PyroScreen(Game game)
	{
		this.game = game;
	}
}
