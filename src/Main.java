import java.util.Scanner;

public class Main {

    static int desen(int number, int tempNumber, int tempNumber1) {


        if (number > 0) {
            System.out.print(number + ", ");
            return desen(number-5,tempNumber-5,tempNumber1);
        } else if (tempNumber == tempNumber1) {
            System.out.print(tempNumber );
            return number;
        } else {
            System.out.print(tempNumber + ", ");
            return desen(number,(tempNumber+5),tempNumber1);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = scanner.nextInt();
        int tempNumber = number;
        int tempNumber1 = number;

        desen(number,tempNumber,tempNumber1);

    }
}
