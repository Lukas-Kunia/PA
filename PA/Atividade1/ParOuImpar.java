public class ParOuImpar {
    public static void main(String[] args) {
        int numero = 11;
        //Verifica se o número é divisívil por 2 (Módulo)
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é impar.");
        }
    }
}