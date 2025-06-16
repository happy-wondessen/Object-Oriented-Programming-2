package Array_Challenge;

public class Exercise_1 {
    public static void main(String[] args) {
        String[] StudentID = {"190527", "290528", "390528", "190529"};

        for (String item : StudentID) {
            if (item.startsWith("1")) {
                System.out.println(item);

            }
        }
    }
}