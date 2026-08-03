import java.util.*; 

public class BubbleSort { 
    public static void main(String[] args){ 

        // Declaração de variáveis 
        Scanner scan = new Scanner(System.in); 
        int vetor[] = new int[7]; 

        
        // Entrada de dados 
        for (int i = 0; i < vetor.length; i++){ 
            System.out.print("Valor da posição " + (i + 1) + ": " ); 
            vetor[i] = scan.nextInt(); 
        }

        scan.close(); 

        boolean continuar; 

        // Enquanto há elementos para serem modificados (continuar = true) o laço continua 
        do { 
            
            continuar = false; 

            for (int i = 0; i < vetor.length - 1 ; i ++ ){ 
                
                if (vetor[i] > vetor [i + 1]){
                    
                    int temp = vetor [i]; 
                    vetor[i] = vetor[i + 1]; 
                    vetor [i + 1] = temp; 

                    // Quando um elemento é trocado "continuar" = true 
                    continuar = true; 

                }
            }

        
        } while (continuar); 

        // Saída de dados 
        for (int i = 0; i < vetor.length; i++){ 
            System.out.println(vetor[i]); 
        }

    }
}