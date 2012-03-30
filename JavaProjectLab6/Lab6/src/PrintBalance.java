import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2011.
 */
public class PrintBalance{

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		
		//Prompt for language
		System.out.println("Language/Sprache/Langue: (en/de/fr)");
		String language = scanInput.nextLine();
		System.out.println("Country/Pays/Land: (US/DE/FR");
		String country = scanInput.nextLine();
		
		Locale currentLocale = new Locale(language,country);
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
		
//		//Greeting
		System.out.println(messages.getString("greeting"));
		
//		//Get User's Name
		System.out.println(messages.getString("nameInquiry"));
		String name = scanInput.nextLine();
		System.out.println(messages.getString("nameAcknowledged")+name);
		
//		Print today's date, balance and bid goodbye
		
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, currentLocale);
		System.out.println(messages.getString("asOf")+ df.format(today));
		NumberFormat nf = NumberFormat.getCurrencyInstance(currentLocale);
		System.out.println(messages.getString("owe")+ nf.format(9876543.21));
		System.out.println(messages.getString("farewell"));
	}
}




