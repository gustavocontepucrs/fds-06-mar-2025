import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do professor: ");
        String name = scanner.next();
        System.out.println("Digite a experiência do professor: ");
        int experience = scanner.nextInt();
        Professor professor = new Professor(name, experience);
        System.out.println(professor);
        scanner.close();
    }
}