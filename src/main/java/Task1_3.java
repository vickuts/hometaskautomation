import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
            array[i] = Integer.parseInt(s.nextLine());

        int j = 0;
        int k = 0;
        for (int i = 0; i < 20; i++) {
            if (array[i] % 2 == 0)
                j++;
            else
                k++;
        }

        int[] even = new int[j];
        int[] odd = new int[k];

        int l = 0;
        int m = 0;
        for (int i = 0; i < 20; i++) {
            if (array[i] % 2 == 0) {
                even[l] = array[i];
                l++;
            }
            else {
                odd[m] = array[i];
                m++;
            }
        }

        System.out.println("Even numbers:");
        for (int z = 0; z < even.length; z++)
            System.out.println(even[z]);
        System.out.print("\n");
        System.out.println("Odd numbers:");
        for (int y = 0; y < odd.length; y++){
            System.out.println(odd[y]);
        }
    }
}