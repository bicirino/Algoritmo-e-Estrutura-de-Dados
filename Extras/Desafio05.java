import java.util.Stack;

public class Desafio05 {
    public static boolean estaoBalanceados(String s) {
        Stack<Character> pilha = new Stack<>();

        // Percorre cada caractere da String
        for (char c : s.toCharArray()) {
            // Se for abertura '(', adiciona na pilha
            if (c == '(') {
                pilha.push(c);
            } 
            // Se for fechamento ')'
            else if (c == ')') {
                // Se a pilha estiver vazia, há um ')' sem seu '(' correspondente
                if (pilha.isEmpty()) {
                    return false;
                }
                // Remove o '(' correspondente do topo da pilha
                pilha.pop();
            }
        }

        // Retorna true se todos os parênteses foram fechados (pilha vazia)
        // Retorna false se sobrou algum '(' sem fechar
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(estaoBalanceados("(())")); // true
        System.out.println(estaoBalanceados("())"));  // false
        System.out.println(estaoBalanceados(")("));   // false
        System.out.println(estaoBalanceados("((()")); // false
    }
}