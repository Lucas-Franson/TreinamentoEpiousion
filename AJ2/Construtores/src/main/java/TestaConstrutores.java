/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {
        Conta c1 = new Conta(1000, "123", "Lucas", "542", 1);
        c1.imprimeDados();

        Conta c2 = new Conta("432", "Lucas", "543", 3);
        c2.imprimeDados();

        Cliente cli = new Cliente("Lucas", "543");
        cli.imprimeDados();

    }
}
