
import java.util.Scanner;

class BGMI {

    double dragonUpdateVersion = 2.7;
    double titanUpdateVersion = 1.4;

    BGMI() {
        System.out.println("BGMI is a multiplayer battle game");
    }
}

class DragonBall extends BGMI {

    int fd;

    DragonBall() {
        System.out.println("Version of Dragon ball event: " + dragonUpdateVersion);
    }

    double calcFDRatio(int matchesPlayed, int finishes) {
        fd = finishes / matchesPlayed;
        return fd;
    }

}

class TitanStrikes extends BGMI {

    TitanStrikes() {
        System.out.println("Version of Titan strikes event: " + titanUpdateVersion);
    }

    void titans(String map) {
        if (map.equals("Sanhok")) {
            System.out.println("Kong is found in Sanhok");
        } else if (map.equals("Erangel")) {
            System.out.println("Godzilla is found in Erangel");
        }
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BGMI bgmi = new BGMI();

        System.out.println("Versions: " + bgmi.dragonUpdateVersion + " " + bgmi.titanUpdateVersion);

        DragonBall db = new DragonBall();

        System.out.print("Enter matches played: ");
        int matchesPlayed = sc.nextInt();

        System.out.print("How many finishes: ");
        int finishes = sc.nextInt();

        double fd = db.calcFDRatio(matchesPlayed, finishes);
        System.out.println("Your FD ratio is: " + fd);

        TitanStrikes ts = new TitanStrikes();

        System.out.println("Enter map: ");
        String s = sc.next();
        ts.titans(s);

        sc.close();

    }
}
