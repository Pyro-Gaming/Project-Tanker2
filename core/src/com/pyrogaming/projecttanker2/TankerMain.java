package com.pyrogaming.projecttanker2;

import com.badlogic.gdx.Game;
import com.pyrogaming.kevin.TitleScreen;

public class TankerMain extends Game
{
	
	@Override
	public void create ()
	{
		setScreen(new TitleScreen(this));
	}
}
