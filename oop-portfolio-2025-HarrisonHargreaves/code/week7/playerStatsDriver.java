package code.week7;

public class playerStatsDriver {
    public static void main(String[] args) {
        // Create instances for different sports
        FootballStats footballPlayer = new FootballStats("John Doe", 25, 30, 100);
        CricketStats cricketPlayer = new CricketStats("Jane Smith", 28, 1500, 75);

        // Display stats for each player
        System.out.println("Football Player Stats:");
        footballPlayer.displayStats();

        System.out.println("\nCricket Player Stats:");
        cricketPlayer.displayStats();
    }
}