import java.awt.*;
import javax.swing.JFrame;

public class FlagFrame extends JFrame {
	public Dimension d = new Dimension();
	
	//constructor
	public FlagFrame () {
		d.setSize((int)(1.9 * 700), 700);
		init(d);	
	}
	
	//Creating window
	public void init(Dimension d) {
		setSize(d);
		repaint();
	}
}