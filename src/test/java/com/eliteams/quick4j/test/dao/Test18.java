package com.eliteams.quick4j.test.dao;

import sun.plugin2.os.windows.Windows;

import java.awt.*;
import java.awt.image.MemoryImageSource;
import java.net.URL;

public class Test18 {
    public static void main(String[] args) {

        int[] pixels = new int[16 * 16];  //用int数组可以构建一个图片
        Image image = java.awt.Toolkit.getDefaultToolkit().createImage(new MemoryImageSource(16, 16, pixels, 0, 16));
        Cursor transparentCursor = java.awt.Toolkit.getDefaultToolkit().createCustomCursor(image, new Point(0, 0), "invisiblecursor"); //invisiblecursor是任意取的
        //setCursor(transparentCursor);

    }
}
