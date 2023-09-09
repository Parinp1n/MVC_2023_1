package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LexView {
    public List<String> getInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter lines of input (press Ctrl+D to exit):");
        List<String> inputLines = new ArrayList<>();

        while (in.hasNextLine()) {
            String line = in.nextLine();
            inputLines.add(line);
        }
        in.close();
        return inputLines;
    }

    public void displayTokenInfo(String token, String type) {
        System.out.println(token + " is " + type);
    }
}
