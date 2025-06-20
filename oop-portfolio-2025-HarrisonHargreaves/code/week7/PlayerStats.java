package code.week7;

public class PlayerStats {
    protected String playerName;
    protected int age;

    public PlayerStats(String playerName, int age) {
        this.playerName = playerName;
        this.age = age;
    }

    public void displayStats() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Age: " + age);
    }
}

class FootballStats extends PlayerStats {
    private int goalsScored;
    private int matchesPlayed;

    public FootballStats(String playerName, int age, int goalsScored, int matchesPlayed) {
        super(playerName, age);
        this.goalsScored = goalsScored;
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Goals Scored: " + goalsScored);
        System.out.println("Matches Played: " + matchesPlayed);
    }
}

class CricketStats extends PlayerStats {
    private int runsScored;
    private int wicketsTaken;

    public CricketStats(String playerName, int age, int runsScored, int wicketsTaken) {
        super(playerName, age);
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Runs Scored: " + runsScored);
        System.out.println("Wickets Taken: " + wicketsTaken);
    }
}
