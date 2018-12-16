import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        System.out.println("Please input name:");
        String name = getName();
        System.out.println("Please input age:");
        int age = getAge();
        System.out.println("Я \"" + name + "\" и мне \"" + age + "\" лет!");
    }

    public static String getName() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.isEmpty() || str.matches(".*\\s+.*")){
            System.out.println("Name is empty!");
            System.out.println("Please input name:");
            return getName();
        }
        return str;
    }

    public static int getAge() {
        try {
            Scanner s = new Scanner(System.in);
            return Integer.parseInt(s.nextLine());
        }  catch (NumberFormatException e){
            System.out.println("Wrong age!");
            System.out.println("Please input age:");
        }
        return getAge();
    }
}