package thinkinginjava.interfaces.exercise11;

public class SwapCharacters extends StringProcessor {

    @Override
    public String process(Object input) {
        String newString = "";
        int i = 0;
        while (i < ((String) input).length() - 1) {
            char first = ((String) input).charAt(i++);
            char second = ((String) input).charAt(i++);
            newString.concat(String.valueOf(second));
            newString.concat(String.valueOf(first));
        }
        return newString;
    }
}