import java.awt.*;
import javax.swing.*;

public class FlagComponent extends JComponent {
	private Dimension d;
	
	FlagComponent() {
		d = new Dimension();
	}
	
	FlagComponent(Dimension a) {
		d = a;
	}
	
	public void paint(Graphics g) {
		d.setSize(getWidth(), getHeight());
		g.setColor(Color.WHITE);
		g.fillRect(0,0,(int)(d.getHeight() * 1.9),(int) d.getHeight());
		g.setColor(Color.RED);
		for(int i = 0; i <= 6; i++) {
			g.fillRect(0,(int) ((2 * i * d.getHeight() + 1)/13), (int)(d.getHeight() * 1.9), (int) (d.getHeight()/13));
		}
		g.setColor(Color.BLUE);
		g.fillRect(0,0,(int)(d.getHeight() * 0.76), (int) ((d.getHeight()/13) * 7));
	}
}