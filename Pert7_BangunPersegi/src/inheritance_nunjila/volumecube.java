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
public class volumecube extends persegi {
    public volumecube(double sisi) {
        super(sisi);
    }

    public double Volume() {
        return sisi * sisi * sisi;
    }
} 