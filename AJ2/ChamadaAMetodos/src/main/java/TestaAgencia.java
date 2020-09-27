/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaAgencia {

    public static void main(String[] args) {
        // Criacao da agencia
        Agencia ag = new Agencia();
        // Inicializacao da agencia
        ag.inicializaCliente("123", 1);
        // Impressao dos dados da agencia
        ag.imprimeDados();
    }
}
