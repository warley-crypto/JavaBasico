package aula3;

import java.util.ArrayList;

public class matriz {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

        int c=2;

        for(int i = 0; i<c;i++){

            matriz.add(new ArrayList<> ());
        }

        //#region Abastecimento de Matriz
        matriz.get(0).add(1);
        matriz.get(0).add(1);
        matriz.get(0).add(15);
        matriz.get(1).add(4);
        matriz.get(1).add(-2);
        matriz.get(1).add(12);
        //#endregion
        System.out.println("primeira: "+matriz.get(0));
        System.out.println("segunda: "+matriz.get(1));

        double y=((matriz.get(1).get(0) * matriz.get(0).get(2))-matriz.get(1).get(2)) / ((matriz.get(1).get(0)*matriz.get(0).get(1)+matriz.get(1).get(1)));
        double x= (matriz.get(0).get(2) - y);
        System.out.println(y);
        System.out.println(x);
    }
}
