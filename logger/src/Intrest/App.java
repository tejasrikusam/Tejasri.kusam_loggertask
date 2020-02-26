package intrestcal.interstlog;

import java.util.Scanner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class App extends Intrest {
	Scanner s=new Scanner(System.in);
	final Logger log=LogManager.getLogger(App.class);
	void App()
	{
		log.info("Enter the type of interest you want to find\n1.SIMPLE INTEREST\n2.COMPOUND INTEREST");
		int type=s.nextInt();
		if(type==1)
		{
			log.info("Enter the principal amount");
			float principal_amount=s.nextFloat();
			log.info("Enter number of years");
			int years=s.nextInt();
			log.info("Enter rate of interest");
			float rate_of_interest=s.nextFloat();
			log.info("Simple interest is "+simple_interest(principal_amount,years,rate_of_interest));
		}
		else if(type==2)
		{
			log.info("Enter the principal amount");
			float principal_amount=s.nextFloat();
			log.info("Enter number of times to be calculated");
			int times_calc=s.nextInt();
			log.info("Enter number of years");
			int years=s.nextInt();
			log.info("Enter rate of interest");
			float rate_of_interest=s.nextFloat();
			log.info("Compound interest is "+compound_interest(principal_amount,times_calc,years,rate_of_interest));
		}
		else
			log.info("Please Enter options spedified in the above list");
	}

	public static void main(String args[])
	{
		App obj1=new App();
		obj1.App();
	}

       
 }

