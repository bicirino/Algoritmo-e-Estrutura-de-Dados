/* 

Regras do Desafio
    1.) Escreva o código completo do método em Java.
    2.) Explique brevemente a sua lógica antes ou depois do código.
    3.) Considere casos de borda (edge cases), como coleções vazias ou entradas nulas.

Problema: Verificador de Anagrama
    Escreva um método em Java que receba duas Strings e retorne true se elas forem anagramas uma da outra, e false caso contrário.
    
    Definição: Duas palavras são anagramas se contêm exatamente as mesmas letras com as mesmas frequências, ignorando a ordem.
    
    Exemplos
    Entrada: s1 = "listen", s2 = "silent" -> Saída: true
    Entrada: s1 = "rat", s2 = "car" -> Saída: false 
    
    (Ignore diferenças entre maiúsculas e minúsculas)
    
    Assinatura do MétodoJavapublic class Solucao {
    public static boolean ehAnagrama(String s1, String s2) {
        // Sua implementação aqui
    }
}


*/
import java.util.*; 



public class DesafioSimEntrevista {

    
    public static boolean isAnagram(String s1, String s2){ 

        // TRATAMENTOS DE EXCEÇÕES 
        if (s1 == null || s2 == null){ 
            return false; 
        }

        if (s1.length() != s2.length()){ 
            return false; 
        }

        // CAPITALIZAÇÃO (NORMALIZAÇÃO)
        s1 = s1.toLowerCase(); 
        s2 = s2.toLowerCase(); 

        // Contador das 26 letras do alfabeto 
        char array_s1[] = s1.toCharArray(); 
        char array_s2[] = s2.toCharArray(); 

        Arrays.sort(array_s1); 
        Arrays.sort(array_s2); 
        
        return Arrays.equals(array_s1, array_s2); 
    }


    public static void main(String[] args){ 

        Scanner scan = new Scanner(System.in); 

        System.out.print("Primeira palavra: "); 
        String s1 = scan.next(); 

        System.out.print("Segunda palavra: "); 
        String s2 = scan.next(); 

        boolean resultado = isAnagram(s1, s2); 
        System.out.println(resultado); 

        scan.close(); 
    }
    
}
