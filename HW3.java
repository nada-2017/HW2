import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        //Question 1
        for (int i = 1; i <= 100; i++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i%3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if(i%5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println("i = " + i);
        }


        //Question 2
        System.out.println("Enter a text: ");
        String str = s.nextLine();
        String result = "";
        char c[] = str.toCharArray();
        for (int i = str.length()-1; i >= 0 ; i--) {
            result+=c[i];
        }
        System.out.println("The result is : " + result);



        //Question 3
        System.out.println("Enter a positive number: ");
        int num = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }


        //Question 4
        System.out.println("Enter a positive number: ");
        int num6 = s.nextInt();
        int f = 1;
        for (int i = 2; i <= num6; i++) {
            f*=i;
        }
        System.out.println("The factorial = " + f);


        //Question 5
        System.out.println("Enter a first number: ");
        int num1 = s.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = s.nextInt();
        int sum = num1;
        for (int i = 1; i < num2; i++) {
            sum*= num1;
        }
        System.out.println("The result =  " + sum);


        //Question 6
        int sumOfEven = 0, sumOfOdd = 0;
        System.out.println("Enter number: ");
        int n1 = s.nextInt();
        while (n1 > 0){
            if (n1%2 == 0)
                sumOfEven+=n1;
            else
                sumOfOdd+=n1;
            System.out.println("Enter number(-1 to exit): ");
            n1 = s.nextInt();
        }
        System.out.println("Sum of even numbers =  " + sumOfEven);
        System.out.println("Sum of odd numbers =  " + sumOfOdd);


        //Question 7
        boolean flag = false;
        System.out.println("Enter number: ");
        int num7 = s.nextInt();
        for (int i = 2; i <= num7 / 2; ++i) {
            if (num7 % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println(num7 + " is not a prime number.");
        else
            System.out.println(num7 + " is a prime number.");


        //Question 8
        int sumOfPos = 0, sumOfNeg = 0, sumOfZeros = 0;
        Boolean flag1 = true;
        String str1 ;
        System.out.println("Enter number: ");
        int n5 = s.nextInt();
        while (flag1){
            if (n5 > 0)
                sumOfPos++;
            else if (n5 < 0)
                sumOfNeg++;
            else
                sumOfZeros++;
            System.out.println("Do you want to continue ?(yes or no) ");
            s.nextLine();
            str1 = s.nextLine();
            if (str1.equals("no")){
                flag1 = false;
                break;
            }
            System.out.println("Enter number: ");
            n5 = s.nextInt();
        }
        System.out.println("Number of positive numbers =  " + sumOfPos);
        System.out.println("Number of negative numbers =  " + sumOfNeg);
        System.out.println("Number of zeroes =  " + sumOfZeros);


        //Question 9
        for (int i = 1; i <= 4; i++) {
            System.out.println("Week " + i);
            for (int j = 1; j <= 7; j++) {
                System.out.println("Day " + j);
            }
        }


        //Question 10
        System.out.println("Enter a text: ");
        String str2 = s.nextLine();
        String result1 = "";
        char a[] = str2.toCharArray();
        for (int i = str2.length()-1; i >= 0 ; i--) {
            result1+=a[i];
        }
        if (str2.equals(result1))
            System.out.println("The word is a palindrome ");
        else
            System.out.println("The word isn't a palindrome ");

    }
}
