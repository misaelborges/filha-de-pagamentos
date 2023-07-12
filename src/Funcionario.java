public class Funcionario {

    private String nome;
    private int quantidadeFilhos;

    boolean possuiFilho() {
        return quantidadeFilhos > 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFilhos() {
        return quantidadeFilhos;
    }

    public void setQuantidadeFilhos(int quantidadeFilhos) {
        this.quantidadeFilhos = quantidadeFilhos;
    }
}
