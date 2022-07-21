package aula2;
import java.util.Random;

public class SaldoBanco {

    public static void main(String[] args) {

        double saldoInicial = 12263;
        int contador = 0;
        Random aleatorio = new Random();
        double credito = 0;
        double debito = 0;
        while(contador  <= 12){
            contador++;
            double i = aleatorio.nextInt(-2693, 2632);
            System.out.println("--------------------------------");
            saldoInicial += i;
            if(i < 0){
                System.out.println("Foi retirado" + i + " a sua conta. Seu saldo altual é igual a " + saldoInicial); debito += i;
            }else{
                System.out.println("Foi adicionado" + i + " a sua conta. Seu saldo atual e igual a " + saldoInicial);
                credito += i;
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("Credito = " + credito);
        System.out.println("Debito = " + debito);
        System.out.println("Seu saldo final e = " + saldoInicial);
    }
}
        /*
         * Monte um sistema de repetição:
         * Apartir de um saldo ele tenha uma variável ou tecnica que identifique se a movimentação creditou ou debitou.
         * Ao final ele mostra 12 movimentos e como ficou o saldo final.
         *         Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt((12 - (-2500)) + 1) + (-2500));
         */
