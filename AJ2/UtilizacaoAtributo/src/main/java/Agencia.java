/*
 * Globalcode - "The Developers Company"
 *
 * Academia do Java
 * 
 * 1) Adicione os seguintes atributos na classe Agencia:
 * - numero (String)  
 * - banco (int) 
 */

class Agencia {

    public Agencia(String numero, int banco) {
        this.numero = numero;
        this.banco = banco;
    }

    private String numero;
    private int banco;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "---------------------------\n" +
                "AGENCIA: " + numero + "\t BANCO: " + banco +
                "\n---------------------------";
    }
}
