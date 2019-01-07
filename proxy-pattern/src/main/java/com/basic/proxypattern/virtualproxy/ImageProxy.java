package com.basic.proxypattern.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * locate com.basic.proxypattern.virtualproxy
 * Created by MasterTj on 2019/1/7.
 */
public class ImageProxy implements Icon {
    private ImageIcon imageIcon;

    private URL url;

    private Thread retrievalThread;

    private boolean retrieving = false;

    public ImageProxy(URL url) {
        this.url = url;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if(imageIcon!=null){
            imageIcon.paintIcon(c,g,x,y);
        }else {
            g.drawString("Loading CD cover , pleas wait...",x+300,y+190);
            if(!retrieving){
                retrieving=true;
                retrievalThread=new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            imageIcon=new ImageIcon(url, "CD cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        }else
            return 800;
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null){
            return imageIcon.getIconHeight();
        }else
            return 600;
    }
}
