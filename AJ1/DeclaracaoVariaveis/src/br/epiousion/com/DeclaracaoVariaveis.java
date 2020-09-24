package br.epiousion.com;

public class DeclaracaoVariaveis {
    public static void main(String[] args) {
        String nome = "Lucas";
        int idade = 19;
        String rg = "57.310.706-9";
        char sexo = 'M';
        double salario = 2000;

        System.out.println("Senhor(a) " + nome +
                ", de " + idade +
                " anos, portador(a) do RG de número " + rg +
                ", do sexo " + sexo +
                " está registrado(a) com o salário de R$ " + salario);
    }
}
