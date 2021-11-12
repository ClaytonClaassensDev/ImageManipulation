package com.claassens.clayton;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        File file;
        BufferedImage myImage;

        try {

            String filePath = "src/com/claassens/clayton/images/20170405_195349.jpg";

            myImage = ImageIO.read(new File(filePath));

            int imageHeight = myImage.getHeight();
            int imageWidth = myImage.getWidth();

            Graphics2D graphics = (Graphics2D) myImage.getGraphics();

            for (int i = 0; i < imageHeight; i++) {

                for (int j = 0; j < imageWidth; j++) {

                    int pixel = myImage.getRGB(j, i);


                    Color color = new Color(pixel);

                    myImage.setRGB(j, i, 250);


                }
            }

            File output = new File("myEditedImage.jpg");
            ImageIO.write(myImage, "jpg", output);
            
            

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
