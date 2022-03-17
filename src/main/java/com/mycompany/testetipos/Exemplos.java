package com.mycompany.testetipos;

import java.util.Scanner;

public class Exemplos {
    
    public static void main(String[] args) {
            
        //Exemplos declarações de variáveis
        int idade1 = 18;
        float salario1 = 1850.50f;
        char letra1 = 'W';
        boolean casado1 = true;

        //Exemplo em Typecast
        int idade2 = (int) 22;
        float salario2 = (float) 1950.50;
        char letra2 = (char) 'W';
        boolean casado2 = (boolean) false;

        //Exemplo em Wrapper Class
        Integer idade3 = new Integer(3);
        Float salario3 = new Float(1825.54);
        Character letra3 = new Character('S');
        Boolean casado3 = new Boolean(true);
        
        //Converter número inteiro para String
        //String valor = Integer.toString(idade);
        //int idade = Integer.parseInt(valor);
        
        System.out.println("#### Sistema de Gestão de Alunos ####");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite a idade do Aluno: ");
        int idade = teclado.nextInt();
        
        System.out.print("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();
        
        System.out.println("As informações foram salvas.");
        
        System.out.println("Deseja ler informações salvas?");
        System.out.print("Digite y ou n: ");

        
        System.out.format("A nota de %s é %.1f \n", nome , nota);
        
    }
       
}
