/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaAgencia {

    public static void main(String[] args) {
        // Inicializar um objeto do tipo Agencia
        Agencia ag = new Agencia();
        // usar o metodo inicializaAgencia (ver quais sao os parametros na classe Agencia)
        ag.inicializaAgencia("123", 1);
        // Imprimir os dados da agencia
        ag.imprimeDados();  
    }
}
