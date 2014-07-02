package com.pyrogaming.tim;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.g3d.*;
import com.badlogic.gdx.utils.viewport.*;
import com.pyrogaming.tim.helper.PyroScreen;

public class GameScreen extends PyroScreen
{
	ModelBatch mBatch;
	SpriteBatch sBatch;
	
	PerspectiveCamera pCam;
	ExtendViewport fVP;
	
	boolean load;
	
	public GameScreen(Game game)
	{
		super(game);
	}
	
	public void show()
	{
		mBatch = new ModelBatch();
		sBatch = new SpriteBatch();
		
		pCam = new PerspectiveCamera(67, 1080, 720); //Initialize the PerspectiveCamera with a F.O.V. of 67, and a screen size of 1080x720
		fVP = new ExtendViewport(1080, 720); //Initialize the ExtendViewport with a screen size of 1080x720, which is also used for the aspect ratio when resizes are made
		sBatch.setProjectionMatrix(fVP.getCamera().combined); //Set the Sprite Batch's projection matrix to fVP's camera's projection matrix
	}
	
	public void resize(int width, int height)
	{
		pCam.viewportWidth = width;  //
		pCam.viewportHeight = height;//Update the Perspective Camera's screen size
		pCam.update();               //
		
		fVP.update(width, height); //Resize the Extend Viewport, while keeping the aspect ratio
		sBatch.setProjectionMatrix(fVP.getCamera().combined);  //Set the Sprite Batch's projection matrix to fVP's camera's updated projection matrix
	}
	
	public void render(float delta)
	{
		if(load)
			load(); //Load files and other things
		
		//Logic
		
		
		//Render
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT); //Clear the buffers for color and depth
		
		mBatch.begin(pCam); //Start the Model Batch in order to draw 3D objects
		
		mBatch.end(); //Flush the Model Batch to finish drawing 3D objects
	}
	
	private void load() //Load files
	{
		load = false; //Stop the game from loading multiple times
	}
}
