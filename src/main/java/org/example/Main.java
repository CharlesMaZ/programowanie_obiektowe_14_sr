package org.example;

import java.awt.*;
import java.io.IOException;

public class Main {



//    int color = image.getRGB(0,0);
//
//    int r = (color >> 16) & 0xFF;
//    int g = (color >> 8) & 0xFF;
//    int b = color & 0xFF;
//
//    r += 100;
//    g += 100;
//    b += 100;
//
//    int result = (r << 16) | (g << 8) | b;
//
//        image.setRGB(0,0,result);
//
//    Color color1 = new Color(color);
//        color1.getRed();
//        new Color(color1.getRed(), color1.getGreen(), color1.getBlue());


    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        String path = "C:\\Users\\student\\Projects\\lab13\\programowanie_obiektowe_14_sr\\R.jpg";
        String path2 = "C:\\Users\\student\\Projects\\lab13\\programowanie_obiektowe_14_sr\\R2.png";
        ImageProcessor imageProcessor = new ImageProcessor();
        imageProcessor.loadImage(path);
        imageProcessor.setBrightness(50);
        imageProcessor.saveImage(path2);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}