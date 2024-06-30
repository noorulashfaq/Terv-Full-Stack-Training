
class Cricket {

    int fours = 4, sixes = 6, singles = 1;
    int foursHit, sixesHit, singlesHit;

    Cricket(int foursHit, int sixesHit, int singlesHit) {
        System.out.println("Let's calculate the total runs !!");
        this.foursHit = foursHit;
        this.sixesHit = sixesHit;
        this.singlesHit = singlesHit;
    }

    int calcFours() {
        return fours * foursHit;
    }

    int calcSixes() {
        return sixes * sixesHit;
    }

    int calcSingles() {
        return singles * singlesHit;
    }

}

class Scores extends Cricket {
    Scores(int fours, int sixes, int singles) {
        super(fours, sixes, singles);
    }

    int totalRuns() {
        return foursHit * 4 + sixesHit * 6 + singlesHit * 1;
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Scores c = new Scores(3, 6, 10);

        int totalFours = c.calcFours();
        System.out.println("Total score by hitting fours: " + totalFours);

        int totalSixes = c.calcSixes();
        System.out.println("Total score by hitting sixes: " + totalSixes);

        int totalSingles = c.calcSingles();
        System.out.println("Total score by hitting singles: " + totalSingles);

        int totalScore = c.totalRuns();
        System.out.println("Total score: " + totalScore);

    }
}