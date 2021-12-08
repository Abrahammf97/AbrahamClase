/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp1.tictac;

/**
 *
 * @author 34640
 */
public class Tic extends Thread{
    private int hilo;

    public Tic(int hilo) {
        this.hilo = hilo;
    }

    @Override
    public void run() {
        while (true) {
            
            try {
                System.out.println("TIC");
                sleep(1000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            
        }
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

    
}
