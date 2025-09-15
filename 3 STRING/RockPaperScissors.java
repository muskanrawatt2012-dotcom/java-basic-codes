import java.util.*;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int games) {
        String[][] stats = new String[3][2];
        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[2][0] = "Winning % (User:Computer)";
        double userPercent = (userWins * 100.0) / games;
        double compPercent = (computerWins * 100.0) / games;
        stats[2][1] = String.format("%.2f%% : %.2f%%", userPercent, compPercent);
        return stats;
    }

    public static void displayResults(List<String[]> results, String[][] stats) {
        System.out.printf("%-10s %-10s %-10s\n", "User", "Computer", "Winner");
        System.out.println("-----------------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s\n", row[0], row[1], row[2]);
        }
        System.out.println("\nGame Stats:");
        System.out.printf("%-20s %-10s\n", stats[0][0], stats[0][1]);
        System.out.printf("%-20s %-10s\n", stats[1][0], stats[1][1]);
        System.out.printf("%-20s %-10s\n", stats[2][0], stats[2][1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();
        int userWins = 0, computerWins = 0;
        List<String[]> results = new ArrayList<>();

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String user = sc.nextLine();
            String computer = getComputerChoice();
            String winner = findWinner(user, computer);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            results.add(new String[]{user, computer, winner});
        }

        String[][] stats = calculateStats(userWins, computerWins, games);
        displayResults(results, stats);
    }
}
