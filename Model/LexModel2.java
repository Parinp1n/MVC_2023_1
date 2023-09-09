package Model;

import java.util.ArrayList;
import java.util.List;

public class LexModel2 {
    private List<String> tokens = new ArrayList<>();

    public void addToken(String token) {
        tokens.add(token);
    }

    public List<String> getTokens() {
        return tokens;
    }

    public String getTokenType(String token) {
        if (isKeywordAndSign(token)) {
            return "Keyword and Sign";
        } else if (isVariable(token)) {
            return "Variable";
        } else if (isInteger(token)) {
            return "int";
        } else if (isAssignment(token)) {
            return "Assignment";
        } else if (isOperation(token)) {
            return "Operation";
        } else {
            return "Unknown";
        }
    }

    private boolean isKeywordAndSign(String token) {
        // Define your list of keywords and signs here
        String[] keywordsAndSigns = {"declare", "+"};

        for (String keywordOrSign : keywordsAndSigns) {
            if (token.equals(keywordOrSign)) {
                return true;
            }
        }

        return false;
    }

    private boolean isVariable(String token) {
        // Check if the token is a valid variable name
        return token.matches("[a-zA-Z]+");
    }

    private boolean isInteger(String token) {
        // Check if the token is an integer literal
        return token.matches("-?\\d+");
    }

    private boolean isAssignment(String token) {
        // Define your list of assignment operators here
        String[] assignments = {"="};

        for (String assignment : assignments) {
            if (token.equals(assignment)) {
                return true;
            }
        }

        return false;
    }

    private boolean isOperation(String token) {
        // Define your list of operations here
        String[] operations = {"+", "-", "*", "/"};

        for (String operation : operations) {
            if (token.equals(operation)) {
                return true;
            }
        }

        return false;
    }
}

