package example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;

public class TestLog4j {
	private static org.apache.log4j.Logger log=LogManager.getLogger(TestLog4j.class.getName());
public static void main(String args[]) {
	BasicConfigurator.configure();
	log.info("shanm");
	log.debug("king");
}
}
