import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
//        int range;
        int arr[];

        do {
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Row does not exceed 5");
            }
        } while (size > 20);
        arr = new int[size];

//        do {
//            System.out.print("Enter the range of elements, from 0 to: ");
//            range = scanner.nextInt();
//            if (range > 50) {
//                System.out.println("Range does not exceed 50");
//            }
//        } while (range > 50);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Te Array: ");
        for (int x : arr) {
            System.out.print(x + "\t");
        }
        System.out.println();

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min element is: " + min);

    }
}
