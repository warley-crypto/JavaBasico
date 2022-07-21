package aula1;

public class ImprimeIdade {
    public static void main(String[] args) {
        int idade = 48;
        String nome = "Warley Goncalves";
        double altura = 1.65;
        double peso = 65;
        double imc = (peso) / (altura * altura);
        System.out.println("Ola: " + nome);
        if (idade >= 48) {
            if (imc < 22) {
                System.out.println("Minha idade = " + idade + "risco de subnutricao.");
            } else if (imc <= 30) {
                System.out.println("IMC: " + imc + " sua idade e " + idade + " Isso ai garoto.");
            } else if (imc <= 35) {
                System.out.println("IMC: " + imc + " sua idade e " + idade + " opa pode estar pesado cuidado.");
            } else {
                System.out.println("IMC: " + imc + " sua idade e " + idade + " procure um médido e um nutricionista.");
            }
        } else {
            if (imc <= 18) {
                System.out.println("Minha idade = " + idade + "Procure um médico para avaliação de subnutrição");
            } else if (imc <= 26) {
                System.out.println("IMC: " + imc + " sua idade e " + idade
                        + " Seu indice está controlado e saudável mantenha com auxílio de um nutricionista.");
            } else if (imc <= 32) {
                System.out.println("IMC: " + imc + " sua idade e " + idade
                        + " Parabéns consulte um médico para medição muscular.");
            }
            else if (imc <= 40) {
                System.out.println("IMC: " + imc + " sua idade e " + idade
                        + " Pré obesidade precisará de acompanhamento nutricional.");
            } else {
                System.out.println("Procure um médico endocrinologista com urgência.");
            }
        }
    }
}