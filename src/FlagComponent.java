import java.awt.*;
import javax.swing.*;

public class FlagComponent extends JComponent {
	private Dimension d;
	
	//Default constructor
	FlagComponent() {
		d = new Dimension();
	}
	
	//Additional constructor
	FlagComponent(Dimension a) {
		d = a;
	}
	
	/*
	 * paint method called whenever window is resized
	 * draws images on screen
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		//Sets the d object to the current size of the window
		d.setSize(getWidth(), getHeight());
		g.setColor(Color.WHITE);
		//Creates the white background
		g.fillRect(0,0,(int)(d.getHeight() * 1.9),(int) d.getHeight());
		g.setColor(Color.RED);
		//Creates red stripes
		for(int i = 0; i <= 6; i++) {
			g.fillRect(0,(int) ((2 * i * d.getHeight() + 1)/13), (int)(d.getHeight() * 1.9), (int) (d.getHeight()/13));
		}
		//Creates the blue Union in the upper corner
		g.setColor(Color.BLUE);
		g.fillRect(0,0,(int)(d.getHeight() * 0.76), (int) ((d.getHeight()/13) * 7));
	}
}