import Controller.LexController;
import Model.LexModel;
import Model.LexModel2;
import View.LexView;

public class Mvc_main {
    public static void main(String[] args) {
        //LexModel model = new LexModel();
        LexModel2 model = new LexModel2();
        LexView view = new LexView();
        LexController controller = new LexController(model, view);

        controller.start();
    }
}
