/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
        Conta c1 = new Conta();
        // Inicializacao da conta
        c1.inicializaConta(1000, "123", "Lucas", 198, 1);
        // Impressao dos dados da conta
        c1.imprimeDados();
        // Saque da conta
        c1.saque(169);
        // Impressao dos dados da conta
        c1.imprimeDados();
        // Deposito em conta
        c1.deposito(289);
        // Impressao dos dados da conta
        c1.imprimeDados();
    }
}
