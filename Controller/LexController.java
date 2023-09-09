package Controller;


import Model.LexModel;
import Model.LexModel2;
import View.LexView;

public class LexController {
    //private LexModel model;
    private LexView view;
    private LexModel2 model;

    // public LexController(LexModel model, LexView view) {
    //     this.model = model;
    //     this.view = view;
    // }

    public LexController(LexModel2 model, LexView view) {
        this.model = model;
        this.view = view;
    }

    public void processInput(String input) {
        if (input.contains("//")) {
            return;// Skip the line
        }
        //ArrayList<String> strs = new ArrayList<String>();
        String[] tokens = input.split("\\s+");
        for (String token : tokens) {
            String type = determineTokenType(token); //call determineTokenType method
            model.addToken(token);
            //strs.add(token + " is " + type);
            view.displayTokenInfo(token, type); //call displayTokenInfo from view class to print output
        }
    }

    public String determineTokenType(String token) {
        return model.getTokenType(token); //call getTokenType from model
    }

}
