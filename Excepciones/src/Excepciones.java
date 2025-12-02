import java.util.Scanner;

public class Excepciones {
    public double dividir(double numerador, double denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Excepciones calculadora = new Excepciones();
        Scanner scanner = new Scanner(System.in);
        boolean err = true;
        do {
            try {
                System.out.println("Division");
                System.out.println("Ingresa un numero a: ");
                int a = scanner.nextInt();
                System.out.println("Ingresa un numero b: ");
                int b = scanner.nextInt();
                double resultado = calculadora.dividir(a, b);
                System.out.println("Resultado: " + resultado);
                err = false;
            } catch (ArithmeticException e) {
                System.out.println("No puedes divir entre 0");
            }
        }while (err);
    }
}
