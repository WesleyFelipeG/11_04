public class Eletronico extends Produto implements Desconto{
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double desconto() {
        return 0.95;
    }
}
