import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Persona[] list = new Persona[5];

        for (int i =0; i <5; i++){
            var name = scanner.nextLine();
            var age = scanner.nextInt();
            var p = new Persona(name, age);
            list[i] = p;
        }
    }
}
