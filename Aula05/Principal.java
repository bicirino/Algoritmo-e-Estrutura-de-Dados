package Aula05;

public class Principal {
    public static void Principal(String[] args) {
        FilaDeBanco banco = new FilaDeBanco();

        // Insere clientes na fila
        banco.entrar(false, 101); // Preferencial 1
        banco.entrar(false, 102); // Preferencial 2
        banco.entrar(false, 103); // Preferencial 3
        banco.entrar(false, 104); // Preferencial 4
        banco.entrar(true, 1); // Normal 1

        // Atendimentos (deve priorizar 3 preferenciais antes da normal)
        banco.atender(); // Atende 101
        banco.atender(); // Atende 102
        banco.atender(); // Atende 103
        banco.atender(); // Atende 1 (Normal)
    }
}