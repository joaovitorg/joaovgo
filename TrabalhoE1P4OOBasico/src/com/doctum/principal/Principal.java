package com.doctum.principal;

import com.doctum.oo.Compra;
import com.doctum.oo.Cachorro;
import com.doctum.oo.Retangulo;
import com.doctum.oo.Pessoa;

public class Principal
{

    public static void main(String[] args)
    {    
        
        Compra co1 = new Compra(10000,20);
        
        System.out.println("~~ Compra ~~");
        System.out.println("Valor total da compra realizada: " + co1.getValorTotal());
        System.out.println("Numero total de parcelas: " + co1.getNumeroParcelas());
        System.out.println("Valor total das parcelas: " + co1.valorParcela() + "\n");
        
        Cachorro c1 = new Cachorro("Apolo", 0.45);
        
        System.out.println("~~ Cachorro ~~");
        System.out.println("Nome do animal: " + c1.getNome());
        System.out.println("Tamanho do animal: " + c1.getTamanho());
        c1.brincar();
        c1.latir();
        System.out.println("Numero de cachorro(s) criado(s) " + Cachorro.mostrarQuantidade() + "\n" );

        Retangulo r1 = new Retangulo(80,180);
        
        System.out.println("~~ Retangulo ~~");
        System.out.println("Base para o retangulo: " + r1.getBase());
        System.out.println("Altura para o retangulo: " + r1.getAltura());
        System.out.println("Area para o retangulo: " + r1.area());
        System.out.println("Perimetro para o retangulo: " + r1.perimetro());
        System.out.println("E um quadrado? " + r1.eQuadrado() + "\n");
        
        
        Pessoa p1 = new Pessoa("Joao Vitor Graciano",1.74, 74, 26, 12, 1996);
        
        System.out.println("~~ Pessoa ~~");
        System.out.println("Seu nome: " + p1.getNome());
        System.out.println("Sua altura: " + p1.getAltura());
        System.out.println("Seu peso: " + p1.getPeso());
        System.out.println("Sua idade: " + p1.idade());
        System.out.println("Grau de IMC: " + p1.imc());
    }    
}
