/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlab1;

/**
 *
 * @author Chris
 */
public class QLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random rand=new Random();
       Frame f=new Frame();
        f.setVisible(true);
        f.pack();
        f.setLocation(rand.nextInt(200), rand.nextInt(500));
    }
    
}
