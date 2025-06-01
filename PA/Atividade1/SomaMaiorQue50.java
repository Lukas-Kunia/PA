public class SomaMaiorQue50 {
    public static void main(String[] args) {
        int numero1 = 30;
        int numero2 = 25;
        int soma = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + soma);
        if (soma > 50){
            System.out.println("A soma é maior que 50.");
        } else {
            System.out.println("A soma não é maior que 50.");
        }
    }
}