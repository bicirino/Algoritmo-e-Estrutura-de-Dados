import java.util.*; 

public class BuscaBinaria{ 
    public static void main(String[] args){ 
        
        // Declaração de variáveis e criação do vetor
        Scanner scan = new Scanner(System.in); 
        int vetor[] = new int[1000000]; 
        
        for (int i = 0; i < vetor.length; i++){ 
            vetor[i] = i; 
        }

        int parametro_pesquisa = 0; 

        // Pesquisa 
        do { 
            System.out.print("\nDigite o parametro de pesquisa (-1 para sair): "); 
            parametro_pesquisa = scan.nextInt(); 
            
            // Se o usuário digitar -1, sai do laço na mesma hora
            if (parametro_pesquisa == -1) {
                System.out.println("Encerrando...");
                break;
            }

            // As variáveis de controle precisam ser resetadas a CADA nova pesquisa
            int inicio = 0; 
            int fim = (vetor.length - 1); 
            int meio = ((inicio + fim) / 2); 
            int contador = 0; 
            boolean encontrado = false; // Flag para saber se achamos o elemento
            
            while (inicio <= fim){ 
                contador++; 
                
                if (parametro_pesquisa == vetor[meio]) {
                    
                    System.out.println("Elemento encontrado na posição: " + meio + " depois de " + contador + " tentativas."); 
                    encontrado = true;
                    break; 

                } else if (parametro_pesquisa < vetor[meio]){
                    fim = (meio - 1);  

                } else { 
                    inicio = (meio + 1); 
                }

                meio = ((inicio + fim) / 2); 
            }
            
            // Se o laço while terminar e não tiver encontrado
            if (!encontrado) {
                System.out.println("Elemento não encontrado no vetor.");
            }

        } while (parametro_pesquisa != -1); 

        scan.close(); 
    }
}