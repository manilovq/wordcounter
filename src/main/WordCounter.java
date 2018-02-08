

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) throws IOException{

        InputData inputData = readFile();
        System.out.println(countWords(inputData));


    }

    public static InputData readFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split("\\s");
        String fileDir = inputString[0];
        String pattern = inputString[1].toLowerCase();
        scanner.close();
        String str = "";
        Scanner in = new Scanner(new File(fileDir));
        while (in.hasNext()) {
            str += in.nextLine() + "\r\n";
        }
        in.close();
        return new InputData(str, pattern);

    }

    public static int countWords(InputData inputData) {
        String str = inputData.getInputString();
        String pattern = inputData.getPattern();
        String[] words = str.toLowerCase().split("\\s");
        int counter = 0;
        for ( String word : words) {
            if (word.equals(pattern))
                counter++;
        }
        return counter;
    }


}
