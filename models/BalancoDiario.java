package models;

public class BalancoDiario {
    private static int qtdeCarros;
    private static double total;

    public void doAdd(Veiculo veiculo){
        qtdeCarros = BalancoDiario.qtdeCarros+1;
    }
    public String doGerarRelatorio(){
        return "";
    }


}
