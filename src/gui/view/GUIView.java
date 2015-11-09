package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;
/**
 * Version 1.1
 * @author htha9587
 *11/09/15
 */


public class GUIView extends JFrame
{
	
	private GUIController baseFrame;
	
	public GUIView(GUIController baseFrame)
	{
		this.baseFrame = baseFrame; // Assign parameter to data member.
	}
}
