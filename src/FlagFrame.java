import java.awt.*;
import javax.swing.JFrame;

public class FlagFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	public Dimension d = new Dimension();
	
	//constructor
	public FlagFrame () {
		d.setSize((int)(1.9 * 700), 700);
		init(d);	
	}
	
	/**
	 * creates the window
	 * @param d is dimension object
	 */
	public void init(Dimension d) {
		setSize(d);
		repaint();
	}
}