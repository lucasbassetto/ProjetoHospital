package Funcionarios;

import java.util.List;

public final class Neuro extends Medico {

    public Neuro(String nome, int idade, String cpf, String cargo, String id, String cargaHoraria, String especialidadeMedica) {
        super(nome, idade, cpf, cargo, id, cargaHoraria, especialidadeMedica);
    }

    //Esse método foi implementado com base na explicação do professor, haja vista que eu estava com dúvidas em como implementar.
    @Override
    public String realizarDiagnostico(List<String> sintomas) {

        String Sintomas = "";

        for(int i = 0; i < sintomas.size(); i++) {
            Sintomas += sintomas.get(i);
        }
        return "O Dr. " + getNome() + " constata que o paciente está com os seguintes sintomas: "
                + Sintomas + "\n\nSolicito ao paciente um exame de sangue, radiografia e ressonância magnética para mais detalhes e melhor diagnóstico.\n";
    }
    @Override
    public String toString() {
        return "\n------ MÉDICO RESPONSÁVEL PELO ATENDIMENTO ------\nNome: " + getNome() + "\nID do médico: " + getId() + "\nEspecialidade Médica: " + getEspecialidadeMedica();
    }
}
