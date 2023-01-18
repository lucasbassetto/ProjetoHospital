package Principal;

public abstract class Funcionario extends Pessoa {

    private String cargo;
    private String id;
    private String cargaHoraria;

    public Funcionario() {

    }

    public Funcionario(String nome, int idade, String cpf, String cargo, String id, String cargaHoraria) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.id = id;
        this.cargaHoraria = cargaHoraria;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
