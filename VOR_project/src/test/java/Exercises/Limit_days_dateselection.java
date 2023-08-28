package Exercises;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

	public class Limit_days_dateselection {
		
	
	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        // Get the current date
//	        LocalDate currentDate = LocalDate.now();
//
//	        // Calculate the maximum selectable date (7 days before the current date)
//	        LocalDate maxSelectableDate = currentDate.minusDays(6);
//
//	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy/MM/dd");
//
//	        // Loop until a valid date within the limit is entered
//	        LocalDate selectedDate = null;
//	        while (selectedDate == null || selectedDate.isBefore(maxSelectableDate)) {
//	            System.out.print("Enter the date (format: dd/mm/yyyy): ");
//	            String dateInput = scanner.nextLine();
//
//	            try {
//	                selectedDate = LocalDate.parse(dateInput, formatter);
//	                if (selectedDate.isBefore(maxSelectableDate)) {
//	                    System.out.println("Date must be within the last 6 days. Try again.");
//	                }
//	            } catch (Exception e) {
//	                System.out.println("Invalid date format. Try again.");
//	            }
//	        }
//
//	        String formattedDate = selectedDate.format(formatter);
//	        System.out.println("Selected date: " + formattedDate);
//
//	        // Assuming you want to use the selected date in your Selenium code
//	        // You can pass the 'formattedDate' value to your Selenium code
//
//	        // Remember to close the scanner
//	        scanner.close();
//	    }
//	}
//	
//	
	
	
	Scanner scanner = new Scanner(System.in);
	       System.out.println("enter from date: in : (format: yyyy/mm/dd)");
	       String dateinput = scanner.nextLine();
	       
	
	
	    }
	}
	
	
	
	
	
//	
//	import java.util.Scanner;
//	import java.util.Timer;
//	import java.util.TimerTask;
//
//	public class UserInputTimeoutExample {
//	    private static final int TIMEOUT_SECONDS = 10; // Set the desired timeout in seconds
//
//	    public static void main(String[] args) {
//	        final Scanner scanner = new Scanner(System.in);
//
//	        TimerTask task = new TimerTask() {
//	            @Override
//	            public void run() {
//	                System.out.println("Input timeout reached. Moving on to the next action.");
//	                // Execute the next set of code here
//	            }
//	        };
//
//	        Timer timer = new Timer();
//	        timer.schedule(task, TIMEOUT_SECONDS * 1000L); // Schedule the timeout task
//
//	        System.out.print("Enter the date (format: dd/mm/yyyy): ");
//	        String userInput = scanner.nextLine();
//
//	        timer.cancel(); // Cancel the timer task if user input is received within the timeout
//
//	        System.out.println("User input: " + userInput);
//	        // Continue with further actions using the user input
//	    }
//	}



