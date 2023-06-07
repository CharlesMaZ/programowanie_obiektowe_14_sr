package org.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageProcessor {
    BufferedImage image;
    int height, width;

    public void loadImage(String path) throws IOException {
        File file = new File(path);
        image = ImageIO.read(file);
        height = image.getHeight();
        width = image.getWidth();
    }

    public void saveImage(String path) throws IOException {
        ImageIO.write(image, "png", new File(path));
    }

    public int getPixelAfterBright(int oldColor, int factor) {
        return 0;
    }

    public void setBrightness(int factor) {

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                Color color = new Color(image.getRGB(x,y));

                int red = color.getRed() + factor;
                int green = color.getGreen() + factor;
                int blue = color.getBlue() + factor;

                red = Math.max(0, Math.min(255, red));
                green = Math.max(0, Math.min(255, green));
                blue = Math.max(0, Math.min(255, blue));

                Color newColor = new Color(red, green, blue);
                image.setRGB(x, y, newColor.getRGB());

            }
        }
    }

}
