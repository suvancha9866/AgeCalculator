import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.time.LocalDate;

public class Days {
	
	public static void main (String [] args)
	{
		//System.out.println(LocalDate.now());
		
		JOptionPane.showMessageDialog(null, "Welcome to my \"How many days were you alive for?\" Calculator.\nThis is not the most reliable calculator.\nProgrammed by: Suvan Chatakondu");
		String age1 = JOptionPane.showInputDialog("Enter your age in the box below. Ex: 12");
		int age2 = Integer.parseInt(age1);
		String month1  = JOptionPane.showInputDialog("Enter your birth month in the form of number. Ex: January = 1");
		int month2 = Integer.parseInt(month1);
		String day1 = JOptionPane.showInputDialog("Enter the day that you were born on.");
		int day2 = Integer.parseInt(day1);
		LocalDate currentdate = LocalDate.now();
		int todayMonth = currentdate.getMonthValue();
		System.out.println(todayMonth);
		int todayDay = currentdate.getDayOfMonth();
		int year = 0;
		
		ArrayList<String> months = new ArrayList<String>(12);
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		String wordMonth = months.get(month2 - 1) ;
		if(month2 > todayMonth)
		{
			year = currentdate.getYear() -1 - age2;
		}
		else if (month2 == todayMonth)
		{
			if(todayDay > day2)
			{
				year = currentdate.getYear() - age2;
			}
			else if(todayDay == day2)
			{
				JOptionPane.showMessageDialog(null, "Happy Birthday!!");
				year = currentdate.getYear() - age2;
			}
			else
			{
				year = currentdate.getYear() -1 - age2;
			}
		}
		else
		{
			year = currentdate.getYear() - age2;
		}
		
		if(age2 > 100)
		{
			JOptionPane.showMessageDialog(null, "Damn, bruh. You dead!");
		}
		
		double days = 0;
		int tempMonths = 0;
		
		if (todayDay > day2)
		{
			days = todayDay - day2;
		}
		else
		{
			days = todayDay + (30.5 - day2);
		}
		
		if(todayMonth > month2)
		{
			tempMonths = todayMonth - month2;
		}
		else if(todayMonth == month2 && day2 > todayDay) 
		{
			tempMonths = 11;
		}
		else
		{
			tempMonths = todayMonth + (12 - month2 - 1);
		}
		
		int leapYear = age2 / 4;
		days = days + (tempMonths * 30.5) + (age2 * 365) + leapYear;
		int days2 = (int)days;
		JOptionPane.showMessageDialog(null,"Your birthday is " +wordMonth+ " " +day2+ ", " +year );
		
		if(year < 1920)
		{
			JOptionPane.showMessageDialog(null,"The approximate number of days that you have been alive for is " +days2+ " days");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"The approximate number of days that this person was alive for is " +days2+ " days");
		}
		
	}

}

