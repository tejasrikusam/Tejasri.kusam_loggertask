package intrestcal.exceptions;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class App extends Intrest{
    Scanner s=new Scanner(System.in);
    final Logger log=LogManager.getLogger(App.class);
    void App()
    {
		Scanner s=new Scanner(System.in);
		log.info("Enter area of site in square feet");
		float area=s.nextFloat();
		log.info("Do you need fully automated home\n1.YES\n2.NO");
		int choice=s.nextInt();
		if (choice==2)
		{
			log.info("select the type of house you need\n1.Standard material\n2.Above Standard material\n3.High Standard material");
			int material=s.nextInt();
			if (material<1 && material>3)
			{
				log.info("Enter valid choice");
			}
			else
			{
				log.info("cost of house construction : "+housecost(material,area));
			}
		}
		else if(choice==1)
		{
			log.info("cost of house construction : "+housecost(4,area));
		}
		else 
		{
			log.info("Enter your choice correctly");
		}
	}
public static void main( String[] args )
{
	App obj=new App();
	obj.App();
}
 
 }

