//TASK - 3 - Digital Clock

import java.util.Date;

public class DigitalClock {

    public static void main(String[] args) {
        // Continuously update and display the current time
        while (true) {
            Date now = new Date();
            String formattedTime = formatTime(now);
            System.out.print("\r" + formattedTime); // Use carriage return for updating time in place
            try {
                Thread.sleep(1000); // Delay for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to format time in HH:mm:ss format
    private static String formatTime(Date date) {
        String formattedTime = String.format("%tT", date); // HH:mm:ss format
        return formattedTime;
    }
}
