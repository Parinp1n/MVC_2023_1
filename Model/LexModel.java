package Model;

import java.util.ArrayList;
import java.util.List;

import Interface.LexerModel;

public class LexModel implements LexerModel { //implement interface
    private List<String> tokens = new ArrayList<>();

    public void addToken(String token) {
        tokens.add(token);
    }

    public List<String> getTokens() {
        return tokens;
    }

    public String getTokenType(String token) {
        if (isKeyword(token)) {
            return "Keyword";
        } else if (isIdentifier(token)) {
            return "Identifier";
        } else if (isSymbol(token)) {
            return "Symbol";
        } else if (isLiteral(token)) {
            return "Literal";
        } else {
            return "Unknown";
        }
    }

    private boolean isKeyword(String token) {
        // Define list of keywords
        String[] keywords = { "declare" };

        for (String keyword : keywords) {
            if (token.equals(keyword)) {
                return true;
            }
        }

        return false;
    }

    private boolean isIdentifier(String token) {
        // Check if the token is a valid identifier
        return token.matches("[a-zA-Z]+");
    }

    private boolean isSymbol(String token) {
        // Define list of symbols
        String[] symbols = { "=", "+" };

        for (String symbol : symbols) {
            if (token.equals(symbol)) {
                return true;
            }
        }
        return false;
    }

    private boolean isLiteral(String token) {
        // Check if the token is a literal
        return token.matches("-?\\d+(\\.\\d+)?");
    }
}
