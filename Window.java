package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;
/**
 *
 * @author Wróbel
 */
public class Window extends Canvas
{

    private static final long serialVersionUID = 0L;

    public Window(int width, int height, String title, Game game){
        JFrame frame = new JFrame(title);
        
        frame.setPreferredSize(new Dimension(width,height));
        frame.setMaximumSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width,height));
        
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);
        game.start();
    }

    
    
    
  
   
}
