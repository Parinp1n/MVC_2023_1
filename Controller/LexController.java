package Controller;

import java.util.List;

import Interface.LexerModel;
import View.LexView;

public class LexController {
    private LexView view;
    private LexerModel model;

    public LexController(LexerModel model, LexView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        processInput(view.getInput()); //call getInput from view
    }

    public void processInput(List<String> inputLines) {
        for (String line : inputLines) {
            // Skip comments (lines containing "//")
            if (line.contains("//")) {
                continue;
            }
            String[] tokens = line.split("\\s+");
            for (String token : tokens) {
                String type = determineTokenType(token); // Call determineTokenType method
                model.addToken(token);
                view.displayTokenInfo(token, type); // Call displayTokenInfo from the view class to print output
            }
        }
    }

    public String determineTokenType(String token) {
        return model.getTokenType(token); // call getTokenType from model
    }

}
