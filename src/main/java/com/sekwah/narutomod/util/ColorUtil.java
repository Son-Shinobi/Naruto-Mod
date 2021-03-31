package com.sekwah.narutomod.util;

import java.awt.*;

public class ColorUtil {

    public static Color recalculateHue(float hue, int brightness) {
        // check
        // http://stackoverflow.com/questions/25713206/calculate-hue-rotation-from-color-a-to-color-b
        double radiansHue = Math.toRadians(hue);
        int red = (int) (Math.sqrt(Math.cos(radiansHue)+1/2) * 255);
        int green = (int) (Math.sqrt(Math.cos(radiansHue-(Math.PI+1)/2)+1/2) * 255);
        int blue = (int) (Math.sqrt(Math.cos(radiansHue+(Math.PI+1)/2)+1/2) * 255);
        if(brightness > 50){
            float multiValue = (float) (brightness - 50) / 50f;
            red = (int) ((255 - red) * multiValue + red);
            green = (int) ((255 - green) * multiValue + green);
            blue = (int) ((255 - blue) * multiValue + blue);
        }
        else if(brightness < 50){
            float multiValue = (float) brightness / 50f;
            red *= multiValue;
            green *= multiValue;
            blue *= multiValue;
        }

        return new Color(red, green, blue);

    }

}