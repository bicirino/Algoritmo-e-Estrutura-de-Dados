import java.util.*; 

public class InversaoVetor { 
    public static void main(String[] args){ 

        // Criação do Scanner 
        Scanner scan = new Scanner(System.in); 

        // Criação do Vetor original 
        int VetorOriginal[] = new int[5]; 

        // Criação do Vetor invertido 
        int VetorInvertido[] = new int[5]; 

        // Preenchimento do vetor 
        for (int i = 0; i < VetorOriginal.length; i++){ 
            System.out.print("Digite o valor da posição " + i + ": "); 
            VetorOriginal[i] = scan.nextInt(); 
        }

        // Lógica de Inversão (Corrigido para usar V maiúsculo)
        for (int i = 0; i < VetorOriginal.length; i++){ 
            VetorInvertido[i] = VetorOriginal[VetorOriginal.length - 1 - i];
        }

        // Exibição do resultado
        System.out.println("\nVetor invertido:");
        for (int i = 0; i < VetorInvertido.length; i++){ 
            System.out.println(VetorInvertido[i]);
        }

        scan.close(); 
    }
}