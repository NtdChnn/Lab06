/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise03;

import java.util.Scanner;

/**
 *
 * @author notda
 */
public class Ex03 {
    public static void main(String[] args) {
        Queue Ex03 = new Queue();
        
        for(int i = 0; i < 20; i++)
        {
//            System.out.print("Enter Queue : ");
//            Scanner queueInput = new Scanner(System.in);
//            Ex03.addQueue(queueInput.nextInt());            
            Ex03.addQueue(i+1);
        }
        
        Ex03.showQueue();
        
        for(int i = 0; i < 20 ; i++)
        {
            Ex03.deQueue();
        }
        
        Ex03.showQueue();
    }
}
