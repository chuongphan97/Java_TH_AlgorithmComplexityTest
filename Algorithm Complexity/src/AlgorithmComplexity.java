import java.util.Scanner;

public class AlgorithmComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);
            frequentChar[ascii] += 1;
        }

        int max=0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (frequentChar[i] > max){
                max = frequentChar[i];
                character = (char) i;
            }
        }

        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
