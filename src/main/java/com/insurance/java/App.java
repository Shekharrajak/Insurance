package main.java.com.insurance.java;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }

   /* Get actual class name to be printed on */
   static Logger log = Logger.getLogger(log4jExample.class.getName());
     log.debug("Hello this is a debug message");
	 log.info("Hello this is an info messag");
    public static void main(String[] args){
        ClaimApprovalManager cam = new ClaimApprovalManager();
        cam.processClaim(new HealthInsuranceSurveyor());
    }
}

/*

mvn clean
mvn compile
mvn package
java -cp target/Insurance-1.0-SNAPSHOT.jar main.java.com.insurance.java.App


*/