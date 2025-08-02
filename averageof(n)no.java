import java.util.Scanner;
public class Assign2intermdiate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        double count = 0;
        char c;
        while (true) {
            System.out.print("Enter any integer:");
            double n = sc.nextFloat();
            if (n < 0) {
                System.out.println("No positive integer is entered,cannot find average:");
                break;
            }
                if (n > 0) {
                    sum = sum + n;
                    count++;
                }
            System.out.print("Do you want to compute average now(Y/N):");
            c=sc.next().trim().charAt(0);
            if(c=='Y'||c=='y') {
                if (count != 0) {
                    average = sum / count;
                    System.out.print("The average of n number is:" + average);
                }
                break;
            }
            }
    }
}
