import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {

	public static void main(String[] args) {
		new DuelingButtons().createUI();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	static JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		// 1. Add the panel to the frame
		frame.add(panel);
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"

		leftButton.setText("click me");
		// 4. Set the text of the rightButton to "Click me!"

		rightButton.setText("No,click me");
		// 5. Add an action listener to the leftButton
		leftButton.addActionListener(this);
		// 6. Add an action listener to the rightButton
		rightButton.addActionListener(this);
		// 7. Add the leftButton to the panel

		panel.add(leftButton);
		// 8. Add the rightButton to the panel
		panel.add(rightButton);
		// 9. Pack the frame
		frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Demanding Buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		/* If the buttonPressed was the leftButton.... */
		// Set the text of the rightButton to "No, click Me!"
		;
		if (buttonPressed == leftButton) {

		
			rightButton.setText("No,click me");
			rightButton.setPreferredSize(BIG);
			rightButton.setText("click me");
			rightButton.setPreferredSize(SMALL);
		}
		


		// Set the PREFERRED size of the rightButton to BIG
	

		// Set the text of the leftButton to "Click Me!"

		

		// Set the PREFERRED size of the leftButton to SMALL
		
		
			
				
		/* If the buttonPressed was the rightButton, do the opposite. */
		;
		if (buttonPressed == rightButton) {

			leftButton.setText("No,click me");
		

		leftButton.setPreferredSize(BIG);
		leftButton.setText("click me");
		leftButton.setPreferredSize(SMALL);
		}
		frame.pack();
	}
}
