package ava;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class JCanvas extends JPanel {
	
	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.fillRect(10,10,80,80);
		g.setColor(Color.BLUE);
		g.fillOval(150,50,80,80);
		g.setColor(c);
	}
	
	public BufferedImage createImage(JCanvas jc) {

	    int w = jc.getWidth();
	    int h = jc.getHeight();
	    BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
	    Graphics2D g = bi.createGraphics();
	    jc.paint(g);
	    return bi;
	}
	
	public void creerImage(BufferedImage pict, String url){
		File file = new File(url);
		//file.createNewFile();
		try {
			ImageIO.write(pict, "png", file);

   		} catch( IOException e2 ) {	e2.printStackTrace(); }
 
    }

}