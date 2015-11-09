package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;
/**
 * Creates JFrame for Simple GUI App.
 * Version 1.2
 * @author htha9587
 *11/09/15 Added reference to GUIPanel.
 */


public class GUIView extends JFrame
{
	
	private GUIController baseFrame;
	private GUIPanel basePanel;
	
	public GUIView(GUIController baseFrame)
	{
		this.baseFrame = baseFrame; // Assign parameter to data member.
		basePanel = new GUIPanel(baseFrame); // Creates instance of GUIPanel with reference to controller.
		setUpFrame();
	}
	
	private void setUpFrame()
	{
		this.setContentPane(basePanel);   // Required panel set for GUIFrame.
		this.setResizable(false);  // A good idea, but not needed.
		this.setSize(400,400);     //Sets the size.
		this.setVisible(true);     //Must be last line in setUpFrame method.
	}
}
