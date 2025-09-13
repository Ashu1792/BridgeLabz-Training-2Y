public class springseason {

    // Method to check if the given date is in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Spring: March 20 to June 20
        if ((month == 3 && day >= 20 && day <= 31) ||   // March 20–31
            (month == 4 && day >= 1 && day <= 30) ||    // April
            (month == 5 && day >= 1 && day <= 31) ||    // May
            (month == 6 && day >= 1 && day <= 20)) {    // June 1–20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Ensure correct number of arguments
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Basic validation for month/day range
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date. Please enter valid month and day.");
            return;
        }

        // Check season and print result
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
