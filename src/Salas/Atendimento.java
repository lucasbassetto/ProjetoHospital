package Salas;

import Principal.Sala;

public class Atendimento extends Sala {

    public Atendimento() {
    }

    public Atendimento(String idReserva, int dia, int mes, int ano) {
        super(idReserva, dia, mes, ano);
    }

    @Override
    public final void reservarSala(int dia, int mes, int ano) {
        System.out.println("Reservar sala de atendimento para o dia: " +getDia() + " / " + getMes() + " / " + getAno());
    }
}
