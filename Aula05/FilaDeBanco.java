package Aula05;

public class FilaDeBanco {

    // CLASSES E MÉTODOS NECESSÁRIOS

    public class No {
        private int numero;
        private No proximo;

        public No(int numero, No proximo) {
            this.numero = numero;
            this.proximo = proximo;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public No getProximo() {
            return proximo;
        }

        public void setProximo(No proximo) {
            this.proximo = proximo;
        }
    }

    // =============

    // Propriedades da classe
    private No filaNormal = null;
    private No filaPreferencial = null;

    // Métodos da classe
    public void entrar(boolean normal, int numero) {

        if (normal) {
            filaNormal = new No(numero, filaNormal);
        } else {
            filaPreferencial = new No(numero, filaPreferencial);
        }
    }

    private No sair(No fila) {

        // Fila vazia

        if (fila == null) {

            return null;
        }

        // Fila tem um único Nó
        if (fila.getProximo() == null) {
            System.out.println(fila.getNumero());

            return null;
        }

        // Fila tem mais de um Nó
        No penultimo = fila;

        while (penultimo.getProximo().getProximo() != null) {
            penultimo = penultimo.getProximo();
        }

        System.out.println(penultimo.getProximo().getNumero());
        penultimo.setProximo(null);

        return fila;

    }

    private int contador = 0;

    public void atender() {

        // Duas filas vazias

        if (filaNormal == null && filaPreferencial == null) {

            contador = 0;

            return;
        }

        // Apenas fila normal

        if (filaPreferencial == null) {
            filaNormal = sair(filaNormal);

            contador = 0;

            return;
        }

        // Apenas preferencial

        if (filaNormal == null) {
            filaPreferencial = sair(filaPreferencial);

            contador = 0;

            return;
        }

        // Duas filas não vazias

        if (contador < 3) {
            filaPreferencial = sair(filaPreferencial);
            contador++;
        } else {
            filaNormal = sair(filaNormal);
            contador = 0;
        }

    }

}