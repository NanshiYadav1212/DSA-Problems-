import java.util.*;

public class ArmstrongNo {
    static boolean checkArmstrong(int num, int cnt)
    {
        int n = num;
        int newNum = 0;
        while (n > 0) {
            newNum += Math.pow(n % 10, cnt);
            n = n / 10;
        }
        return newNum == num;
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }

        int num = sc.nextInt();
        sc.close();

        int temp = num;
        int cnt = 0;
        while (temp > 0) {
            cnt++;
            temp = temp / 10;
        }

        boolean isArmstrong = checkArmstrong(num, cnt);
        System.out.println(num + (isArmstrong ? " is an Armstrong number." : " is not an Armstrong number."));
    }
}
