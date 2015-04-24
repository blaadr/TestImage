package ava;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class JCanvas extends JPanel {
	
	/**
	 * 
	 */
	//private Font font;
	private String text;
	
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		Color c = g.getColor();
		
		this.loadFont(null);
		Font myCBFont = new Font("c39hrp48dhtt",0, 144);
		//Font myTextFont = new Font("Arial",0, 30);

		g.setColor(c);

		//mesure du canvas
		int height = this.getHeight();
		int width = this.getWidth();		

		//mesures de la font code barre
		FontMetrics metrics = g.getFontMetrics(myCBFont);
		int CBlineHeight = metrics.getHeight();
		int CBlineWidth = metrics.stringWidth(this.text);

		//this.setSize(CBlineWidth, CBlineHeight)	;
		
		//mesures de la font de texte
		//metrics = g.getFontMetrics(myTextFont);
		//int txtlineHeight = metrics.getHeight();
		//int txtlineWidth = metrics.stringWidth(this.text.replace("", " ").trim());
		
		//on dessine le code barre
		g.setColor(Color.black);
		g.setFont(myCBFont);
		g.drawString(this.text, ((width - CBlineWidth)/2), CBlineHeight+((height-CBlineHeight)/2)-15);
		
		//on dessine le texte dessous
		//g.setColor(Color.black);
		//g.setFont(myTextFont);
		//g.drawString(this.text.replace("", " ").trim(), ((width - txtlineWidth)/2), ((height-(CBlineHeight + txtlineHeight + 10))/2) + (CBlineHeight + txtlineHeight + 10) );
		
	}
	

	
	public void setText(String text) {
		this.text = "*" + text + "*";
		
	}

    public void loadFont(String[] args) {
        String rootPath = "test_graphics/src";

        File root = new File(rootPath);
        if (root.canRead()) {
            String[] fontFiles = root.list();

            Font font = null;
            for (String fontFile : fontFiles) {
                try {
                    System.out.println(fontFile);
                    font = Font.createFont(Font.TRUETYPE_FONT, new File(root
                            + "/" + fontFile));
                    System.out.println(font);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
	public BufferedImage createBufferedImage(JCanvas jc) {

	    int w = jc.getWidth();
	    int h = jc.getHeight();
	    BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g = bi.createGraphics();
	    g.setBackground(Color.WHITE);
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