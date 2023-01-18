package Principal;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {

    private List<String> sintomas = new ArrayList<>();
    private String classificacaoRisco;


    public Paciente(String nome, int idade, String cpf, List<String> sintomas, String classificacaoRisco) {
        super(nome, idade, cpf);
        this.sintomas = sintomas;
        this.classificacaoRisco = classificacaoRisco;
    }

    public List<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }

    public String getClassificacaoRisco() {
        return classificacaoRisco;
    }

    public void setClassificacaoRisco(String classificacaoRiso) {
        this.classificacaoRisco = classificacaoRiso;
    }

    @Override
    public String toString() {
        return "O(A) paciente " + getNome() + " será diagnosticado(a) em breve, aguarde o atendimento.\n" +  "\n------ Ficha do paciente:  --------\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nEstado de risco: " + getClassificacaoRisco();

    }
}
