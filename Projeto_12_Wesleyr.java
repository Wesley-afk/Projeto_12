/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_wesleyr;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Projeto_12_Wesleyr {
    
    
   public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
     String nome = "";
     String nome_2 = "";
    
    
    System.out.println("Jogador 1, digite seu nome!");
     nome = ler.nextLine();
    
    System.out.println("Jogador 2, digite seu nome!");
     nome_2 = ler.nextLine();
     
    jogador_um(nome);
    jogador_dois(nome_2);
  }
   
   
   public static void jogador_um(String nome){
     Scanner ler = new Scanner(System.in);  
         
      String nome_filme = "";
      String []dicas;
      dicas = new String[5];
            
       System.out.println("\n" + nome + "!" + " , Digite o nome do filme!");
        nome_filme = ler.nextLine();

        
       for (int i = 0; i < 5; i++) {
           System.out.println("Digite agora dicas relacionadas ao filme! ");
           dicas[i] = ler.nextLine();
       }
       
       jogador_dois(nome_filme);
   }
   
   
   public static void jogador_dois(String nome_filme){
       Scanner ler = new Scanner(System.in); 
       
        int tentativa = 0;
        String filme_jogador2 = "";
        boolean autenticador = false;
       
       while(tentativa < 5 & autenticador == false){
         System.out.println(tentativa);
         
          System.out.println("Aqui está a sua dica " + (dicas[tentativa]) + "!");
          
           System.out.println("\n Qual é o filme?");
           filme_jogador2 = ler.nextLine();
             
           
           if(filme_jogador2 != nome_filme){
               tentativa = tentativa - 1;
                  System.out.println("Meus parabéns! Você errou!");
                     System.out.println("Tentativas = " + tentativa);   
           }
           
           else{
               System.out.println("Você ganhou!");
               autenticador = true;
           }  
       }
   }
}
