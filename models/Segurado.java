package models;

public class Segurado extends Veiculo implements ISeguroService{
    private double seguro;

    public Segurado(double seguro){
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
}
