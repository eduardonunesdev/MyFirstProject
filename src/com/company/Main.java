package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja abrir uma conta?");
        String x = sc.next();
        if (x == "SIM") {
            Conta conta = new Conta();
            conta.codConta = sc.nextInt();
            conta.nomeConta = sc.next();
            conta.saldo = sc.nextDouble();

        } else {
            System.out.println("Erro!");


            sc.close();
        }
    }
}
