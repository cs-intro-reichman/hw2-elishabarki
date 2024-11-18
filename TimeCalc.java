public class TimeCalc {
    public static void main(String args[]) {

        String time = args[0];
        String stringHours = time.substring(0, 2);
        String stringMinutes = time.substring(3, 5);
        int hours = Integer.parseInt(stringHours);
        int minutes = Integer.parseInt(stringMinutes);
        
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        
        if ((newMinutes < 10) && (newHours >= 10)) {
            String newMinutesString = "0" + newMinutes;
            System.out.println(newHours+":"+newMinutesString);
            }

        if ((newMinutes < 10) && (newHours < 10)) {
            String newMinutesString = "0" + newMinutes;
            String newHoursString = "0" + newHours;
            System.out.println(newHoursString+":"+newMinutesString);
            }

        if ((newMinutes >= 10) && (newHours < 10)) {
            String newHoursString = "0" + newHours;
            System.out.println(newHoursString+":"+newMinutes);
            }

        if ((newMinutes >= 10) && (newHours >= 10)) {
            System.out.println(newHours+":"+newMinutes);
            }

    }
}
