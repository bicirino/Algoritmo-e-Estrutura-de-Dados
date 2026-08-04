/* 
    Verifique se uma String é um palíndromo, considerando apenas caracteres alfanuméricos e ignorando maiúsculas/minúsculas.
    
    Um palíndromo é qualquer palavra, frase ou número que se lê da mesma forma tanto da esquerda para a direita quanto da direita para a esquerda

*/ 

import java.util.*; 

public class Desafio02{ 
    public static void main(String[] args){ 

        // --- DECLARAÇÃO DE VARIÁVEIS --- 
        Scanner scan = new Scanner(System.in); 
        String palavra;
        String palavra_invertida; 

        System.out.println("Digite a palavra a ser analisada"); 
        System.out.print("/t-> ");
        palavra = scan.nextLine(); 

        for (int i = palavra.length() - 1; i >= 0; i-- ){ 
            
            palavra_invertida += palavra.charAt(i); 
            // O método charAt() serve para obter um caractere específico de uma String usando seu índice (posição).
        }

        scan.close(); 

        System.out.println(palavra_invertida);       
    }
}