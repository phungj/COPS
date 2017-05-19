import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jmanrocks152 on 5/19/17.
 */
public class Main {
    public static void main(String[] args) {
        //Variable initialization
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        String MxyString;
        String houseNumbersString;
        String delims = "[ ]+";
        String[] MxyTokens;
        String[] houseNumbersTokens;
        ArrayList<Integer> MxyArrayList = new ArrayList<>();
        ArrayList<Integer> houseNumbersArrayList = new ArrayList<>();
        ArrayList<Integer> safeHouses = new ArrayList<>();

        //For loop that parses the input
        for(int i = 0; i < testCases; i++) {
            MxyString = scanner.next();
            //Need to figure out how to get this to read the next line
            houseNumbersString = scanner.next();
            MxyTokens = MxyString.split(delims);
            houseNumbersTokens = houseNumbersString.split(delims);

            for(int x = 0; x < MxyTokens.length; x++ ) {
                MxyArrayList.add(x);
            }

            for(int y = 0; y < houseNumbersTokens.length; y++) {
                houseNumbersArrayList.add(y);
            }

        }
    }
}
