package aula3;

import java.util.ArrayList;
import java.util.List;

public class listas {
    public static void main(String[] args) {

        List lista1 = new ArrayList<Integer>();

        lista1.add("arroz");
        lista1.add("bolacha");
        lista1.add("margarina");
        lista1.add("leite");
        lista1.add("massa");

        System.out.println("---[Listagem sem alteracoes]---");
        System.out.println(lista1);
        System.out.println("--Listagem com alteracoes]---");
        lista1.set(2, "manteiga");
        System.out.println(lista1);
        System.out.println("---[Listagem com Remocoes]---");
        lista1.remove(1);
        System.out.println(lista1);
        System.out.println("---[Listagem com Adicoes]---");
        lista1.add(1, "biscoito");
        System.out.println(lista1);
    }
}
