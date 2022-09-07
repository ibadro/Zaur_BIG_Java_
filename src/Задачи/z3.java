package Задачи;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
//Как с помощью java выполнить вывод на экран различных рисунков,состоящих из звездочек...?
public class z3 {
    public static void main(String[] args) {
        Font font = new Font(Font.MONOSPACED, Font.PLAIN, 10);
        int[][] array = getArray("I L N U R!!!!!!!!!!!!!!!", font);
        draw(array);
    }

    private static void draw(int[][] array) {
        for (int[] a : array) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] == 0 ? " " : "*");
            }
            System.out.println();
        }
    }

    private static int[][] getArray(String s, Font font) {
        FontMetrics metrics = new JLabel().getFontMetrics(font);
        int width = metrics.stringWidth(s);
        int height = metrics.getMaxAscent();
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bi.createGraphics();
        g2d.setFont(font);
        g2d.setColor(Color.black);
        g2d.drawString(s, 0, height);
        g2d.dispose();
        int[][] array = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = (bi.getRGB(j, i) != 0 ? 1 : 0);
            }
        }
        return array;
    }
}
