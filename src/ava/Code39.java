package ava;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Code39 {
	
	public static void main(String[] args) throws IOException  {
		run("ASCFI123456789", "C:\\Users\\ABL\\Desktop\\test_cab");
		
	}
	
	public static void run(String txt, String path) throws IOException  {
		JCanvas jc = new JCanvas();
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(500,200));
		jc.setSize(500, 200);
		jc.setText(txt);
		BufferedImage img = jc.createBufferedImage(jc);
		jc.creerImage(img, path+"\\"+txt+".png");
		GUIHelper.showOnFrame(jc,"test");
	}

}