import java.util.*;
import java.lang.*;
import java.io.*;
class converter{

	public static void main(String args[]){
	int x;
	String username, password;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter username:");//username:user
    username = s.nextLine();
    System.out.print("Enter password:");//password:$1234@
    password = s.nextLine();
    if(username.equals("user") && password.equals("$1234@"))
    {
        System.out.println("Authentication Successful");
     
        StringBuilder sb = new StringBuilder();
			sb.append("Name");
			sb.append(",");
			sb.append("From");
			sb.append(",");
			sb.append("To");
			sb.append(",");
			sb.append("Amount");
			sb.append(",");
			sb.append("Converted Amount");
			sb.append("\r\n");

	
try
	{
		FileWriter fw = new FileWriter(new File("C:\\Users\\karti\\OneDrive\\Desktop\\class\\data.csv"));
		fw.write(sb.toString());

		do{
			

	
		System.out.println("***********************Welcome to the Currency Converter World************************\n");
		System.out.println("Choose one of the below options for the conversion from one currency unit to another\n");
		System.out.println("1.Convert from INR to USD\n");
		System.out.println("2.Convert from USD to INR\n");
		System.out.println("3.Convert from INR to Euro\n");
		System.out.println("4.Convert from Euro to INR\n");
		System.out.println("5.Convert from INR to AED\n");
		System.out.println("6.Convert from AED to INR\n");
		System.out.println("7.Convert from INR to HKD\n");
		System.out.println("8.Convert from HKD to INR\n");
		System.out.println("9.Convert from INR to AUD\n");
		System.out.println("10.Convert from AUD to INR\n");
		System.out.println("11.Convert from INR to NPR\n");
		System.out.println("12.Convert from NPR to INR\n");

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your option from above list and give their abbrevations too : ");
		int ch=sc.nextInt();
		System.out.println("Enter your Name : ");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter your From currency abbrevation : ");
		String from = sc.next();
		sc.nextLine();
		System.out.println("Enter your To currency abbrevation : ");
		String to = sc.next();



		
		System.out.println("Enter your amount:");		
		double y=sc.nextDouble();

		
		double z;
		
		switch(ch){
			case 1:
			  System.out.println("Converting INR to USDollar:");
			  z=y/74.368;
			  System.out.println(z);

			  StringBuilder sb1 = new StringBuilder();

			  sb1.append(name);
			  sb1.append(",");
			  sb1.append(from);
			  sb1.append(",");
			  sb1.append(to);
			  sb1.append(",");
			  sb1.append(y);
			  sb1.append(",");
			  sb1.append(z);
			  sb1.append("\r\n");
			  fw.write(sb1.toString());
			  break;
			
			case 2:
              System.out.println("Converting USDollar to INR:");
			  z=y*74.368;
			  System.out.println(z);

			  StringBuilder sb2 = new StringBuilder();

			  sb2.append(name);
			  sb2.append(",");
			  sb2.append(from);
			  sb2.append(",");
			  sb2.append(to);
			  sb2.append(",");
			  sb2.append(y);
			  sb2.append(",");
			  sb2.append(z);
			  sb2.append("\r\n");
			  fw.write(sb2.toString());
			  break;
      
           case 3:
			  System.out.println("Converting INR to Euro:");
			  z=y/88.465;
			  System.out.println(z);

			  StringBuilder sb3 = new StringBuilder();

			  sb3.append(name);
			  sb3.append(",");
			  sb3.append(from);
			  sb3.append(",");
			  sb3.append(to);
			  sb3.append(",");
			  sb3.append(y);
			  sb3.append(",");
			  sb3.append(z);
			  sb3.append("\r\n");
			  fw.write(sb3.toString());
			  break;
   
           case 4:
			  System.out.println("Converting Euro to INR:");
			  z=y*88.465;
			  System.out.println(z);

			  StringBuilder sb4 = new StringBuilder();

			  sb4.append(name);
			  sb4.append(",");
			  sb4.append(from);
			  sb4.append(",");
			  sb4.append(to);
			  sb4.append(",");
			  sb4.append(y);
			  sb4.append(",");
			  sb4.append(z);
			  sb4.append("\r\n");
			  fw.write(sb4.toString());
			  break;
 
           case 5:
			  System.out.println("Converting INR to AED:");
			  z=y/20.2456;
			  System.out.println(z);

			  StringBuilder sb5 = new StringBuilder();

			  sb5.append(name);
			  sb5.append(",");
			  sb5.append(from);
			  sb5.append(",");
			  sb5.append(to);
			  sb5.append(",");
			  sb5.append(y);
			  sb5.append(",");
			  sb5.append(z);
			  sb5.append("\r\n");
			  fw.write(sb5.toString());
			  break;
    
           case 6:
			  System.out.println("Converting AED to INR:");
			  z=y*20.2456;
              System.out.println(z);

              StringBuilder sb6 = new StringBuilder();

              sb6.append(name);
			  sb6.append(",");
              sb6.append(from);
			  sb6.append(",");
			  sb6.append(to);
			  sb6.append(",");
			  sb6.append(y);
			  sb6.append(",");
			  sb6.append(z);
			  sb6.append("\r\n");
			  fw.write(sb6.toString());
			  break;
	
		   case 7:
			  System.out.println("Converting INR to HKD:");
			  z=y/9.346;
              System.out.println(z);

              StringBuilder sb7 = new StringBuilder();

              sb7.append(name);
			  sb7.append(",");
              sb7.append(from);
			  sb7.append(",");
			  sb7.append(to);
			  sb7.append(",");
			  sb7.append(y);
			  sb7.append(",");
			  sb7.append(z);
			  sb7.append("\r\n");
			  fw.write(sb7.toString());
			  break;
		
		   case 8:
			  System.out.println("Converting HKD to INR:");
			  z=y*9.346;
              System.out.println(z);

              StringBuilder sb8 = new StringBuilder();

              sb8.append(name);
			  sb8.append(",");
              sb8.append(from);
			  sb8.append(",");
			  sb8.append(to);
			  sb8.append(",");
			  sb8.append(y);
			  sb8.append(",");
			  sb8.append(z);
			  sb8.append("\r\n");
			  fw.write(sb8.toString());
			  break;
   
   	       case 9:
			  System.out.println("Converting INR to AUD:");
			  z=y/56.136;
              System.out.println(z);

              StringBuilder sb9 = new StringBuilder();

              sb9.append(name);
			  sb9.append(",");
              sb9.append(from);
			  sb9.append(",");
			  sb9.append(to);
			  sb9.append(",");
			  sb9.append(y);
			  sb9.append(",");
			  sb9.append(z);
			  sb9.append("\r\n");
			  fw.write(sb9.toString());
			  break;
		 
		   case 10:
			  System.out.println("Converting AUD to INR:");
			  z=y*56.136;
              System.out.println(z);

              StringBuilder sb10 = new StringBuilder();

              sb10.append(name);
			  sb10.append(",");
              sb10.append(from);
			  sb10.append(",");
			  sb10.append(to);
			  sb10.append(",");
			  sb10.append(y);
			  sb10.append(",");
			  sb10.append(z);
			  sb10.append("\r\n");
			  fw.write(sb10.toString());
			  break;
	   
	      case 11:
			  System.out.println("Converting INR to NPR:");
			  z=y/0.6243;
              System.out.println(z);

              StringBuilder sb11 = new StringBuilder();

              sb11.append(name);
			  sb11.append(",");
              sb11.append(from);
			  sb11.append(",");
			  sb11.append(to);
			  sb11.append(",");
			  sb11.append(y);
			  sb11.append(",");
			  sb11.append(z);
			  sb11.append("\r\n");
			  fw.write(sb11.toString());
			  break;
	 
	 	   case 12:
			  System.out.println("Converting NPR to INR:");
			  z=y*0.6243;
              System.out.println(z);

              StringBuilder sb12 = new StringBuilder();

              sb12.append(name);
			  sb12.append(",");
              sb12.append(from);
			  sb12.append(",");
			  sb12.append(to);
			  sb12.append(",");
			  sb12.append(y);
			  sb12.append(",");
			  sb12.append(z);
			  sb12.append("\r\n");
			  fw.write(sb12.toString());
			  break;
 
         default:
               System.out.println("Choosed option is not found in our conversion tool ");			
		}
		    
			
		System.out.println("To continue for another conversion press 1 or anyother number else 0 to exit from the Currency Converter World.");
		x=sc.nextInt();
	} 
	while(x>0);
	fw.close();
	System.out.println("Thank you for using Currency Converter! Have a Great Day!");
	System.out.println("CSV file created successfully.");
}

	catch(Exception e)
	{
		System.out.println(e);
	}
	
    }
    else
    {
        System.out.println("Authentication Failed");
    }

	}
}
