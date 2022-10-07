import java.util.Scanner;

public class Player {
    int number;
    Scanner leitor = new Scanner(System.in);

    public void guess() {
        System.out.printf("digite seu palpite: ");
        number = leitor.nextInt();
    }
}