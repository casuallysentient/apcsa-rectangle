import java.util.Scanner;

public class apcsarectangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("\nEnter the rectangle's length: ");
    double top = in.nextDouble();
    System.out.print("Enter the rectangle's width: ");
    double bottom = in.nextDouble();

    double area = ((top + bottom) / 2) * height;

    System.out.printf("\nThe area of the rectangle is %,.1f.\n", area);

    in.close();
  }
}
