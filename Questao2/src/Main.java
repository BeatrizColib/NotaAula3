import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String especie;
        String continuar;

        Scanner scanner = new Scanner(System.in);
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        do {
            System.out.print("Qual nome do animal: ");
            animal.nome = scanner.nextLine();
            System.out.print("Qual espécie: Cão (C) ou Gato (G): ");
            especie = scanner.nextLine();
            System.out.print("Qual a raça: ");
            animal.raca = scanner.nextLine();
            if (especie.equalsIgnoreCase("C")) {
                System.out.println(animal.nome + " é da raça " + animal.raca + ".");
                cachorro.late();
            } else if (especie.equalsIgnoreCase("G")) {
                System.out.println(animal.nome + " é da raça " + animal.raca + ".");
                gato.mia();
            } else {
                System.out.println("Espécie não cadastrada.");
            }

            System.out.print("Gostaria de continuar? SIM (S) ou NÃO (N): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("-----------ENCERRADO------------");
        scanner.close();
    }
}
