package intrestcal.exceptions;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class App extends Intrest{
    Scanner s=new Scanner(System.in);
    void App()
    {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter area of site in square feet");
		float area=s.nextFloat();
		System.out.println("Do you need fully automated home\n1.YES\n2.NO");
		int choice=s.nextInt();
		if (choice==2)
		{
			System.out.println("select the type of house you need\n1.Standard material\n2.Above Standard material\n3.High Standard material");
			int material=s.nextInt();
			if (material<1 && material>3)
			{
				System.out.println("Enter valid choice");
			}
			else
			{
				System.out.println("cost of house construction : "+housecost(material,area));
			}
		}
		else if(choice==1)
		{
			System.out.println("cost of house construction : "+housecost(4,area));
		}
		else 
		{
			System.out.println("Enter your choice correctly");
		}
	}
public static void main( String[] args )
{
	App obj=new App();
	obj.App();
}
 
 }

