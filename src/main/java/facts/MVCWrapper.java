package facts;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MVCWrapper extends JFrame implements ActionListener{

	// JFrame objects can be accessed by controller and view
	static JButton factButton = new JButton("New Fact!");
	
	static JTextField factField = new JTextField("Fact");
	
	static String factString = new String();
	

	// Model View Controller Objects
	static Controller modelController;
	
	static Model modelFact;
	
	static View modelView;

	
	public static void main(String[] args) {

		// Instantiate MVC
		modelController = new Controller();
		
		modelFact = new Model();
		
		modelView  = new View();

		modelController.setModel(modelFact);
		
		modelController.setView(modelView);

        // Run GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        	
            public void run() {
            	MVCWrapper myWrapper = new MVCWrapper();
            	
            }
        });		
        
	} 	
	
	
	MVCWrapper(){
		
		// Instantiate JFrame
		JFrame frame = new JFrame("Facts GUI Frame");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		// JFrame attributes
		frame.setLayout(new BorderLayout());
		
		factButton.addActionListener(this);
		
		factField.setEditable(true);
		
		frame.setSize(600,110);
		
		frame.setVisible(true);

		
		// Wrapper Panel 
		JPanel factWrapperPanel = new JPanel(new BorderLayout());
		
		factWrapperPanel.setPreferredSize(new Dimension(600,1));
		
		JPanel factFieldWrapperPanel = new JPanel (new BorderLayout());
		
		factFieldWrapperPanel.setPreferredSize(new Dimension(600, 50));
		
		factFieldWrapperPanel.add(factField, BorderLayout.CENTER);
		
		frame.add(factFieldWrapperPanel, BorderLayout.SOUTH);
		
		frame.add(factWrapperPanel, BorderLayout.CENTER);
		
		
		// Button Wrapper
		JPanel factButtonWrapperPanel = new JPanel (new BorderLayout());
		
		factButtonWrapperPanel.setPreferredSize(new Dimension(600, 50));
		
		factButtonWrapperPanel.add(factButton, BorderLayout.CENTER);
		
		frame.add(factButtonWrapperPanel, BorderLayout.NORTH);

		// Sizes contents to preferable size
		frame.pack();
		
	}
	

	// The User is able to click 
	public void actionPerformed (ActionEvent modelIN){

		// Display new fact
		if(modelIN.getSource() == factButton)
		{		
			
			// Controller Class: getRandomFact()
			modelController.getRandomFact();
		}
	
	}
   
}