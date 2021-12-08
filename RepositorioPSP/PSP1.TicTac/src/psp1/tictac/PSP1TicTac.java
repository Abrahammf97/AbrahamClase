/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package psp1.tictac;

/**
 *
 * @author 34640
 */
public class PSP1TicTac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tic tic= new Tic(4);
        Tac tac= new Tac(2);
        tic.start();
        tac.start();
    }
    
}
