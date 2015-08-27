import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		//Creates a new flag
		FlagFrame c = new FlagFrame();
		final FlagComponent d = new FlagComponent(c.d);
		c.getContentPane().setLayout(new BorderLayout());
		c.getContentPane().add(d, BorderLayout.CENTER);
		//Exits the application when the window is closed
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
	}
}