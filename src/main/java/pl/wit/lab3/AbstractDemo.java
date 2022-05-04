package pl.wit.lab3;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


/**
 * Klasa abstrakcyjna demonstracyjna
 * @author Łukasz
 *
 */

public abstract class AbstractDemo implements IDemoLogger {
	protected static final Logger log = LogManager.getLogger(AbstractDemo.class.getName());
	//imię
	private String firstName=null;
	//nazwisko
	private String lastName=null;
	/**
	 * Typ osoby
	 * @return
	 */
	protected abstract EnPersonType getPersonType();
	
	public AbstractDemo(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		byte btValue = 0;
		int iValue = 365;
		btValue = 126;
		iValue = btValue;
		btValue = (byte) iValue;
	}

	public void printData() {
		String personType = getPersonType().getName();
		
		log.info((firstName!=null?firstName:"")
				.concat(" ")
				.concat(lastName!=null?lastName:"")
				.concat(" - ")
				.concat(personType!=null?personType:""));
	}

	public String getAdditionalInfo() {
		StringBuilder sb = new StringBuilder(getPersonType()!=null ? ":" + getPersonType() : " ");
		return sb.toString();
	}

}
