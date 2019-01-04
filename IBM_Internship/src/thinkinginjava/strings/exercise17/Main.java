package thinkinginjava.strings.exercise17;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("File name: ");
//            String fileName = sc.nextLine();
            File file = new File("C:\\Users\\DaliaCaspriac\\IdeaProjects\\IBM_Internship\\src\\thinkinginjava\\strings\\exercise17\\code.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            Pattern pattern = Pattern.compile("[//].*|^[/*].*");
            Matcher matcher;
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    matcher = pattern.matcher(line);
                    if(matcher.find()) {
                        System.out.println(line.substring(matcher.start()));
                    }
                }
            }catch (IOException e){
                System.out.println(e);
            }
        }catch (FileNotFoundException e){
            System.out.println("-File not found");
        }
    }
}
