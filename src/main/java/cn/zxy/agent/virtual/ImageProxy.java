package cn.zxy.agent.virtual;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author Silence 000996
 * @data 17/6/30
 */
public class ImageProxy implements Icon {
    ImageIcon imageIcon;
    URL imageURL;
    Thread thread;
    boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if(imageIcon != null){
            imageIcon.paintIcon(c, g, x, y);
        }else{
            g.drawString("image loading....",x,y);
            if(!retrieving){
                retrieving = true;
                thread = new Thread(){
                    @Override
                    public void run() {
                        imageIcon = new ImageIcon(imageURL,"CD COVER");
                        c.repaint();
                    }
                };

                thread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null){
            return imageIcon.getIconHeight();
        }
        return 400;
    }

}
