import java.util.Scanner;


import Controller.LexController;
import Model.LexModel;
import Model.LexModel2;
import View.LexView;

public class Mvc_main {
    public static void main(String[] args) {
        //String input ="declare abc declare def abc = 1 def = abc + abc";
        LexModel2 model = new LexModel2();
        LexView view = new LexView();
        LexController controller = new LexController(model, view);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter lines of input (press Ctrl+D to exit):");

        while (in.hasNextLine()) {
            String line = in.nextLine();
            controller.processInput(line); //call method processInput
        }
        in.close();
    }
}
