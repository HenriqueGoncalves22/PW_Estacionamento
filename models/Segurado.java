package models;

public class Segurado extends Veiculo implements ISeguroService{
    private double seguro;


    public Segurado(double seguro, valorHora, valorAdicional, horas){
        this.seguro = seguro;
    }
    @Override
    public double doTotal(){
        return super.doTotal()-doDesconto();
    }
    public String doViewCupom(){
        return "Cupom: ";
    }

    @Override
    public double doDesconto() {
        return super.doTotal()*seguro / 100;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    @Override
    public double getValorHora() {
        return super.getValorHora();
    }

    @Override
    public void setValorHora(double valorHora) {
        super.setValorHora(valorHora);
    }

    @Override
    public double getValorAdicional() {
        return super.getValorAdicional();
    }

    @Override
    public void setValorAdicional(double valorAdicional) {
        super.setValorAdicional(valorAdicional);
    }

    @Override
    public double getHoras() {
        return super.getHoras();
    }

    @Override
    public void setHoras(double horas) {
        super.setHoras(horas);
    }
}
