package Challenge_5;
import java.util.Scanner;


public class While_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose an activity: ");
        String activity = scanner.nextLine().toLowerCase();

        int i = 0;
        while (i < activity.length()) {
            i++;
        }

        if (activity.equals("biking")) {
            System.out.println("The price is 500");
        } else if (activity.equals("horse_riding")) {
            System.out.println("The price is 2000");
        } else if (activity.equals("kayaking")) {
            System.out.println("The price is 1000");
        } else {
            System.out.println("Activity not recognized");
        }

        scanner.close();
    }
}