public class Main {
    public static void main(String[] args) {
        Livro l = new Livro("Livro",50);
        Eletronico e = new Eletronico("Eletronico", 200);
        Roupa r = new Roupa("Roupa", 100);

        System.out.println("Produtos: " +
                "\n" +
                "\n" + l.getNome() + " | " + (l.getPreco() * l.desconto()) +
                "\n" + e.getNome() + " | " + (e.getPreco() * e.desconto() +
                "\n" + r.getNome() + " | " + r.getPreco()));
    }
}