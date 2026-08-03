import java.util.*; 

public class BuscaExaustiva{ 
    public static void main(String[] args){ 

        // Declaração de variáveis 
        Scanner scan = new Scanner(System.in); 
        int vetor[] = new int[1000000]; 
        int parametro_pesquisa = 0;


        // Construção do vetor 
        for (int i = 0; i < vetor.length; i++){ 
            vetor[i] = (int) (vetor.length * Math.random()); 
        } 

        // Pesquisas 
        do { 

        } while (parametro_pesquisa != -1); 

        scan.close(); 
    }
}