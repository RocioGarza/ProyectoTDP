package gui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class PanelConFondo  extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private Image imageOrg = null;
	private Image image = null;


	public PanelConFondo(final Image i) {
	    imageOrg = i;
	    image = i;
	}

	@Override
	public void paintComponent(final Graphics g) {
	    super.paintComponent(g);
	    if (image != null)
	        g.drawImage(image, 0, 0, null);
	}
}
