public class Funcionario {
    protected String nome;
    protected int nascimento;
    protected double salario;
    protected int idade;
    protected int cargo;

    public Funcionario(){
        //construtor
    }

    public Funcionario(String nome, int nascimento,int idade, double salario, int cargo) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.salario = salario;
        this.idade = idade;
        this.cargo = cargo;
    } //construtor

    //métodos
    public void informarSalario (){
        System.out.println("Salário do funcionário " + nome + " é: R$ " + salario);
    }

    public void calcularIdade(){
        idade = 2024 - nascimento;
        System.out.println("Idade: " + idade + " anos.");
    }

    //getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    };
    protected String getNome() {
        return nome;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }
    public int getNascimento() {
        return nascimento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
    public int getCargo() {
        return cargo;
    }
}
