package Qlab1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame { 
    Frame(){ 
        Random rand=new Random(); 
        Toolkit tk=Toolkit.getDefaultToolkit(); 
        Dimension d=tk.getScreenSize(); 
        setDefaultCloseOperation(Frame.EXIT_ON_CLOSE); 
        setTitle("QLab_1"); 
        int random1=rand.nextInt(d.width); 
        int random2=rand.nextInt(d.height); 
        int random3=rand.nextInt(d.width-random1); 
        int random4=rand.nextInt(d.height-random2); 
        setSize(random1,random2); 
        setLocation(random3,random4); 
        
        JLabel label = new JLabel(" Software Engineering");
        if(random1/10 <= (2*random2)/3){
            label.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, random1/10));
        }else{
            label.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, (2*random2)/3));            
        }
        label.setForeground(Color.red);
        getContentPane().add(label);
    } 
}