package models;

public abstract class Veiculo {
    private double valorHora;
    private double valorAdicional;
    private double horas;

    public Veiculo(double valorHora, double valorAdicional, double horas) {
        this.horas = horas;
        this.valorAdicional = valorAdicional;
        this.valorHora = valorHora;
    }

    public double doTotal(){
        return valorHora + valorAdicional * (horas-1);
    }

    public String doViewCupom(){
        return "valor por hora: " + valorHora + "\n" + "valor adicional: " + valorAdicional + "\n" +"horas: " + horas  + "\n" + "Total: " + doTotal();
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
}
