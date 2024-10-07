public class Gerente extends Funcionario {
    private String projeto;

    Funcionario funcionario = new Funcionario();
    //classe    //variável    //instanciando o objeto

    public Gerente() {
        //construtor
    }

    public Gerente(String nome, int nascimento, int idade, double salario, int cargo, String projeto) {
        super(nome, nascimento, idade, salario, cargo);
        this.projeto = projeto;
    } //construtor

    //metodo
    public void informarProjeto() {
        System.out.println("Projeto que o/a funcionário/a " + funcionario.getNome() + "está desenvolvendo: " +
                projeto);
    }

    //get e sett
    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
    public String getProjeto() {
        return projeto;
    }
}
