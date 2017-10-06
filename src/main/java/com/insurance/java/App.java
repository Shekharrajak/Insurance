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

    public static void main(String[] args){
        ClaimApprovalManager cam = new ClaimApprovalManager();
        cam.processClaim(new HealthInsuranceSurveyor());
    }
}

