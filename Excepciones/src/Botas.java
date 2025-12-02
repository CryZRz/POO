import java.util.Scanner;

public class Botas {
    public static void main(String[] args) {
        var scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int arr[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int countRepeat = 0;
            boolean existe = false;
            for (int j = 0; j < n; j++) {
                if (arr2[j] == arr[i]){
                    existe = true;
                    break;
                }
            }
            if (!existe){
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]){
                        countRepeat++;
                    }
                }
            }
            if (countRepeat%2 != 0){
                c++;
            }
            arr2[i] = arr[i];
        }

        System.out.println(c);
    }
}
