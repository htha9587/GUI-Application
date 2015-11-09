package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;
/**
 * 11/09/15
 * @author htha9587
 *
 */

public class GUIPanel extends JPanel
{

	private GUIController baseController;
	
	public GUIPanel (GUIController baseController)
	{
		this.baseController = baseController;
	}
}
