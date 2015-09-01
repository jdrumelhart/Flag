import java.awt.*;
import javax.swing.*;

public class FlagComponent extends JComponent {
	private Dimension d;
	private final Color OGRED = new Color(0xBB133E);
	private final Color OGBLUE = new Color(0x002664);
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
	 * NOTE: look up OG colors red and blue and implement them
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		//Sets the d object to the current size of the window
		d.setSize(getWidth(), getHeight());
		int scalar = 0;
		if(d.getHeight() > (d.getWidth() / 1.9)) {
			scalar = (int) (d.getWidth() / 1.9);
		}
		else {
			scalar = (int) d.getHeight();
		}
		g.setColor(Color.WHITE);
		//Creates the white background
		g.fillRect(0,0,(int)(scalar * 1.9), scalar);
		g.setColor(OGRED);
		//Creates red stripes
		for(int i = 0; i <= 6; i++) {
			g.fillRect(0,(int) ((2 * i * scalar + 1)/13), (int)(scalar * 1.9), (int) (scalar/13));
		}
		//Creates the blue Union in the upper corner
		g.setColor(OGBLUE);
		g.fillRect(0,0,(int)(scalar * 0.76), (int) ((scalar/13) * 7));
	}
}