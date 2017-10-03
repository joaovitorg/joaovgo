/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doctum.oo;

public class Retangulo {
    
    private int base;
    private int altura;
    
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

     public boolean eQuadrado(){
        return altura == base;
    }
    
    public int perimetro(){
        return 2*base + 2*altura;
    }
    
    public int area(){
        return base*altura;
    }
}