package com.doctum.bancodados;

public class ContaCorrente extends Conta
{    
    public ContaCorrente(int numero, String nome, double saldo)
    {       
        this.setNumero(numero);
        this.setNome(nome);
        this.setSaldo(saldo);
    }    
    
    public void depositar(double VDeposito)
    {
        if(VDeposito > 0){
            this.setSaldo(this.getSaldo()+ VDeposito);
            System.out.println("Efetuado com sucesso!");
        }
        else
        {
            System.out.println("Valor indisponivel!");
        }
    }
    public void sacar(double VSaque)
    {
        if(VSaque > 0)
        {
            if(VSaque <= this.getSaldo())
            {
                this.setSaldo(this.getSaldo()- VSaque);
                System.out.println("Efetuado com sucesso!");
            }
            else
            {
                System.out.println("Saque indisponivel!");
            }
        }
        else
        {
            System.out.println("Saque indisponivel!");
        }
    }
}