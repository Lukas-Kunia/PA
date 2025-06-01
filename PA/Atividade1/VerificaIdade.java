public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 1; // Altere este valor para testar diferentes idades

        if (idade >= 18 && idade <= 65) {
            System.out.println("A pessoa tem " + idade + " anos e está dentro da faixa etária permitida.");
        } else {
            System.out.println("A pessoa tem " + idade + " anos e está fora da faixa etária permitida.");
        }
    }
}