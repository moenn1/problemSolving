package Hackerrank;

public class TimeConversion {

    public static String timeConversion(String s) {
        String amPm = s.substring(8,10);
        String hours = s.substring(0,2);
        String minutes = s.substring(3,5);
        String seconds = s.substring(6,8);

        if(amPm.equalsIgnoreCase("PM") && Integer.parseInt(hours) != 12) {
            hours = String.valueOf(Integer.parseInt(hours) + 12);
        }
        else if (amPm.equalsIgnoreCase("AM") && Integer.parseInt(hours) == 12) {
            hours = "00";
        }
        return hours + ":" + minutes + ":" + seconds;
    }

}
