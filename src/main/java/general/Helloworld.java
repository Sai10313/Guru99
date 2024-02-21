package general;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Helloworld {
	

	private static Logger logger=LogManager.getLogger(Helloworld.class);
	public static void main(String[] args) {
		
		logger.info("this is information message");
		
		System.out.println("Hello Sai Kumar");
		logger.error("this is error message");
		logger.warn("This is warning messge");
		logger.fatal("this is fatal message");
		
	}

}
