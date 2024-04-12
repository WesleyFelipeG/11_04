public class Passarinho extends Animal implements Voo{
    public Passarinho(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("Piu");
    }

    //@Override
    public void voar() {
        System.out.println("Estou voando alto");
    }
}
