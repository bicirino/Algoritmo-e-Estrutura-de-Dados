/*

Desafio: Inverter uma Palavra Mantendo a Ordem das Frases

Cenário:Dada uma frase qualquer em Java, crie um método que inverta as letras de cada palavra individualmente,mas mantenha as palavras na ordem original em que aparecem na frase.
 
Você deve obrigatoriamente usar uma estrutura de Pilha (Stack<Character>) para realizar a inversão dos caracteres.
 
 Regras:
 
    Percorra a frase caractere por caractere.
    Empilhe cada letra até encontrar um espaço (ou o final da frase).
    Quando encontrar um espaço (ou o final), desempilhe todos os caracteres para formar a palavra invertida.
    Mantenha os espaços nos lugares originais.
    
Exemplos:
    
    "JAVA E DEMAIS" --> "AVAJ E SIAMED" 
    "ESTRUTURA DE DADOS" --> "ARUTURTSE ED SODAD"

*/ 

import java.util.*; 


public class Desafio04{ 

    public static String inverterPalavras (String frase){ 

        Stack<Character> pilha = new Stack<>(); 
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < frase.length(); i++ ){ 

            char c = frase.charAt(i); 

            if (c != ' '){ 
                pilha.push(c); 
            } 
            
            else{ 

                while (!pilha.isEmpty()){ 
                    resultado.append(pilha.pop()); 
                
                }

                resultado.append(' '); 
            }
        } 

        while (!pilha.isEmpty()){ 
            resultado.append(pilha.pop()); 

        }

        return resultado.toString(); 

    }

    public static void main (String[] args){ 
        System.out.println(inverterPalavras("JAVA É DEMAIS")); 
    }
}