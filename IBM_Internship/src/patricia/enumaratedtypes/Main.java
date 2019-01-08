package patricia.enumaratedtypes;

import java.util.Date;

public class Main {
    public static String f(Date date) {
        String[] parts = date.toString().split(" ");
        StringBuffer sb = new StringBuffer();
        for (DayOfWeek dow : DayOfWeek.values()) {
            if (dow.ordinal() == date.getDay()) {
                sb.append(dow);
                sb.append(" ");
            }
        }
        for (Month month1 : Month.values()) {
            if (month1.ordinal() == date.getMonth()) {
                sb.append(month1);
                sb.append(" ");
            }
        }
        sb.append(parts[parts.length - 1]);
        return sb.toString();
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(f(date));
    }
}
