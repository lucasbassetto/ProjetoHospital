package Salas;

import Principal.Sala;

public class Cirurgia extends Sala {

    public Cirurgia() {
    }

    public Cirurgia(String idReserva, int dia, int mes, int ano) {
        super(idReserva, dia, mes, ano);
    }

    @Override
    public final void reservarSala(int dia, int mes, int ano) {
        System.out.println("Reservar a sala de cirurgia para o dia: " + getDia() + " / " + getMes() + " / " + getAno());
    }
}
