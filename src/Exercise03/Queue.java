/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise03;

/**
 *
 * @author notda
 */
public class Queue {
    int[] queue;
    private int currentQueue;
    private boolean havequeue;
    Queue()
    {
        queue = new int[8];
        currentQueue = 0;
        havequeue = false;
    }
    
    public void addQueue(int newQueue)
    {
        if(currentQueue <= queue.length)
        {
            int[] x = new int[queue.length*2];
            System.arraycopy(queue, 0, x, 0, queue.length);
            queue = x;
        }       
        queue[currentQueue] = newQueue;
        currentQueue++;
        System.out.println("Add Queue Complete");
    }
    
    public void deQueue()
    {
        for(int i = 0; i < currentQueue; i++)
        {
            queue[i] = queue[i+1];
        }
        queue[currentQueue] = 0;
        System.out.println("DeQueue Complete");
    }
    
    public void empty()
    {
        queue = new int[8];
        currentQueue = 0;
    }
    
    public void showQueue()
    {
        System.out.println("Now Showing Queue");
        
        for(int i = 0; i < currentQueue ; i++)
        {
            if(queue[i] != 0)
            {
                havequeue = true;
                System.out.print(queue[i] + " ");
            }
        }        
        System.out.println("");       
        if(havequeue == false)
        {
            System.out.println("Queue is Empty");
        }
        
        havequeue = false;
    }
    
    public int getSize()
    {
        return currentQueue;
    }
}
