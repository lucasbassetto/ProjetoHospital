package Funcionarios;

import Principal.Funcionario;

import java.util.List;
public abstract class Medico extends Funcionario {

    private String especialidadeMedica;

    public Medico(String nome, int idade, String cpf, String cargo, String id, String cargaHoraria, String especialidadeMedica) {
        super(nome, idade, cpf, cargo, id, cargaHoraria);
        this.especialidadeMedica = especialidadeMedica;
    }

    public String getEspecialidadeMedica() {
        return especialidadeMedica;
    }

    public void setEspecialidadeMedica(String especialidadeMedica) {
        this.especialidadeMedica = especialidadeMedica;
    }

    //Esse método foi implementado com base na explicação do professor, haja vista que eu estava com dúvidas em como implementar.
    public abstract String realizarDiagnostico(List<String> sintomas);
}
