/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol5;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class Bol5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        Conta ing = new Conta();

        System.out.println("Teclee o nome, o nº da conta e o saldo, respectivamente: ");
        ing.setNomeCliente(sc.nextLine());
        ing.setNConta(sc.nextLine());
        ing.setSaldo(sc.nextInt());

        ing.Amosar();

        System.out.println("Cantidade a ingresar: ");
        ing.Ingreso(sc.nextInt());
        System.out.println("CaAntidade de reintegro: ");
        ing.Reintegro(sc.nextInt());

        Conta abanca = new Conta();

        System.out.println("Teclee o importe a tranferir á conta abanca: ");
        ing.Transferencia(abanca, sc.nextInt());

    }

}
