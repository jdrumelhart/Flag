import java.awt.*;
import javax.swing.JFrame;

public class FlagFrame extends JFrame {
	public Dimension d = new Dimension();
	
	//constructor
	public FlagFrame () {
		d.setSize(700, 600);
		init(d);	
	}
	
	//Creating background as white
	public void init(Dimension d) {
		setSize(d);
		repaint();
	}
}