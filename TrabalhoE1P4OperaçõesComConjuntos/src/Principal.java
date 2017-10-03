package com.doctum.occ;

public class Principal
{

    public static void main(String[] args)
    {
        
        int[] ConjuntoDeA = {1, 3, 5};
        int[] ConjuntoDeB = {8, 2};
        int[] ConjuntoDeC = new int[20];
        int[] ConjuntoDeD = new int[11];
        
        for(int i = 0 ; i < 20; i++){
            ConjuntoDeC[i]=i+1;
        }
        for(int i = 0 ; i < 11; i++){
            ConjuntoDeD[i]=i*10;
        }
        
        System.out.println("4 pertence a A: " + OperacaoComConjuntos.pertence(4,ConjuntoDeA));
        System.out.println("2 pertence a B : " + OperacaoComConjuntos.pertence(2,ConjuntoDeB));
        System.out.println("3 pertence a C: " + OperacaoComConjuntos.pertence(3,ConjuntoDeC));
        System.out.println("9 pertence a B: " + OperacaoComConjuntos.pertence(9,ConjuntoDeB));
        System.out.println("7 pertence a A: " + OperacaoComConjuntos.pertence(7,ConjuntoDeA));
        System.out.println("5 pertence a C: " + OperacaoComConjuntos.pertence(5,ConjuntoDeC));
        System.out.println("18 pertence a C: " + OperacaoComConjuntos.pertence(18,ConjuntoDeC));
        System.out.println("13 pertence a C: " + OperacaoComConjuntos.pertence(13,ConjuntoDeC));
        System.out.println("30 pertence a C: " + OperacaoComConjuntos.pertence(30,ConjuntoDeC));
        System.out.println("15 pertence a D: " + OperacaoComConjuntos.pertence(15,ConjuntoDeD));
        System.out.println("60 pertence a D: " + OperacaoComConjuntos.pertence(60,ConjuntoDeD));
        System.out.println("95 pertence a D: " + OperacaoComConjuntos.pertence(95,ConjuntoDeD));
    }
    
}