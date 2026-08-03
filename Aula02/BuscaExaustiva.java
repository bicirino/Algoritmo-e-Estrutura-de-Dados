import java.util.*; 

public class BuscaExaustiva { 
    public static void main(String[] args){ 

        Scanner scan = new Scanner(System.in); 
        int vetor[] = new int[1000000]; 
        int parametro_pesquisa = 0;

        // Construção do vetor 
        for (int i = 0; i < vetor.length; i++){ 
            vetor[i] = (int) (vetor.length * Math.random()); 
        } 

        // Pesquisas 
        do { 
            System.out.print("\nDigite um parametro de pesquisa (-1 para sair): "); 
            parametro_pesquisa = scan.nextInt(); 

            // Se for -1, encerra imediatamente sem buscar no vetor
            if (parametro_pesquisa == -1) {
                System.out.println("Programa encerrado.");
                break;
            }

            boolean encontrado = false;

            for (int i = 0; i < vetor.length; i++){ 
                if (parametro_pesquisa == vetor[i]){ 
                    System.out.println("Elemento encontrado na posição: " + i); 
                    encontrado = true; 
                    break; // Interrompe na primeira ocorrência
                }
            }

            // Avisa o usuário caso o valor não exista no vetor
            if (!encontrado) {
                System.out.println("Elemento NÃO encontrado no vetor.");
            }

        } while (parametro_pesquisa != -1); 

        scan.close(); 
    }
}