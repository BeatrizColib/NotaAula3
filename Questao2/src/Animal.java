public class Animal {
    protected String nome;
    protected String raca;
    protected String locomocao;

    //métodos:
    public Animal() {
    }

    public Animal (String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void caminha(){
        System.out.println(nome + "caminha sobre" + locomocao + ".");
    }
}
