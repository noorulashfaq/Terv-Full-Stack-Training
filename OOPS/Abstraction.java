import java.util.Scanner;

abstract class IPL {

    abstract int strikeRate(int runs, int balls);

    abstract void scorePrediction();

    IPL() {
        System.out.println("T20 MEN WC 2024 FINAL");
    }

    void display() {
        System.out.println("India vs South Africa");
    }
}

class Match extends IPL {

    Match() {
        System.out.println("India has been the undefeated team in this WC");
    }

    void scorePrediction() {
        System.out.println("Predicted score : 201");
    }

    int strikeRate(int runs, int balls) {
        int rate = (runs / balls) * 100;
        return rate;
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IPL ipl = new Match();
        ipl.display();

        System.out.print("Enter runs and balls: ");
        int runs = sc.nextInt();
        int balls = sc.nextInt();

        Match m = new Match();
        System.out.println("The strike rate is " + m.strikeRate(runs, balls));

        sc.close();

    }
}
