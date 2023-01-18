package Principal;

public abstract class Sala {

    private String idReserva;
    private int dia;
    private int mes;
    private int ano;

    public Sala(){

    }

    public Sala(String idReserva, int dia, int mes, int ano) {
        this.idReserva = idReserva;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract void reservarSala(int dia, int mes, int ano);

}
