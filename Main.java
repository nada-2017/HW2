import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Question 1
        System.out.println("Enter number of integers :");
        int n = s.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            array[i] = s.nextInt();
        }
        if (array[0] == array[n-1])
            System.out.println("The result is True");
        else
            System.out.println("The result is False");


/*

        //Question 2
        System.out.println("Enter number of integers :");
        int n = s.nextInt();
        int array[] = new int[n];
        int firstL=0, secondL=0, thirdL=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            array[i] = s.nextInt();
            if (array[i] > firstL)
                firstL = array[i];
        }
        for (int i = 0; i < n; i++) {
            if (array[i] > secondL && array[i] < firstL)
                secondL = array[i];
        }
        for (int i = 0; i < n; i++) {
            if (array[i] > thirdL && array[i] < secondL)
                thirdL = array[i];
        }
        System.out.println("3 largest elements of the said array are: "+firstL+" "+secondL+" "+thirdL);




        //Question 3
        System.out.println("Enter number of integers :");
        int n = s.nextInt();
        int array[] = new int[n];
        int sum =0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            array[i] = s.nextInt();
            sum+=array[i];
        }
        int average = sum/n;
        System.out.println("The average is : " + average);
        System.out.println("The numbers greater than the average are: ");
        for (int i = 0; i < n; i++) {
            if (array[i] > average)
                System.out.println(array[i]);
        }




        //Question 4
        System.out.println("Enter number of integers :");
        int n = s.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            array[i] = s.nextInt();
        }
        if (array[0] > array[n-1])
            System.out.println("Larger value between first and last element: " + array[0]);
        else
            System.out.println("Larger value between first and last element: " + array[n-1]);




        //Question 5
        System.out.println("Enter number of integers :");
        int n = s.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            array[i] = s.nextInt();
        }
        int first = array[0], last = array[n-1];
        int newArray[] = array;
        newArray[0] = last;
        newArray[n-1] = first;

        System.out.println("\nNew array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(newArray[i]+" ");
        }





        //Question 6
        System.out.println("Enter number of words :");
        int n = s.nextInt();
        String array[] = new String[n];
        ArrayList newArray = new ArrayList();
        int longest = 0;
        s.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter word: ");
            array[i] = s.nextLine();
            if (array[i].length() > longest)
                longest = array[i].length();
        }
        for (int i = 0; i < n; i++) {
            if(array[i].length() == longest)
                newArray.add(array[i]);
        }
        System.out.print("Result : " + newArray);




        //Question 7
        System.out.println("Enter number of integers :");
        int length = s.nextInt();
        System.out.print("Select a number for the menu: \n1-Accept elements of an array\n" +
                "2- Display elements of an array\n" +
                "3- Search the element within array\n" +
                "4- Sort the array\n" +
                "5- To Stop\n");
        int n = s.nextInt();
        int array[] = new int[length];
        while (n < 5) {
            switch (n) {
                case 1:
                    for (int i = 0; i < length; i++) {
                        System.out.println("Enter number: ");
                        array[i] = s.nextInt();
                    }break;
                case 2:
                    System.out.println("Elements of the array: ");
                    for (int i = 0; i < length; i++) {
                        System.out.println(array[i]+" ");
                    }break;
                case 3:
                    System.out.print("Enter the number you want to search for: ");
                    int num =  s.nextInt();
                    for (int i = 0; i < length; i++) {
                        if (array[i] == num) {
                            System.out.println("Found " + num + " in index " + i);
                            break;
                        }
                    }break;
                case 4:
                    Arrays.sort(array);
                    System.out.println("Elements of the array: ");
                    for (int i = 0; i < length; i++) {
                        System.out.println(array[i]+" ");
                    }break;
            }
            System.out.println("Select a number for the menu");
            n = s.nextInt();
        }




        //Question 8
        System.out.println("Enter number of integers :");
        int n = s.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            array[i] = s.nextInt();
        }
        System.out.println("Enter the number you want to search for: ");
        int num = s.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == num)
                count++;
        }
        System.out.println(num + " occurs " + count + " times");





        //Question 9
        System.out.println("Enter number of integers :");
        int n = s.nextInt();
        int array[] = new int[n];
        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            array[i] = s.nextInt();
            if (array[i] % 2 == 0)
                even.add(array[i]);
            else
                odd.add(array[i]);
        }
        odd.addAll(even);
        System.out.println("The result : "+odd);




        //Question 10
        System.out.println("Enter number of integers for each array :");
        int n = s.nextInt();
        int array1[] = new int[n];
        int array2[] = new int[n];
        System.out.println("Enter elements of First Array :");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            array1[i] = s.nextInt();
        }
        System.out.println("Enter elements of Second Array :");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            array2[i] = s.nextInt();
        }
        boolean result = false;
        for (int i = 0; i < n; i++) {
            if(array1[i] == array2[i])
                result = true;
            else
                result = false;
        }
        System.out.println("The result is : " + result);


 */
    }
}