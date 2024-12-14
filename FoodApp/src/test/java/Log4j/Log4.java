package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4 {
	private static Logger logger=LogManager.getLogger(Log4.class);

	public static void main(String[] args) {
		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.fatal("This is crash message");

	}

}
