package ava;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.*;
import javax.imageio.stream.ImageOutputStream;

public class TestImage {
	
	public static void main(String[] args) {
		JCanvas jc = new JCanvas();
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(400,200));
		jc.setSize(400, 200);
		BufferedImage img = jc.createImage(jc);
		jc.creerImage(img, "d:\\my.png");
		//GUIHelper.showOnFrame(jc,"test");

	}


	

	
}

