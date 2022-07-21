package aula4;

import java.lang.Math;

public class Carro {
    //#region Atributos
    String marca;
    String modelo;

    int numPassageiro;
    double capCombustível;
    double consCombustível;
    String combustível;
    //#endregion

    //#region Regras de Negócios de classe (Métodos)
    public double calculaAutonomia(){
        return Math.round((this.capCombustível * this.consCombustível));
    }
    public double avaliaTipoComubustivel(String combustivel){
        if(combustivel == "diesel"){
            return 1.6;
        }else if (combustível == "etanol"){
            return 0.7;
        }else {
            return 1;
        }
    }
    public double verificarEcoDesempenho(){
        double eco = this.calculaAutonomia()/this.numPassageiro;
        return Math.round(eco);
    }
    public boolean validaEcoDesempenho(double indice){
        if(this.verificarEcoDesempenho()>indice){
            return true;
        }else{
            return false;
        }
    }
    //#endregion
}
