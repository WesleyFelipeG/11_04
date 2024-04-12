public class Gato extends Animal implements Corrida, Banho{
    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    //@Override
    public void correr() {
        System.out.println("Estou correndo rápido");
    }
    public void banho() {
        System.out.println("Banhado");
    }
}
