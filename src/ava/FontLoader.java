package ava;

import java.awt.Font;
import java.io.File;

public class FontLoader {
    public static void main(String[] args) {
        String rootPath = "c:/font/";

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
}