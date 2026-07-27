import java.util.Scanner; 

public class PreenchimentoVetor { 
    public static void main(String[] args){ 

        Scanner scan = new Scanner(System.in); 

        int Vetor[] = new int[5]; 

        
        for (int i = 0; i < Vetor.length; i++){ 
            System.out.print("Digite o valor da posição " + i + ": "); 
            Vetor[i] = scan.nextInt(); 
        }

       
        for (int j = 0; j < Vetor.length; j++){ 
            System.out.println(Vetor[j]); 
        }
    }
}