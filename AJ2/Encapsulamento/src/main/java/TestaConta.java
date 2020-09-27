/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta {

    public static void main(String[] args) {
        // Criar um objeto do tipo Conta
        Conta c1 = new Conta();
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
        c1.inicializaConta(1000, "123", "Lucas", 837, 1);
        // executar um deposito
        c1.deposito(980);
        // Imprimir o saldo apos o deposito
        c1.imprimeDados();
        // executar um saque cujo valor seja menor que o saldo
        c1.saque(1204);
        // Imprimir o saldo apos o deposito
        c1.imprimeDados();
        // executar uma retirada cujo valor seja maior que o saldo
        c1.saque(2000);
        // Imprimir o saldo apos o deposito
        c1.imprimeDados();
    }
}
