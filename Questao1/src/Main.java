import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String continuar="";

        //instancias
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        Programador programador = new Programador();

        //dados comuns - loop
        do {
            System.out.println("---------Cadastro dados do funcionário--------");
            System.out.print("Nome do funcionário/a: ");
            funcionario.setNome(scanner.nextLine());
            System.out.print("Ano de nascimento (aaaa - ex. 1992): ");
            funcionario.setNascimento(sc.nextInt());
            System.out.print("Salário: R$ ");
            funcionario.setSalario(sc.nextDouble());
            System.out.print("Cargo " +
                    "\n1- Gerente" +
                    "\n2 - Programador" +
                    "\nOpção: ");
            funcionario.setCargo(sc.nextInt());

            //dados específicos
            if (funcionario.cargo == 1) {
                System.out.print("Projeto que está desenvolvendo: ");
                gerente.setProjeto(scanner.nextLine());

                gerente.setNome(funcionario.getNome());
                gerente.setNascimento(funcionario.getNascimento());
                gerente.setSalario(funcionario.getSalario());
                gerente.setIdade(funcionario.getIdade());
                gerente.setCargo(funcionario.getCargo());

                System.out.println();
                System.out.println("----------Dados Funcionário (gerente)--------");
                System.out.println("Nome: " + gerente.getNome());
                System.out.println("Cargo: Gerente");
                funcionario.informarSalario();
                funcionario.calcularIdade();
                gerente.informarProjeto();
                System.out.println("---------------------------------------------");
            } else if (funcionario.cargo == 2) {
                System.out.print("Qual linguagem/ns utilizadas: ");
                programador.setLinguagem(scanner.nextLine());

                programador.setNome(funcionario.getNome());
                programador.setNascimento(funcionario.getNascimento());
                programador.setSalario(funcionario.getSalario());
                programador.setIdade(funcionario.getIdade());
                programador.setCargo(funcionario.getCargo());

                System.out.println();
                System.out.println("----------Dados Funcionário (programador/a)--------");
                System.out.println("Nome: " + programador.getNome());
                System.out.println("Cargo: Programador/a");
                funcionario.informarSalario();
                funcionario.calcularIdade();
                programador.informarLinguagem();
                System.out.println("---------------------------------------------");
            } else {
                System.out.println("Opção inválida!");
            }

            System.out.println();
            System.out.print("Deseja continuar? Digite (N) para sair: ");
            continuar = scanner.nextLine();
        } while (!continuar.equalsIgnoreCase("N"));
        System.out.println();
        System.out.println("--------Encerrado----------");
        sc.close();
        scanner.close();
    }
}
