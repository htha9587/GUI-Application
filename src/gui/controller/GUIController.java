package gui.controller;

import gui.view.GUIView;
/**
 * Controller for Simple GUI App.
 * @author htha9587
 *11/09/15
 *Version 1.5
 */

public class GUIController 
{
	/**
	 * Reference to the GUIFrame or GUIView object of the view.
	 * Author: htha9587
	 * 11/09/15
	 */
	
	
	private GUIView baseFrame;
	
	public GUIController()
	{
		baseFrame = new GUIView(this);
	}
	
	public void start()
	{
	
	}
}
