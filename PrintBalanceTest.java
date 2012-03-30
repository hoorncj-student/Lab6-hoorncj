import static org.junit.Assert.*;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;


public class PrintBalanceTest {

	private Locale  currentLocale;	
	private ResourceBundle  messages;
	
	@Test	
	public void testUSMessages() {		
		currentLocale  =  new  Locale("en",  "US");	
		messages  =  ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Hello World",messages.getString("greeting"));	
		assertEquals("Please enter your name",messages.getString("nameInquiry"));
		assertEquals("I am pleased to meet you ",messages.getString("nameAcknowledged"));
		assertEquals("As of ",messages.getString("asOf"));
		NumberFormat nf = NumberFormat.getCurrencyInstance(currentLocale);
		assertEquals("You owe the school $9,876,543.21" ,messages.getString("owe")+ nf.format(9876543.21));
		assertEquals("Good bye",messages.getString("farewell"));
		}	
	
	@Test	
	public void testDEMessages() {		
		currentLocale  =  new  Locale("de",  "DE");	
		messages  =  ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Hallo Welt",messages.getString("greeting"));	
		assertEquals("Bitte geben Sie Ihren Namen",messages.getString("nameInquiry"));
		assertEquals("Ich freue mich, Sie kennen zu lernen ",messages.getString("nameAcknowledged"));
		assertEquals("ab ",messages.getString("asOf"));
		NumberFormat nf = NumberFormat.getCurrencyInstance(currentLocale);
		assertEquals("Sie schulden die Schule 9.876.543,21 €" ,messages.getString("owe")+ nf.format(9876543.21));
		assertEquals("Auf Wiedersehen",messages.getString("farewell"));
		}
	
	@Test	
	public void testFRMessages() {		
		currentLocale  =  new  Locale("fr",  "FR");	
		messages  =  ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Bonjour tout le monde",messages.getString("greeting"));	
		assertEquals("S'il vous plaît entrer votre nom",messages.getString("nameInquiry"));
		assertEquals("Je suis heureux de vous rencontrer ",messages.getString("nameAcknowledged"));
		assertEquals("à partir de ",messages.getString("asOf"));
		NumberFormat nf = NumberFormat.getCurrencyInstance(currentLocale);
		assertEquals("vous devez l'école 9 876 543,21 €" ,messages.getString("owe")+ nf.format(9876543.21));
		assertEquals("Au revoir",messages.getString("farewell"));
		}	

	

}
