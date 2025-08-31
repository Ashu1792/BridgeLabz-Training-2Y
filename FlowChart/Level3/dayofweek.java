package Level3;

public class dayofweek {
    public static void main(String[] args) {   
        // Ensure correct number of command-line arguments
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        // Parse input arguments
        int m = Integer.parseInt(args[0]); // Month (1 = Jan, ..., 12 = Dec)
        int d = Integer.parseInt(args[1]); // Day
        int y = Integer.parseInt(args[2]); // Year

        // Apply formulas from the problem statement
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output: 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        System.out.println(d0);
    }
}