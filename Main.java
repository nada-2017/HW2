import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char array[][] = new char[3][3];
        int random ;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = ' ';
            }
        }
        try {
            System.out.println("  |  |  \n--+--+--\n  |  |  \n--+--+--\n  |  |  ");
            System.out.println("Where would you like to play(1-9)? ");
            int num = s.nextInt();
            while (!isValid(array, num)) {
                System.out.println("Is not a valid move, choose another");
                num = s.nextInt();
            }

            do {
                array = fill(array, num, 'X');
                printBord(array);
                if (isWin(array)) {
                    System.out.println("You Win ! ");
                    break;
                }
                //random = (int) Math.floor(Math.random() * 10);
                random = (int) (Math.random() * (10) + 1);
                while (!isValid(array, random)) {
                    random = (int) (Math.random() * (10) + 1);
                }
                System.out.println("Computer choose :" + random);
                array = fill(array, random, 'O');
                printBord(array);
                if (isWin(array)) {
                    System.out.println("Computer Wins ! ");
                    break;
                }
                System.out.println("Where would you like to play(1-9)? ");
                num = s.nextInt();
                while (!isValid(array, num)) {
                    System.out.println("Is not a valid move, choose another");
                    num = s.nextInt();
                }

            } while (!isWin(array));

        }catch (InputMismatchException e1){
            System.out.println("Invalid Entry !");
        }
        catch (Exception e2){
            System.out.println(e2.getMessage());
        }
    }
    public static boolean isWin(char arr[][]){
        if(arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2] && arr[0][0] != ' ')
            return true;
        else if (arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2] && arr[0][0] != ' ')
            return true;
        else if (arr[0][0] == arr[1][0] && arr[0][0] == arr[2][0] && arr[0][0] != ' ')
            return true;
        else if (arr[0][1] == arr[1][1] && arr[0][1] == arr[2][1] && arr[0][1] != ' ')
            return true;
        else if (arr[0][2] == arr[1][2] && arr[0][2] == arr[2][2] && arr[0][2] != ' ')
            return true;
        else if (arr[1][0] == arr[1][1] && arr[1][0] == arr[1][2] && arr[1][0] != ' ')
            return true;
        else if (arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2] && arr[2][0] != ' ')
            return true;
        else if (arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0] && arr[0][2] != ' ')
            return true;
        return false;
    }
    public static void printBord (char array[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != 2)
                    System.out.print(array[i][j] + " |");
                else
                    System.out.print(array[i][j] + " ");

            }
            if (i != 2)
                System.out.println("\n--+--+--");
        }
        System.out.println();
    }
    public static boolean isValid(char array[][],int num) {
        try{
            if (num < 1 || num > 9)
                throw new Exception("invalid number");
        }catch (Exception e2){
            System.out.println(e2.getMessage());
        }
        switch (num){
            case 1:
                if (array[0][0] == ' '){
                    return true;
                }
                break;
            case 2:
                if (array[0][1] == ' '){
                    return true;
                }
                break;
            case 3:
                if (array[0][2] == ' '){
                    return true;
                }
                break;
            case 4:
                if (array[1][0] == ' '){
                    return true;
                }
                break;
            case 5:
                if (array[1][1] == ' '){
                    return true;
                }
                break;
            case 6:
                if (array[1][2] == ' '){
                    return true;
                }
                break;
            case 7:
                if (array[2][0] == ' '){
                    return true;
                }
                break;
            case 8:
                if (array[2][1] == ' '){
                    return true;
                }
                break;
            case 9:
                if (array[2][2] == ' '){
                    return true;
                }
                break;
        }
        return false;
    }
    public static char[][] fill(char array[][], int num, char c){
        try {
            if (c != 'X' && c != 'O')
                throw new Exception("Not valid");
            else if (num == 0 || num > 9)
                throw new Exception("invalid number");
        }catch (Exception e2){
            System.out.println(e2.getMessage());
        }
        switch (num){
            case 1:
                if (array[0][0] == ' '){
                    array[0][0] = c;
                    return array;
                }
                break;
            case 2:
                if (array[0][1] == ' '){
                    array[0][1] = c;
                    return array;
                }
                break;
            case 3:
                if (array[0][2] == ' '){
                    array[0][2] = c;
                    return array;
                }
                break;
            case 4:
                if (array[1][0] == ' '){
                    array[1][0] = c;
                    return array;
                }
                break;
            case 5:
                if (array[1][1] == ' '){
                    array[1][1] = c;
                    return array;
                }
                break;
            case 6:
                if (array[1][2] == ' '){
                    array[1][2] = c;
                    return array;
                }
                break;
            case 7:
                if (array[2][0] == ' '){
                    array[2][0] = c;
                    return array;
                }
                break;
            case 8:
                if (array[2][1] == ' '){
                    array[2][1] = c;
                    return array;
                }
                break;
            case 9:
                if (array[2][2] == ' '){
                    array[2][2] = c;
                    return array;
                }
                break;
        }
        return array;
    }
}