import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Question Number : ");
        int q = s.nextInt();
        switch (q){
            case 1 ://Question 1
                    System.out.println("Enter First Number: ");
                    int num1 = s.nextInt();
                    System.out.println("Enter Second Number: ");
                    int num2 = s.nextInt();
                    System.out.println(num1 + " + " + num2 + " = "  + (num1 + num2));
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
                    break;

            case 2 : //Question 2
                    System.out.println("Enter a text: ");
                    s.nextLine();//to read the input from the user and don't skip it
                    String str = s.nextLine();
                    System.out.println("Your text in lowercase : " + str.toLowerCase());
                    break;

            case 3 : //Question 3
                    System.out.println("Enter a text: ");
                    s.nextLine();//to read the input from the user and don't skip it
                    String str1 = s.nextLine();
                    System.out.println("Enter Number: ");
                    int num = s.nextInt();
                    System.out.println("The character in index " + num + " is : " + str1.charAt(num));
                    break;

            case 4:  //Question 4
                    System.out.println("Enter number bigger than 0 : ");
                    int num4 = s.nextInt();
                    if (num4 % 2 == 0){
                        System.out.println("The result is 1");
                    }
                    else {
                        System.out.println("The result is 0");
                    }
                    break;

            case 5 :  //Question 5
                    System.out.println("Enter your role: ");
                    s.nextLine();//to read the input from the user and don't skip it
                    String str2 = s.nextLine();
                    if (str2.equals("admin")){
                        System.out.println("Welcome admin");
                    } else if (str2.equals("superuser")) {
                        System.out.println("Welcome superuser");
                    } else if (str2.equals("user")) {
                        System.out.println("Welcome user");
                    }
                    else {
                        System.out.println("Error : Not a vail role");
                    }
                    break;

            case 6 :  //Question 6
                    System.out.println("Enter First Number: ");
                    int n1 = s.nextInt();
                    System.out.println("Enter Second Number: ");
                    int n2 = s.nextInt();
                    System.out.println("Enter Third Number: ");
                    int n3 = s.nextInt();
                    if (n1 + n2 == n3){
                        System.out.println("The result is True");
                    }
                    else {
                        System.out.println("The result is False");
                    }
                    break;

            case 7 :  //Question 7
                    System.out.println("Enter First Number: ");
                    int x1 = s.nextInt();
                    System.out.println("Enter Second Number: ");
                    int x2 = s.nextInt();
                    System.out.println("Enter Third Number: ");
                    int x3 = s.nextInt();
                    if(x1 > x2 && x1 > x3){
                        System.out.println("The greatest is : " + x1);
                    } else if (x2 > x1 && x2 > x3) {
                        System.out.println("The greatest is : " + x2);
                    }
                    else {
                        System.out.println("The greatest is : " + x3);
                    }
                    break;

            case 8 :  //Question 8
                    System.out.println("Enter number from 1 to 7 : ");
                    int number = s.nextInt();
                    switch (number){
                        case 1 : System.out.println("Sunday");break;
                        case 2 : System.out.println("Monday");break;
                        case 3 : System.out.println("Tuesday");break;
                        case 4 : System.out.println("Wednesday");break;
                        case 5 : System.out.println("Thursday");break;
                        case 6 : System.out.println("Friday");break;
                        case 7 : System.out.println("Saturday");break;
                        default:System.out.println("Not a valid number");break;
                    }
                    break;

            default:System.out.println("Not a valid number");break;
        }
    }
}
