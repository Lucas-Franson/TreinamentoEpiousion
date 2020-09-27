/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Adicione os seguintes atributos na classe Cliente: 
 * - nome (String) 
 * - cpf (String)
 */
class Cliente {

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "---------------------------------\n" +
                "NOME: " + nome + "\t CPF: " + cpf +
                "\n---------------------------------";
    }
}
