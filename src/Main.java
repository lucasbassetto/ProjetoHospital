import Funcionarios.Atendente;
import Funcionarios.ClinicoGeral;
import Funcionarios.Medico;
import Principal.Paciente;
import Principal.Sala;
import Salas.Atendimento;
import Salas.Cirurgia;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Instanciação da sala de atendimento
        Atendimento salaAtendimento = new Atendimento("2291", 18, 01, 2023 );

        //Instanciação dos sintomas do paciente
        List<String> sintomas = List.of("\nFebre", "\nDor de cabeça", "\nDor nos olhos", "\nTosse");

        //Instanciação do paciente
        Paciente paciente1 = new Paciente("Marina", 23, "00000000000", sintomas, "Pouco urgente");

        //Instanciação de médico (neste caso, clínico geral)
        ClinicoGeral clinicoGeral = new ClinicoGeral("Lucas", 26, "00000000000", "Médico", "2312", "90", "Clinico Geral");

        //Instanciação do(a) atendente
        Atendente atendente = new Atendente("Isabela", 30, "00000000000", "Atendente", "991", "80");

        System.out.println();
        salaAtendimento.reservarSala(18, 01, 2023);
        System.out.println();
        System.out.println(paciente1);
        System.out.println();
        atendente.iniciarAtendimento();
        System.out.println();
        System.out.println(clinicoGeral.realizarDiagnostico(sintomas));
        System.out.println(clinicoGeral);
    }
}