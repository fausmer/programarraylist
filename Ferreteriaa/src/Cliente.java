public class Cliente {
    private String nombrecliente;
    private Integer cod;
    private Integer dni;

    public Cliente(String nombrecliente, Integer cod, Integer dni) {
        this.nombrecliente = nombrecliente;
        this.cod = cod;
        this.dni = dni;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

}