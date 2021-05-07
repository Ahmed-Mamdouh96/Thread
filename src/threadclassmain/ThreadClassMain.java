/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadclassmain;

/**
 *
 * @author lenovo
 */
public class ThreadClassMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            FirstTh thread1 = new FirstTh();
            SecondTh thread2 = new SecondTh();
            

            thread1.start();
            

            thread2.start();

            

    
}
}
