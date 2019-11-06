/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol5;

/**
 *
 * @author Josemolamazo
 */
public class Conta {

    private String nomeCliente;
    private String nConta;
    private double saldo;

    public Conta() {

    }

    public Conta(String nome, String nC, double sal) {
        nomeCliente = nome;
        nConta = nC;
        saldo = sal;
    }

    public void setNomeCliente(String nome) {
        nomeCliente = nome;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNConta(String nC) {
        nConta = nC;
    }

    public String getNConta() {
        return nConta;
    }

    public void setSaldo(double sal) {
        saldo = sal;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean Ingreso(double sal) {
        if (sal > 0) {
            System.out.println("A cantidade despois do ingreso: " + (saldo += sal));
            return true;
        } else {
            return false;
        }
    }

    public boolean Reintegro(double sal) {
        if (sal < saldo) {
            System.out.println("Cantidade despois do reintegro: " + (saldo -= sal));
            return true;
        } else {
            return false;
        }
    }

    public void Amosar() {
        System.out.println("Nome do cliente: " + nomeCliente + "\tNº da conta: " + nConta + "\tSaldo: " + saldo);
    }

    public void Transferencia(Conta abanca, int importe) {
        Reintegro(importe);
        abanca.Ingreso(importe);
    }
}
