package estoque;

public class Produto {

    private String codigoBarras;
    private String nome;

    public Produto(String codigoBarras, String nome) {
        this.codigoBarras = codigoBarras;
        this.nome = nome;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigoBarras='" + codigoBarras + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
