import java.awt.*;
import javax.swing.*;
import java.math.*;

public class FlagComponent extends JComponent {
	private Dimension d;
	//Custom colors for flag
	private final Color OGRED = new Color(0xBB133E);
	private final Color OGBLUE = new Color(0x002664);
	//Default constructor
	FlagComponent() {
		d = new Dimension();
	}
	
	/**
	 * Custom constructor
	 * @param a
	 */
	FlagComponent(Dimension a) {
		d = a;
	}
	
	/**
	 * paint method called whenever window is resized
	 * draws images on screen
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 * @param g Graphics object
	 **/
	public void paint(Graphics g) {
		//Sets the d object to the current size of the window
		d.setSize(getWidth(), getHeight());
		/*
		 * Creates a scalar
		 * Will scale with the height or width depending on 
		 * the ratios of the window sizes
		 */
		double scalar = 0;
		if(d.getHeight() > (d.getWidth() / 1.9)) {
			scalar = (d.getWidth() / 1.9);
		}
		else {
			scalar = d.getHeight();
		}
		g.setColor(Color.WHITE);
		//Creates the white background
		g.fillRect(0,0,(int)Math.round(scalar * 1.9), (int)Math.round(scalar));
		g.setColor(OGRED);
		//Creates red stripes
		for(int i = 0; i <= 6; i++) {
			g.fillRect(0, (int) Math.round((2 * i * scalar + 1)/13), (int)Math.round(scalar * 1.9), (int) Math.round(scalar/13));
		}
		//Creates the blue Union in the upper corner
		g.setColor(OGBLUE);
		g.fillRect(0,0,(int)Math.round(scalar * 0.76), (int)Math.round ((scalar/13) * 7));
		/*
		 * Creates the stars on the Union
		 */
		g.setColor(Color.WHITE);
		double[] centerX = new double[99];
		double[] centerY = new double[99];
		int c1 = 0;
		int c2 = 0;
		//Creates the X values for the centers of the stars
		double diameter = scalar * 0.0616;
		for(int i = 1; i < 10; i++) {
			for(int j = 0; j < 11; j++) {
				centerY[c1] = (i) * scalar * 0.054;
				c1++;
			}
		}
		//Creates the Y values for the centers of the stars
		for(int i = 0; i < 9; i++) {
			for(int j = 1; j < 12; j++) {
				centerX[c2] = (j) * scalar * 0.063;
				c2++;
			}
		}
		//Draws the stars
		double currentX = 0;
		double currentY = 0;
		for(int i = 0; i < 99; i+=2) {
			currentX = centerX[i];
			currentY = centerY[i];
			double[] arrayX = {};
			double[] arrayY = {};
			//g.fillPolygon(arrayX[], arrayY[], 10);
			g.fillOval((int)currentX, (int)currentY, 10,10);
		}
	}
}