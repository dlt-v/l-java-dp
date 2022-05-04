package pl.wit.lab3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Klasa pochodna - nauczyciel
 * @author Łukasz
 *
 */
public class TeacherDemo extends AbstractDemo {
	protected static final Logger log = LogManager.getLogger(AbstractDemo.class.getName());

	public TeacherDemo(String firstName, String lastName) {
		super(firstName, lastName);
	}
	@Override
	protected EnPersonType getPersonType() {
		return EnPersonType.teacher;
	}

	@Override
	public Logger getLogger() {
		return log;
	}
}
