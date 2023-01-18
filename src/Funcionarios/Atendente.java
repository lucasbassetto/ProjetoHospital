package Funcionarios;

import Principal.Funcionario;

public final class Atendente extends Funcionario {

    public Atendente(String nome, int idade, String cpf, String cargo, String id, String cargaHoraria) {
        super(nome, idade, cpf, cargo, id, cargaHoraria);

    }

    public void iniciarAtendimento() {
        System.out.println("O paciente está sendo atendido");
    }

}
