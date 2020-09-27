/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */
public class TestaCliente {

    public static void main(String[] args) {
        // Criacao do cliente
        Cliente c1 = new Cliente();
        // Inicializacao do cliente usando o metodo inicializaCliente
        c1.inicializaCliente("Lucas", "123");
        // Impressao dos dados do cliente
        c1.imprimeDados();
    }
}
