package Aula04;

import java.util.*;

public class pilha {

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

        public No getProximo() {
            return proximo;
        }
    }

    private No cabeca = null;

    public void push(int numero) {
        cabeca = new No(numero, cabeca);

    }

    public void pop() {
        if (cabeca == null) {

            System.out.print("pilha vazia");

        } else {
            System.out.print(cabeca.getNumero());
            cabeca = cabeca.getProximo();
        }
    }

}