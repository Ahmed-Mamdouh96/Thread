/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadclassmain;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class SecondTh extends Thread{
    
    public void run() {
         for (int i =0 ;i<10;i++ )
            System.out.println(" Second Thread is running ");
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(SecondTh.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
