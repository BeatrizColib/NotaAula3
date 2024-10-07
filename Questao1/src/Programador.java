public class Programador extends Funcionario {
    private String linguagem;

    Funcionario funcionario = new Funcionario(); //instanciando

    public Programador(){
        //construtor
    }

    public Programador(String nome, int nascimento, int idade, double salario, int cargo, String linguagem) {
        super(nome, nascimento, idade, salario, cargo);
        this.linguagem = linguagem;
    } //construtor

    //método
    public void informarLinguagem() {
        System.out.println("A linguagem do/a programador/a " + getNome() + " é: " + linguagem + ".");
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    private String getLinguagem() {
        return linguagem;
    }
}
