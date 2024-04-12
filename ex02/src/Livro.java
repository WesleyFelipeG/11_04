public class Livro extends Produto implements Desconto{
    public Livro(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double desconto() {
        return 0.9;
    }
}
