/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp1.tictac;

/**
 *
 * @author 34640
 */
public class Tac extends Thread{
    private int hilo;

    public Tac(int hilo) {
        this.hilo = hilo;
    }

    @Override
    public void run() {
        while (true) {
            
            try {
                System.out.println("TAC");
                sleep(1000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            
        }
    
}
}
