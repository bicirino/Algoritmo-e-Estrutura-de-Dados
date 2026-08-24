/* 
    -- ABSTRAÇÃO --

    Consiste em focar no que um objeto faz, e não no como ele faz. Esconde a complexidade de implementação e expõe apenas a interface necessária.

    Em Java, a abstração é alcançada através de:

        Classes Abstratas: Classes que não podem ser instanciadas diretamente e podem conter métodos sem corpo.

        Interfaces: Contratos que definem quais métodos uma classe deve implementar.



*/ 

public interface Autenticavel { 
    boolean autenticar(String senha);
}


public abstract class Funcionario { 
    String nome; 
    double salario; 

    public Funcionario(String nome, double salario) { 
        this.nome = nome; 
        this.salario = salario; 
    }

    public abstract double calcularBonificacao(); // Método abstrato, sem implementação
}

public class Gerente extends Funcionario implements Autenticavel { 
    private String senha; 

    public Gerente(String nome, double salario, String senha) { 
        super(nome, salario); 
        this.senha = senha; 
    }

    @Override 
    public double calcularBonificacao() { 
        return salario * 0.2; // Bonificação de 20% do salário
    }

    @Override 
    public boolean autenticar(String senha) { 
        return this.senha.equals(senha); 
    }
}