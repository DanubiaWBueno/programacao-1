public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean runGame = true;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Estou pensando em um número entre 0 e 9...");

        while (runGame) {
            System.out.println("Sua vez:");

            System.out.print("Jogador um ");
            p1.guess();
            guessp1 = p1.number;

            System.out.print("Jogador dois ");
            p2.guess();
            guessp2 = p2.number;

            System.out.print("Jogador três ");
            p3.guess();
            guessp3 = p3.number;

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("Temos um vencedor!");
                System.out.println("O número correto é: " + targetNumber);

                if (p1isRight) {
                    System.out.println("O jogador um acertou!");
                }

                if (p2isRight) {
                    System.out.println("O jogador dois acertou!");
                }

                if (p3isRight) {
                    System.out.println("O jogador três acertou!");
                }

                System.out.println("Fim do jogo!");

                runGame = false;
            } else {
                System.out.println("Os jogadores terão que tentar novamente.");
            }
        }
    }
}
