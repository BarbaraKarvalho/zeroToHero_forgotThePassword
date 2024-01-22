package com.forgotThePassword;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //TODO: Percorrer mais de uma posição no array café, implementar para não deixar só na posição [0];
        //TODO: Geração de senha aleatória;
        //TODO: Opção de tentativa (melhorar a mensagem do usuário);

        String[] palavrasCafe = {"java", "latte", "mocha", "espresso", "cappuccino"};

        Random gerador = new Random();
        int posicaoCafe = gerador.nextInt(5);
        int numero = gerador.nextInt(10,99);
        String senha = palavrasCafe[posicaoCafe].substring(0,3) + numero;
        System.out.println("A senha para essa rodada é: " + senha);

        String senhaDoSistema = senha;
        String palavraChave = ""; //variavel string sem valor, atributo valor dentro do for
        boolean achou = false;

        for (int i = 0; i < palavrasCafe.length; i++) {
            palavraChave = palavrasCafe[i].substring(0, 3);

            for (int contador = 10; contador < 100; contador++) {
                String palavraCerta = palavraChave + contador;
                System.out.println("Tentando senha: " + palavraCerta);

                if (senhaDoSistema.equals(palavraCerta)) { //com numero ==, com string equals
                    System.out.println("Você conseguiu, a palavra chave é: " + palavraCerta);
                    achou = true;
                    break;
                }
            }
            if(achou == true){
                break;
            }
        }
    }
}
