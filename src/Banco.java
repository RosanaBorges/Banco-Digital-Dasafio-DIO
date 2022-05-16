import java.util.ArrayList;
import java.util.List;

public class Banco {

    public String nome;
    private List<Conta> contas;


     public String getNome() {

         return nome;
    }

    public void setNome(String nome) {

         this.nome = nome;
    }
    public Banco(List<Conta> contas) {

         this.contas = contas;
    }

    public void setContas(List<Conta> contas) {

         this.contas = contas;
    }

}
