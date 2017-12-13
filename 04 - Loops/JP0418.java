/*
(Display four patterns using loops)
Use nested loops that display the following patterns in four separate programs:
Pattern A
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
Pattern B
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
Pattern C
          1
        2 1
      3 2 1
    4 3 2 1
  5 4 3 2 1
6 5 4 3 2 1
Pattern D
1 2 3 4 5 6
  1 2 3 4 5
    1 2 3 4
      1 2 3
        1 2
          1
 */

public class JP0418 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }

        System.out.println("Pattern B");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7 - i; j++)
                System.out.print(j + " ");
            System.out.println();
        }

        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            // Print leading space
            for (int j = 6 - i; j >= 1; j--)
                System.out.print("  ");

            for (int j = i; j >= 1; j--)
                System.out.print(j + " ");
            System.out.println();
        }

        System.out.println("Pattern D");
        for (int i = 1; i <= 6; i++) {
            // Print leading space
            for (int j = i; j > 1; j--)
                System.out.print("  ");

            for (int j = 1; j <= 6 + 1 - i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
