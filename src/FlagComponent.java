import java.awt.*;
import javax.swing.*;
import java.math.*;

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
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		//Sets the d object to the current size of the window
		d.setSize(getWidth(), getHeight());
		double scalar = 0;
		if(d.getHeight() > (d.getWidth() / 1.9)) {
			scalar = (d.getWidth() / 1.9);
		}
		else {
			scalar = d.getHeight();
		}
		g.setColor(Color.WHITE);
		//Creates the white background
		g.fillRect(0,0,(int)(scalar * 1.9), (int)scalar);
		g.setColor(OGRED);
		//Creates red stripes
		for(int i = 0; i <= 6; i++) {
			g.fillRect(0,(int) ((2 * i * scalar + 1)/13), (int)(scalar * 1.9), (int) (scalar/13));
		}
		//Creates the blue Union in the upper corner
		g.setColor(OGBLUE);
		g.fillRect(0,0,(int)(scalar * 0.76), (int) ((scalar/13) * 7));
		g.setColor(Color.WHITE);
		/*
		double centerX = 0.063 * scalar;
		double centerY = 0.054 * scalar;
		int[] xPoints = new int[6];
		int[] yPoints = new int[6];
		xPoints[0] = (int)centerX;
		yPoints[0] = (int)(centerY - scalar * 0.0616);
		xPoints[1] = (int)(centerX + scalar * 0.0616 * Math.cos(Math.PI / 10));
		yPoints[1] = (int)(centerY - scalar * 0.0616 * Math.sin(Math.PI / 10));
		xPoints[2] = (int)(centerX + scalar * 0.0616 * Math.cos(3 * Math.PI / 10));
		yPoints[2] = (int)(centerY - scalar * 0.0616 * Math.sin(3 * Math.PI / 10));
		xPoints[3] = (int)(centerX - scalar * 0.0616 * Math.cos(3 * Math.PI / 10));
		yPoints[3] = (int)(centerY + scalar * 0.0616 * Math.sin(3 * Math.PI / 10));
		xPoints[4] = (int)(centerX + scalar * 0.0616 * Math.cos(Math.PI / 10));
		yPoints[4] = (int)(centerY - scalar * 0.0616 * Math.sin(Math.PI / 10));
		xPoints[5] = (int)centerX;
		yPoints[5] = (int)(centerY - scalar * 0.0616);
		g.fillPolygon(xPoints, yPoints, 4);
		*/
		double[] centerX = new double[99];
		double[] centerY = new double[99];
		int c1 = 0;
		int c2 = 0;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 11; j++) {
				centerY[c1] = (i) * scalar * 0.054;
				c1++;
			}
		}
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 11; j++) {
				centerX[c2] = (j) * scalar * 0.054;
				c2++;
			}
		}
		for(int i = 0; i < 99; i++) {
			System.out.println(centerY[i]);
			g.fillOval((int)centerX[i], (int)centerY[i], (int)10, (int)10);
		}
	}
}