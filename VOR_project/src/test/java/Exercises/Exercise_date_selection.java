package Exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise_date_selection {
	public static void main(String[] args) {
			
	        // Get the current date
	        LocalDate currentDate = LocalDate.now();

	        // Format the date according to your desired format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy/MM/dd");
	        String formattedDate = currentDate.format(formatter);
	        System.out.println(formattedDate);
	        
	    }
	
	
//	public void DateInputExample() 
	   
//	        Scanner scanner = new Scanner(System.in);
//	       System.out.println("enter from date: in : (format: yyyy/mm/dd)");
//	       String dateinput = scanner.nextLine();
//	       System.out.println(dateinput);
//	       
//	        
//	        System.out.print("Enter the date (format: dd/mm/yyyy): ");
//	        String dateInput = scanner.nextLine();
//
//	        // Assuming you want to use the entered date in Selenium
//        // You can pass the 'dateInput' value to your Selenium code
//
//	        System.out.println("Entered date: " + dateInput);
//
//	        // Remember to close the scanner
//	        scanner.close();
	}
	
	


