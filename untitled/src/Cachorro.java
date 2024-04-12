public class Cachorro extends Animal implements Corrida, Banho{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    //@Override
    public void correr() {
        System.out.println("Estou correndo rápido");
    }
    public void banho() {
        System.out.println("Banhado");
    }
}
