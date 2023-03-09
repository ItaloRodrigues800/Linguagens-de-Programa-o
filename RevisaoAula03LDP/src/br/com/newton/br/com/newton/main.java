package br.com.newton.br.com.newton;

import java.util.Scanner;
import br.com.newton.agenda;

public class Telefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contato contato = new Contato();

        System.out.print("Informe o nome do contato: ");
        String nome = sc.nextLine();
        contato.setNome(nome);

        System.out.print("Informe o número de telefone: ");
        String numero = sc.nextLine();
        if (numero.length() != 9) {
            System.out.println("Telefone inválido");
        } else {
            contato.setTelefone(numero);
            System.out.println("Contato adicionado com sucesso!");
        }
        sc.close();
    }
}