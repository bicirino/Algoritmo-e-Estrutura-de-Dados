/*
Inverção de Arrays 
*/

import java.util.*; 

public class Desafio01{ 
    public static void main(String[] args){ 

        Scanner scan = new Scanner(System.in); 

        int tamanho_vetor; 
        
        System.out.print("Digite o tamanho do vetor: "); 
        tamanho_vetor = scan.nextInt(); 
        
        int vetor[] = new int[tamanho_vetor]; 
        int vetor_invertido[] = new int[tamanho_vetor];  

        // Preenchimento do Array 
        for (int i = 0; i < tamanho_vetor; i++){ 
            System.out.print("\nDigite o elemento " + (i + 1) + " do vetor: "); 
            vetor[i] = scan.nextInt(); 
        }

        // Inversão do vetor 
        for (int i = 0; i < tamanho_vetor; i++){ 
            
            vetor_invertido[i] = vetor[tamanho_vetor - 1 - i]; 
            
        }

        System.out.println(); 
        
        // Impressão 
        for (int i = 0; i < vetor_invertido.length; i++){ 
            System.out.print(vetor_invertido[i] + " | "); 
        }

        scan.close(); 
    }
}

