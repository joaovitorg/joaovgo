package com.doctum.bancodados;

public class Principal
{
    public static void main(String[] args)
    {
        ContaCorrente contacorrente1 = new ContaCorrente(1, "Joao Vitor Graciano", 10000);
        
        System.out.println("~~Conta corrente~: " + contacorrente1.getNumero() + ", " + contacorrente1.getNome());
        System.out.println("Saldo da conta: " + contacorrente1.getSaldo());
        contacorrente1.depositar(6000);
        System.out.println("Saldo da conta: " + contacorrente1.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrente contacorrente2 = new ContaCorrente(2, "Wevisky", 9000);
        
        System.out.println("~~Conta corrente: " + contacorrente2.getNumero() + ", " + contacorrente2.getNome());
        System.out.println("~~Saldo da conta: " + contacorrente2.getSaldo());
        contacorrente2.depositar(5600);
        System.out.println("~~Saldo da conta: " + contacorrente2.getSaldo());
        contacorrente2.sacar(2000);
        System.out.println("~~Saldo da conta: " + contacorrente2.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrente contacorrente3 = new ContaCorrente(3, "Josiane", 2000);
        
        System.out.println("~~Conta corrente: " + contacorrente3.getNumero() + ", " + contacorrente3.getNome());
        System.out.println("~~Saldo da conta: " + contacorrente3.getSaldo());
        contacorrente3.sacar(1500);
        System.out.println("~~Saldo da conta: " + contacorrente3.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrenteEspecial contacorrenteespecial1 = new ContaCorrenteEspecial(1, "Ernane", 25000, 900);
        
        System.out.println(contacorrenteespecial1.getLimite() + "~~Conta corrente especial: " + contacorrenteespecial1.getNumero() + ", " + contacorrenteespecial1.getNome() + ", Limite: ");
        System.out.println("~~Saldo da conta: " + contacorrenteespecial1.getSaldo());
        contacorrenteespecial1.depositar(3000);
        System.out.println("~~Saldo da conta: " + contacorrenteespecial1.getSaldo());
        contacorrenteespecial1.sacar(1100);
        System.out.println("~~Saldo da conta: " + contacorrenteespecial1.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrenteEspecial contacorrenteespecial2 = new ContaCorrenteEspecial(2, "Rafaella", 8000, 2000);
        
        System.out.println("~~Conta corrente especial: " + contacorrenteespecial2.getNumero() + ", " + contacorrenteespecial2.getNome() + ", Limite: " + contacorrenteespecial2.getLimite());
        System.out.println("~~Saldo da conta: " + contacorrenteespecial2.getSaldo());
        contacorrenteespecial2.depositar(3200);
        System.out.println("~~Saldo da conta: " + contacorrenteespecial2.getSaldo());
        contacorrenteespecial2.sacar(1200);
        System.out.println("~~Saldo da conta: " + contacorrenteespecial2.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrenteEspecial contacorrenteespecia13 = new ContaCorrenteEspecial(3, "Gabriel", 2000, 4000);
        
        System.out.println("~~Conta corrente especial: " + contacorrenteespecia13.getNumero() + ", " + contacorrenteespecia13.getNome() + ", Limite: " + contacorrenteespecia13.getLimite());
        System.out.println("~~Saldo da conta: " + contacorrenteespecia13.getSaldo());
        contacorrenteespecia13.depositar(200);
        System.out.println("~~Saldo da conta: " + contacorrenteespecia13.getSaldo());
        contacorrenteespecia13.sacar(50);
        System.out.println("~~Saldo da conta: " + contacorrenteespecia13.getSaldo());
        
        System.out.println("\n");     
    }    

    }
