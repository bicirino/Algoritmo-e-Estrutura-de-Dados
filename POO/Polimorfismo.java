/** 
    -- POLIMORFISMO --

    Significa "muitas formas".
    Permite que objetos de classes diferentes respondam à mesma chamada de método, mas executem comportamentos específicos.

    Em Java, o polimorfismo é alcançado de duas maneiras principais:
        1.) Sobrescrita de método (@Overriding): A subclasse reescreve a implementação de um método herdado da superclasse
        2.) Sobrecarga de método (Overloading): Métodos com o mesmo nome na mesma classe, mas com assinaturas (parâmetros) diferentes.
 */

public class Animal { 
    String nome; 

    public void fazerSom(){ 
        System.out.println(nome + " está fazendo um som genérico."); 
    }
}

public class Gato extends Animal { 
    @Override 
    // Substituo o método da superclasse para fornecer um comportamento específico para a classe Gato
    public void fazerSom(){ 
        System.out.println("O gato está miando."); 
    }
}

public class Calculadora { 
    public int somar(int a, int b) { 
        return a + b; 
    }

    public double somar(double a, double b) { 
        return a + b; 
    }
}



