import java.util.*; 

public class BuscaBinaria{ 
    public static void main(String[] args){ 
        
        // Declaração de variáveis 
        Scanner scan = new Scanner(System.in); 
        int vetor[] = new int[1000000]; 
        
        int inicio = 0; 
        int meio = ((inicio + fim ) / 2); 
        int fim = (vetor.length - 1); 

        int contador = 0; 
        int parametro_pesquisa = 0; 

        for (int i = 0; i < vetor.length; i++){ 
            vetor[i] = i; 
        }

        // Pesquisa 
        do { 
            System.out.print("Digite o parametro de pesquisa: "); 
            parametro_pesquisa = scan.nextInt(); 

            
            while (inicio <= fim){ 
                contador++; 
                
                if (parametro_pesquisa == vetor[meio]) {
                    System.out.println("Elemento encontrado. Na posição: " + i + "depois de " + contador + " tentativas"); 
                    
                    break; 

                }else if (parametro_pesquisa < vetor[meio]){
                    fim = (meio - 1);  

                }else{ 
                    inicio = (meio + 1); 
                }

                meio = ((inicio + fim) / 2); 
 
            }
            

        } while (parametro_pesquisa != -1); 

        scan.close(); 
    }
}