package test;

import models.BalancoDiario;
import models.Segurado;

//Henrique Gonçalves RM:202562

public class TesteEstacionamento {
    public static void main(String[] args) {
        Segurado veicSeg = new Segurado(10, 5, 2, 0);
        System.out.println(veicSeg.doViewCupom());
        BalancoDiario bd = new BalancoDiario();
        bd.doAdd(veicSeg);
        System.out.println(bd.doGerarRelatorio());
    }
}
