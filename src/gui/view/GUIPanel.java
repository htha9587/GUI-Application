package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import gui.controller.GUIController;
/**
 * 11/09/15
 * @author htha9587
 *
 */

public class GUIPanel extends JPanel
{

	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel (GUIController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Don't press me!");
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 1, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 194, SpringLayout.WEST, this);
		firstTextField = new JTextField("Type in here! ");
		
		
		setUpPanel();
		setUpLayout();
		setupListeners();
	}
	/**
	 * Loads content into panel.
	 */
	
	private void setUpPanel()
	{
		this.setLayout(baseLayout); //Needs to be setups first line/.
		this.add(firstButton);      
		this.add(firstTextField);
	}
	
	private void setUpLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 97, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 150, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
