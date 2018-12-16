import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = Integer.parseInt(s.nextLine());

        for (int i = array.length-1; i >= 0; i--)
            System.out.println(array[i]);

    }

}