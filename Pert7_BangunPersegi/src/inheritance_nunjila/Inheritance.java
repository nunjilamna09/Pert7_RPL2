/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_nunjila;

/**
 *
 * @author admin
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persegi persegi = new persegi(5.0);
        System.out.println("Luas persegi: " + persegi.Luas());

        // Membuat objek Cube (kubus)
        volumecube volumecube = new volumecube(4.0);
        System.out.println("luas cube: " + volumecube.Luas());
        System.out.println("Volume cube: " + volumecube.Volume());
    }
    
}
