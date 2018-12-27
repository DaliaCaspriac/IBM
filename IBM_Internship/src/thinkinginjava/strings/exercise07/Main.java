package thinkinginjava.strings.exercise07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(isASentence("Afara ploua."));
        System.out.println(isASentence("Afara ploua"));
        System.out.println(isASentence("afara ploua"));
        System.out.println(isASentence("afara ploua."));
        System.out.println(isASentence("Afara ploua!"));
    }

    public static boolean isASentence(String sentence){
        String regex = "^[A-Z].+[.]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);
       return matcher.matches();
    }
}
