package Aula04;

import Aula05.FilaDeBanco;

public class Principal {

    public static void main(String[] args) {
        testarFilaDeBanco();
        testarPilha();
    }

    private static void testarFilaDeBanco() {
        FilaDeBanco banco = new FilaDeBanco();

        // Inserindo pessoas na fila preferencial (false) e normal (true)
        banco.entrar(false, 101);
        banco.entrar(false, 102);
        banco.entrar(false, 103);
        banco.entrar(false, 104);

        banco.entrar(true, 1);
        banco.entrar(true, 2);

        // Atendimentos (deve chamar 3 preferenciais, depois 1 normal, e voltar para
        // preferencial)
        banco.atender(); // Saída esperada: 101
        banco.atender(); // Saída esperada: 102
        banco.atender(); // Saída esperada: 103
        banco.atender(); // Saída esperada: 1 (Chamou a normal após 3 preferenciais)
        banco.atender(); // Saída esperada: 104 (Volta para a preferencial)
        banco.atender(); // Saída esperada: 2 (Apenas a normal sobrou)
        banco.atender(); // Nenhuma saída (Fila vazia)
    }

    private static void testarPilha() {
        pilha p = new pilha();

        // Inserindo elementos (LIFO - O último a entrar é o primeiro a sair)
        p.push(10);
        p.push(20);
        p.push(30);

        // Removendo elementos
        p.pop(); // Saída esperada: 30
        p.pop(); // Saída esperada: 20
        p.pop(); // Saída esperada: 10
        p.pop(); // Saída esperada: pilha vazia
    }
}