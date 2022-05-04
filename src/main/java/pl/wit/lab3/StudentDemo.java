package pl.wit.lab3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Klasa pochodna - Student
 * @author Łukasz i Tomek :)
 *
 */
public class StudentDemo extends AbstractDemo {
	protected static final Logger log = LogManager.getLogger(AbstractDemo.class.getName());
	private Map<String, Byte> mapPoints = null;


	public StudentDemo(String firstName, String lastName) {
		super(firstName, lastName);
		mapPoints = new LinkedHashMap<String, Byte>();
	}
	@Override
	protected EnPersonType getPersonType() {
		return EnPersonType.student;
	}

	public void addPoints(String criteria, byte points) throws PersonException {
		if (criteria == null || criteria.equals("")) {
			throw new PersonException("Value can't be null.");
		}
		if (points < 0) {
			throw new PersonException("Points can't be negative value.");
		}
//		logDebug("Dodano " + criteria + ": " + points);
		mapPoints.put(criteria, Byte.valueOf(points));
	}

	public Map<String, Byte> getMapPoints() {
		return mapPoints;
	}

	public Logger getLogger() {
		return log;
	}
}
