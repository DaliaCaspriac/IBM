package patricia.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
    /*
    To "titlelize" a string means to change the first letter of each word
    in the string to upper case (if it is not already upper case) - ignoring some words.
     For example, a capitalized version of "Now is the time to act!"
     is "Now Is the Time to Act!". Write an application  named that
     will print a titlelized version of a string to standard output.
     Words to ignore: the, a, to, in, of
     */
    public static String titlelize(String str){
        String[] parts = str.split(" ");
        String newString = "";
        Pattern pattern1 = Pattern.compile("^[a-z]");
        Pattern pattern2 = Pattern.compile("the|a|to|in|of");
        Matcher matcher1, matcher2;
        for(int i  = 0; i < parts.length; i++){
            matcher1 = pattern1.matcher(parts[i]);
            matcher2 = pattern2.matcher(parts[i]);
            if(matcher1.find() && !matcher2.find()){
                parts[i] = parts[i].replace(parts[i].substring(0,1),parts[i].substring(0,1).toUpperCase());
            }
            newString += parts[i] + " ";
        }
        return newString;
    }
    public static void main(String[] args) {
        String str = "Now is the time to act!";
        System.out.println(titlelize(str));
    }
}
