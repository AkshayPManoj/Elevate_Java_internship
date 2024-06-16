TASK - 1 - Student Grade Tracker
import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        // Input grades until the user wants to stop
        while (true) {
            System.out.print("Enter a grade (or enter 'done' to finish): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                double grade = Double.parseDouble(input);
                grades.add(grade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid grade.");
            }
        }

        // Calculate average, highest, and lowest grades
        if (!grades.isEmpty()) {
            double average = calculateAverage(grades);
            double highest = findHighest(grades);
            double lowest = findLowest(grades);

            // Display results
            System.out.println("\nGrade Summary:");
            System.out.println("==============");
            System.out.printf("Average Grade: %.2f\n", average);
            System.out.printf("Highest Grade: %.2f\n", highest);
            System.out.printf("Lowest Grade: %.2f\n", lowest);
        } else {
            System.out.println("No grades entered. Exiting program.");
        }

        scanner.close();
    }

    // Method to calculate the average of grades
    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to find the highest grade
    public static double findHighest(ArrayList<Double> grades) {
        double highest = Double.MIN_VALUE;
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public static double findLowest(ArrayList<Double> grades) {
        double lowest = Double.MAX_VALUE;
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}



