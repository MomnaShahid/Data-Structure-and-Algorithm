import java.util.Scanner;

public class Main {
    public static void main(String str[]) {
        int[] arr = new int[100]; // Initial size of the array
        int c = 0; // Number of elements in the array
        char choice;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1. Create array");
            System.out.println("2. Display array");
            System.out.println("3. Sorting in Ascending order");
            System.out.println("4. Sorting in Descending order");
            System.out.println("Enter Choice.....");
            choice = input.next().charAt(0);

            switch (choice) {
                case '1': {
                    char ch = 'y';
                    while (ch == 'y') {
                        System.out.print("\nEnter value to insert in array: ");
                        int n = input.nextInt();
                        if (c >= arr.length) {
                            // Resize the array if it's full
                            int[] temp = new int[arr.length * 2];
                         //   System.arraycopy(arr, 0, temp, 0, arr.length);
                            arr = temp;
                        }
                        arr[c] = n;
                        c++;
                        System.out.print("Do you want to enter more values? (y/n): ");
                        ch = input.next().charAt(0);
                    }
                    break;
                }
                case '2': {
                    System.out.println("Displaying the values:");
                    for (int i = 0; i < c; i++)
                        System.out.print(" " +arr[i] + " ");
                    System.out.println();
                    System.out.println();
                    break;
                }
                case '3':
                {
                    System.out.println("Sorting in Ascending order:");
                    System.out.println();
                    for (int i = 0; i < c; i++)
                    {
                        for (int j = 0; j < c - 1 - i; j++)
                        {
                            if (arr[j] > arr[j + 1])
                            {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < c; i++)
                        System.out.print(arr[i] + " ");
                    System.out.println();
                    break;
                }
                case '4':
                {
                    System.out.println("Sorting in Descending order:");
                    System.out.println();
                    for (int i = 0; i < c; i++)
                    {
                        for (int j = 0; j < c - 1 - i; j++)
                        {
                            if (arr[j] > arr[j + 1])
                            {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    for (int i = c-1; i >=0; i--)
                        System.out.print(arr[i] + " ");
                    System.out.println();
                    break;
                }
            }
        } while (choice != '3');
    }
}
