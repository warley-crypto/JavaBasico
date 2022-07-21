package aula4;

import java.lang.Math;

public class programa {
    public static void main(String[] args){

        Carro van = new Carro();
        van.marca = "Toyota";
        van.modelo = "Hiace";
        van.capCombustível = 76;
        van.numPassageiro = 10;
        van.consCombustível = 20.2;

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.capCombustível = 42;
        fusca.numPassageiro = 4;
        fusca.consCombustível = 8.6;

        System.out.println("--- Impressao do objeto [Fisico]---");
        System.out.println(van);
        System.out.println("Modelo:"+van.modelo+" | Autonomia: "+van.calculaAutonomia());
        System.out.println("Eco taxa:" + van.verificarEcoDesempenho());
        if(van.validaEcoDesempenho(105) == true){
            System.out.println("Eco eficiente.");
        }else{
            System.out.println("Não é Eco Eficiente.");
        }
        System.out.println(fusca);
        System.out.println("Modelo:"+fusca.modelo+" | Autonomia: "+fusca.calculaAutonomia());
        System.out.println("Eco taxa" + fusca.verificarEcoDesempenho());
        if(fusca.validaEcoDesempenho(81) == true){
            System.out.println("Eco eficiente.");
        }else{
            System.out.println("Não é Eco Eficiente.");
        }
    }
}