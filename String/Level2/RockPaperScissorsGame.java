import java.util.Scanner;

public class RockPaperScissorsGame {

    // Method to get computer's choice using Math.random
    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.33) return "rock";
        else if (rand < 0.66) return "paper";
        else return "scissors";
    }

    // Method to determine winner
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "user";
        } else {
            return "computer";
        }
    }

    // Method to calculate win percentages
    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", (userWins * 100.0 / totalGames));

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", (computerWins * 100.0 / totalGames));

        return stats;
    }

    // Method to display game results and stats
    public static void displayResults(String[][] gameLog, String[][] stats, int draws) {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < gameLog.length; i++) {
            System.out.println((i + 1) + "\t" + gameLog[i][0] + "\t" + gameLog[i][1] + "\t\t" + gameLog[i][2]);
        }

        System.out.println("\nSummary:");
        System.out.println("Player\tWins\tWin %");
        System.out.println("-------------------------");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }

        System.out.println("\nDraws: " + draws);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of games
        System.out.print("Enter number of games to play: ");
        int totalGames = scanner.nextInt();

        String[][] gameLog = new String[totalGames][3];
        int userWins = 0, computerWins = 0, draws = 0;

        // Play each game
        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);

            gameLog[i][0] = userChoice;
            gameLog[i][1] = computerChoice;
            gameLog[i][2] = winner;

            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) computerWins++;
            else draws++;
        }

        // Calculate stats and display
        String[][] stats = calculateStats(userWins, computerWins, draws, totalGames);
        displayResults(gameLog, stats, draws);

        scanner.close();
    }
}