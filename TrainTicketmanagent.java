//Train }Tickets management Application Using Core Java 
import java.util.Scanner;
public class TrainTicketmanagent{
	public static void main(String[] args) 
		{
		
		int select1,select2,select3;
		int ticketPrice=0;
		long mobNumber;
		String bookdTickets="",Name;
		char ans,ans2;
		
		
		Scanner sc=new Scanner(System.in);
	do {
			System.out.println("****************************************************************************************************************");
			System.out.println("\t\t_________________WELCOME-TO-TICKET-BOOKING-Applcation___________________");
			System.out.println("***************************************************************************************************************");
			System.out.println();
			System.out.println("Enter your Name  ");
			Name=sc.nextLine();
			System.out.println("Enter your Mobile Number ");
			mobNumber=sc.nextLong();
			System.out.println();
			System.out.println("________Select location where you want to go_______");
			System.out.println();
			System.out.println("1. Train from Solapur to Mumbai ");
			System.out.println("2. Train from Solapur to Bengrulu ");
			System.out.println("3. Train from Solapur to Pune ");
			System.out.println("4. Train from Mumbai to Delhi");
			System.out.println("5. List of Vande Bharat Express for Travels");
			 
			select1=sc.nextInt();
		 
			do{
				switch(select1) // This is a first switch Statement case for selecting the option that is present inside the first do loop
				{
			
			case 1:
				System.out.println("Select  Trains from Solapur to Mumbai");
				System.out.println();
				System.out.println("1. 14805- Barmer Ac Express frome SUR(Solapur Junction) to KYN(Kalayn Junction) (Time 12 am)");
				System.out.println("2. 22160- Mumbai CSMT SF Express SUR(Solapur Junction) to CSMT (Time 12 pm)");
				System.out.println("3. 22731- Mumbai CSMT SF Express SUR(Solapur Junction) to CSMT(Time 4 pm)");
				System.out.println("4. 11014- Mumbai LTT Express SUR(Solapur Junction) to LTT(Loke Manya Tilak) (Time 4.15 am )");
				System.out.println("5. 11020 – Konark Express SUR(Solapur Junction) to CSMT (Time 7 am )");
				System.out.println("6. 16340 – Mumbai CSMT Express SUR(Solapur Junction) to CSMT SUR(Solapur Junction to LTT(Loke Manya Tilak) (Time 2 pm )");
				System.out.println();
				System.out.println("Select any Train to travel ");
				select2=sc.nextInt();
				switch(select2) // This is a second switch Statement case for selecting the option that is present inside the first switch statement  1  and case 1
				{
				case 1:
					System.out.println("____Welcome_to_Barmer__Ac__Express____");
					System.out.println();	
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday) ");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day  for  Travel to the  Barmer Ac Express");
					select3=sc.nextInt(); // This is a Third switch Statement case for selecting the option that is present inside the first switch statement  2 and case 1
					switch(select3)
					{
					   case 1:
					        ticketPrice += 300;
					        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
					        ans2 = sc.next().charAt(0);
					        if(ans2 == 'y' || ans2 == 'Y')
					        {
					            ticketPrice += 2;
					            bookdTickets += "\nInsurance price is Rs 2";
					        }
					        else
					        {
					            bookdTickets += "\nYou don't take any Insurance Policy";
					        }
					        bookdTickets += "\nTrain Ticket price is Rs 300";
					        bookdTickets += "\nTrain Day is Monday";
					        bookdTickets += "\nTrain time is 12 am";
					        bookdTickets += "\nTrain Name is 14805- Barmer Ac Express";
					        break;
					  case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\nInsurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\nTrain Ticket  price is Rs 300";
						bookdTickets+="\nTrain Day is Tuesday \nTrain time is 12 am  \nTrain Name is 14805- Barmer Ac Express";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 12 am  \n Train Name is 14805- Barmer Ac Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is  12 am \n Train Name is 14805- Barmer Ac Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 12 am  \n Train Name is 14805- Barmer Ac Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is  12 am \n Train Name is 14805- Barmer Ac Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 12 am  \n Train Name is 14805- Barmer Ac Express ";
						break;
					}
					break;
				 case 2:
			    	System.out.println("_______________Welcome_to_Mumbai__CSMT_SF_Express______________");
			    	System.out.println();	
			    	System.out.println("1.Train Day(Monday)");
			    	System.out.println("2.Train Day(Tuesday) ");
			    	System.out.println("3.Train Day(Wednesday)");
			    	System.out.println("4.Train Day(Thursday)");
			    	System.out.println("5.Train Day(Friday)");
			    	System.out.println("6.Train Day(Saturday)");
			    	System.out.println("7.Train Day(Sunday)");
			    	System.out.println();
			    	System.out.println("Select any day  for  Travel to the 22160-Mumbai CSMT SF Express ");
			    	select3=sc.nextInt(); // This is a Third switch Statement case for selecting the option that is present inside the first switch statement  2 and case 2
			    	switch(select3)
					{
					   case 1:
					        ticketPrice += 300;
					        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
					        ans2 = sc.next().charAt(0);
					        if(ans2 == 'y' || ans2 == 'Y')
					        {
					            ticketPrice += 2;
					            bookdTickets += "\nInsurance price is Rs 2";
					        }
					        else
					        {
					            bookdTickets += "\nYou don't take any Insurance Policy";
					        }
					        bookdTickets += "\nTrain Ticket price is Rs 300";
					        bookdTickets += "\nTrain Day is Monday";
					        bookdTickets += "\nTrain time is 12 pm";
					        bookdTickets += "\nTrain Name is 22160- Mumbai CSMT SF Express";
					        break;
					  case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\nInsurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\nTrain Ticket  price is Rs 300";
						bookdTickets+="\nTrain Day is Tuesday \nTrain time is 12 pm  \nTrain Name is 22160- Mumbai CSMT SF Express";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 12 pm  \n Train Name is 22160- Mumbai CSMT SF Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is  12 pm \n Train Name is 22160- Mumbai CSMT SF Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 12 pm  \n Train Name is 22160- Mumbai CSMT SF Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is  12 pm \n Train Name is 22160- Mumbai CSMT SF Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 12 pm  \n Train Name is 22160- Mumbai CSMT SF Express ";
						break;
					}
					
				
			    	break;
				case 3:
					System.out.println("_______________Welcome_to_Mumbai__CSMT_SF_Express___________");
					System.out.println();	
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday) ");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day  for  Travel to the  22731-Mumbai CSMT SF Express");
					select3=sc.nextInt(); // This is a Third switch Statement case for selecting the option that is present inside the first switch statement  2 and case 
					switch(select3)
					{
					   case 1:
					        ticketPrice += 300;
					        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
					        ans2 = sc.next().charAt(0);
					        if(ans2 == 'y' || ans2 == 'Y')
					        {
					            ticketPrice += 2;
					            bookdTickets += "\nInsurance price is Rs 2";
					        }
					        else
					        {
					            bookdTickets += "\nYou don't take any Insurance Policy";
					        }
					        bookdTickets += "\nTrain Ticket price is Rs 300";
					        bookdTickets += "\nTrain Day is Monday";
					        bookdTickets += "\nTrain time is 4 pm";
					        bookdTickets += "\nTrain Name is 22731- Mumbai CSMT SF Express";
					        break;
					  case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\nInsurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\nTrain Ticket  price is Rs 300";
						bookdTickets+="\nTrain Day is Tuesday \nTrain time is 4 pm  \nTrain Name is 22731- Mumbai CSMT SF Express";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 4 pm  \n Train Name is 22731- Mumbai CSMT SF Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is  4 pm \n Train Name is 22731- Mumbai CSMT SF Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 4 pm  \n Train Name is 22731- Mumbai CSMT SF Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is  4 pm \n Train Name is 22731- Mumbai CSMT SF Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 4 pm  \n Train Name is 22731- Mumbai CSMT SF Express ";
						break;
					}
					break;
				case 4:
					System.out.println("______________Welcome_to_Mumbai_LTT_Express_________________");
					System.out.println();	
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday) ");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day  for  Travel to the  Mumbai LTT Express");
					select3=sc.nextInt();
					switch(select3)
					{
					   case 1:
					        ticketPrice += 300;
					        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
					        ans2 = sc.next().charAt(0);
					        if(ans2 == 'y' || ans2 == 'Y')
					        {
					            ticketPrice += 2;
					            bookdTickets += "\nInsurance price is Rs 2";
					        }
					        else
					        {
					            bookdTickets += "\nYou don't take any Insurance Policy";
					        }
					        bookdTickets += "\nTrain Ticket price is Rs 300";
					        bookdTickets += "\nTrain Day is Monday";
					        bookdTickets += "\nTrain time is 4.15 am";
					        bookdTickets += "\nTrain Name is 11014- Mumbai LTT Express";
					        break;
					  case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\nInsurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\nTrain Ticket  price is Rs 300";
						bookdTickets+="\nTrain Day is Tuesday \nTrain time is 4.15 am  \nTrain Name is 11014- Mumbai LTT Express";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 4.15 am  \n Train Name is 11014- Mumbai LTT Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is 4.15 am\n Train Name is 11014- Mumbai LTT Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 4.15 am  \n Train Name is 11014- Mumbai LTT Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is  4.15 am \n Train Name is 11014- Mumbai LTT Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 4.15 am \n Train Name is 11014- Mumbai LTT Express ";
						break;
					}
					break;
				case 5:
					System.out.println("______________Welcome__to__Konark_Express_______________");
					System.out.println();	
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday) ");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day  for  Travel to the  Konark Express");
					select3=sc.nextInt();
					switch(select3)
					{
					   case 1:
					        ticketPrice += 300;
					        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
					        ans2 = sc.next().charAt(0);
					        if(ans2 == 'y' || ans2 == 'Y')
					        {
					            ticketPrice += 2;
					            bookdTickets += "\nInsurance price is Rs 2";
					        }
					        else
					        {
					            bookdTickets += "\nYou don't take any Insurance Policy";
					        }
					        bookdTickets += "\nTrain Ticket price is Rs 300";
					        bookdTickets += "\nTrain Day is Monday";
					        bookdTickets += "\nTrain time is Time 7 am";
					        bookdTickets += "\nTrain Name is 11020 – Konark Express";
					        break;
					  case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\nInsurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\nTrain Ticket  price is Rs 300";
						bookdTickets+="\nTrain Day is Tuesday \nTrain time is 7 am  \nTrain Name is 11020 – Konark Express ";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 7 am \n Train Name is 11020 – Konark Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is 7 am \n Train Name is 11020 – Konark Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 7 am  \n Train Name is 11020 – Konark Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is 7 am \n Train Name is 11020 – Konark Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 7 am \n Train Name is 11020 – Konark Express ";
						break;
					}
					break;
				case 6:
					System.out.println("____________Welcome_to_ Mumbai__CSMT__Express__________");
					System.out.println();	
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday) ");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day  for  Travel to the   Mumbai CSMT Express");
					select3=sc.nextInt();
					switch(select3)
					{
					   case 1:
					        ticketPrice += 300;
					        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
					        ans2 = sc.next().charAt(0);
					        if(ans2 == 'y' || ans2 == 'Y')
					        {
					            ticketPrice += 2;
					            bookdTickets += "\nInsurance price is Rs 2";
					        }
					        else
					        {
					            bookdTickets += "\nYou don't take any Insurance Policy";
					        }
					        bookdTickets += "\nTrain Ticket price is Rs 300";
					        bookdTickets += "\nTrain Day is Monday";
					        bookdTickets += "\nTrain time is Time 2 pm";
					        bookdTickets += "\nTrain Name is 16340 – Mumbai CSMT Express";
					        break;
					  case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\nInsurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\nTrain Ticket  price is Rs 300";
						bookdTickets+="\nTrain Day is Tuesday \nTrain time is  2 pm  \nTrain Name is 16340 – Mumbai CSMT Express ";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is  2 pm \n Train Name is 16340 – Mumbai CSMT Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is  2 pm \n Train Name is 16340 – Mumbai CSMT Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is  2 pm \n Train Name is 16340 – Mumbai CSMT Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is  2 pm \n Train Name is 16340 – Mumbai CSMT Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 2 pm \n Train Name is 16340 – Mumbai CSMT Express ";
						break;
					}
					break;
				default:
					System.out.println("Sorry this train is not avaliable");
					}
				break;
			
			case 2:
					System.out.println(" Select Trains from Solapur to Bengrulu ");
					System.out.println();
					System.out.println("1. 17308 – Basava Express SUR to Yashwantpur junction (Time 12 am) ");
					System.out.println("2. 11311 – Solapur-Hassan Express SUR to Yashwantpur junction (Time 12 pm) ");
					System.out.println("3. 16536 – Gol Gumbaz Express SUR to Yashwantpur junction (Time 4.15 am ) ");
					System.out.println("4. 11013 – Coimbatore Express SUR to KSR Bengrulu City (Time 7 am ) ");
					System.out.println("5. 11301 – Udyan Express SUR to KSR Bengrulu City (Time 2 pm )");
					System.out.println("6. 12628 – Karnataka Express SUR to KSR Bengrulu City (Time 7.20 pm ) ");
					System.out.println();
					System.out.println("Select any Train to Travel");
					select2=sc.nextInt();
					switch(select2)
					{
					case 1:
						System.out.println("_____________Welcome__Basava__Express____________");
						System.out.println();
						System.out.println("1.Train Day(Monday)");
						System.out.println("2.Train Day(Tuesday)");
						System.out.println("3.Train Day(Wednesday)");
						System.out.println("4.Train Day(Thursday)");
						System.out.println("5.Train Day(Friday)");
						System.out.println("6.Train Day(Saturday)");
						System.out.println("7.Train Day(Sunday)");
						System.out.println();
						System.out.println("Select any day for  Travel  to the Basava Express ");
						select3=sc.nextInt();
						switch(select3)
						{
						   case 1:
						        ticketPrice += 300;
						        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
						        ans2 = sc.next().charAt(0);
						        if(ans2 == 'y' || ans2 == 'Y')
						        {
						            ticketPrice += 2;
						            bookdTickets += "\nInsurance price is Rs 2";
						        }
						        else
						        {
						            bookdTickets += "\nYou don't take any Insurance Policy";
						        }
						        bookdTickets += "\nTrain Ticket price is Rs 300";
						        bookdTickets += "\nTrain Day is Monday";
						        bookdTickets += "\nTrain time is 12 am";
						        bookdTickets += "\nTrain Name is 17308 – Basava Express";
						        break;
						    
						

						  case 2:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2=='y' || ans2=='Y')
							{
								ticketPrice+=2;
								bookdTickets+="\nInsurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\nTrain Ticket  price is Rs 300";
							bookdTickets+="\nTrain Day is Tuesday \nTrain time is 12 am  \nTrain Name is 17308 – Basava Express ";
							break;
						case 3:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Wedensday \n Train time is 12 am  \n Train Name is 17308 – Basava Express ";
							break;
						case 4:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Thursday \n Train time is  12 am \n Train Name is 17308 – Basava Express ";
							break;
						case 5:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Friday \n Train time is 12 am  \n Train Name is 17308 – Basava Express ";
							break;
						case 6:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Saturday \n Train time is  12 am \n Train Name is 17308 – Basava Express ";
							break;
						case 7:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Sunday \n Train time is 12 am  \n Train Name is 17308 – Basava Express ";
							break;
						}
						break;
					case 2:
						System.out.println("__________Welcome__Solapur-Hassan_Express__________");
						System.out.println();
						System.out.println("1.Train Day(Monday)");
						System.out.println("2.Train Day(Tuesday)");
						System.out.println("3.Train Day(Wednesday)");
						System.out.println("4.Train Day(Thursday)");
						System.out.println("5.Train Day(Friday)");
						System.out.println("6.Train Day(Saturday)");
						System.out.println("7.Train Day(Sunday)");
						System.out.println();
						System.out.println("Select any day for  Travel  to the Solapur-Hassan Express");
						select3=sc.nextInt();
						switch(select3)
						{
						case 1:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is monday \n Train time is  12 pm \n Train Name is 11311 – Solapur-Hassan Express ";
							break;
						case 2:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Tuesday \n Train time is 12 pm  \n Train Name is 11311 – Solapur-Hassan Express ";
							break;
						case 3:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Wedensday \n Train time is 12 pm  \n Train Name is 11311 – Solapur-Hassan Express ";
							break;
						case 4:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Thursday \n Train time is  12 pm \n Train Name is 11311 – Solapur-Hassan Express ";
							break;
						case 5:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Friday \n Train time is 12 pm  \n Train Name is 11311 – Solapur-Hassan Express ";
							break;
						case 6:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Saturday \n Train time is  12 pm \n Train Name is 11311 – Solapur-Hassan Express ";
							break;
						case 7:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Sunday \n Train time is  12 pm \n Train Name is 11311 – Solapur-Hassan Express ";
							break;
						}
						break;
					case 3:
						System.out.println("_________Welcome__ Gol__Gumbaz__Express____________");
						System.out.println();
						System.out.println("1.Train Day(Monday)");
						System.out.println("2.Train Day(Tuesday)");
						System.out.println("3.Train Day(Wednesday)");
						System.out.println("4.Train Day(Thursday)");
						System.out.println("5.Train Day(Friday)");
						System.out.println("6.Train Day(Saturday)");
						System.out.println("7.Train Day(Sunday)");
						System.out.println();
						System.out.println("Select any day for  Travel  to the  Gol Gumbaz Express ");
						select3=sc.nextInt();
						switch(select3)
						{
						case 1:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is monday \n Train time is  4.15 am \n Train Name is  16536 – Gol Gumbaz Express ";
							break;
						case 2:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Tuesday \n Train time is 4.15 am  \n Train Name is  16536 – Gol Gumbaz Express ";
							break;
						case 3:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Wedensday \n Train time is 4.15 am  \n Train Name is  16536 – Gol Gumbaz Express ";
							break;
						case 4:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Thursday \n Train time is  4.15 am \n Train Name is  16536 – Gol Gumbaz Express ";
							break;
						case 5:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Friday \n Train time is  4.15 am \n Train Name is  16536 – Gol Gumbaz Express ";
							break;
						case 6:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Saturday \n Train time is 4.15 am  \n Train Name is  16536 – Gol Gumbaz Express ";
							break;
						case 7:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Sunday \n Train time is 4.15 am  \n Train Name is  16536 – Gol Gumbaz Express ";
							break;
						}
						break;
					case 4:
						System.out.println("___________Welcome__Coimbatore__Express______");
						System.out.println();
						System.out.println("1.Train Day(Monday)");
						System.out.println("2.Train Day(Tuesday)");
						System.out.println("3.Train Day(Wednesday)");
						System.out.println("4.Train Day(Thursday)");
						System.out.println("5.Train Day(Friday)");
						System.out.println("6.Train Day(Saturday)");
						System.out.println("7.Train Day(Sunday)");
						System.out.println();
						System.out.println("Select any day for  Travel  to the Coimbatore Express ");
						select3=sc.nextInt();
						switch(select3)
						{
						case 1:
							ticketPrice+=450;
							System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 450";
							bookdTickets+="\n Train Day is monday \n Train time is  7 am \n Train Name is 11013 – Coimbatore Express ";
							break;
						case 2:
							ticketPrice+=450;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 450";
							bookdTickets+="\n Train Day is Tuesday \n Train time is 7 am  \n Train Name is 11013 – Coimbatore Express ";
							break;
						case 3:
							ticketPrice+=450;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 450";
							bookdTickets+="\n Train Day is Wedensday \n Train time is  7 am \n Train Name is 11013 – Coimbatore Express ";
							break;
						case 4:
							ticketPrice+=450;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 450";
							bookdTickets+="\n Train Day is Thursday \n Train time is 7 am  \n Train Name is 11013 – Coimbatore Express ";
							break;
						case 5:
							ticketPrice+=450;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");							
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 450";
							bookdTickets+="\n Train Day is Friday \n Train time is 7 am  \n Train Name is 11013 – Coimbatore Express ";
							break;
						case 6:
							ticketPrice+=450;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 450";
							bookdTickets+="\n Train Day is Saturday \n Train time is  7 am \n Train Name is 11013 – Coimbatore Express ";
							break;
						case 7:
							ticketPrice+=450;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 450";
							bookdTickets+="\n Train Day is Sunday \n Train time is  7 am \n Train Name is 11013 – Coimbatore Express ";
							break;
						}
						break;
					case 5:
						System.out.println("_________Welcome__Udyan__Express__SUR_______");
						System.out.println();
						System.out.println("1.Train Day(Monday)");
						System.out.println("2.Train Day(Tuesday)");
						System.out.println("3.Train Day(Wednesday)");
						System.out.println("4.Train Day(Thursday)");
						System.out.println("5.Train Day(Friday)");
						System.out.println("6.Train Day(Saturday)");
						System.out.println("7.Train Day(Sunday)");
						System.out.println();
						System.out.println("Select any day for  Travel  to the Udyan Express SUR ");
						select3=sc.nextInt();
						switch(select3)
						{
						case 1:
							ticketPrice+=350;
							System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 350";
							bookdTickets+="\n Train Day is monday \n Train time is 2 pm  \n Train Name is 11301 – Udyan Express ";
							break;
						case 2:
							ticketPrice+=350;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 350";
							bookdTickets+="\n Train Day is Tuesday \n Train time is 2 pm   \n Train Name is 11301 – Udyan Express ";
							break;
						case 3:
							ticketPrice+=350;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 350";
							bookdTickets+="\n Train Day is Wedensday \n Train time is  2 pm  \n Train Name 11301 – Udyan Express ";
							break;
						case 4:
							ticketPrice+=350;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 350";
							bookdTickets+="\n Train Day is Thursday \n Train time is 2 pm   \n Train Name is 11301 – Udyan Express ";
							break;
						case 5:
							ticketPrice+=350;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 350";
							bookdTickets+="\n Train Day is Friday \n Train time is 2 pm   \n Train Name is 11301 – Udyan Express ";
							break;
						case 6:
							ticketPrice+=350;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 350";
							bookdTickets+="\n Train Day is Saturday \n Train time is  2 pm  \n Train Name is 11301 – Udyan Express ";
							break;
						case 7:
							ticketPrice+=350;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 350";
							bookdTickets+="\n Train Day is Sunday \n Train time is  2 pm  \n Train Name is 11301 – Udyan Express ";
							break;
						}
						break;
					case 6:
						System.out.println("___________Welcome__Karnataka__Express__________");
						System.out.println();
						System.out.println("1.Train Day(Monday)");
						System.out.println("2.Train Day(Tuesday)");
						System.out.println("3.Train Day(Wednesday)");
						System.out.println("4.Train Day(Thursday)");
						System.out.println("5.Train Day(Friday)");
						System.out.println("6.Train Day(Saturday)");
						System.out.println("7.Train Day(Sunday)");
						System.out.println();
						System.out.println("Select any day for  Travel  to the Karnataka Express ");
						select3=sc.nextInt();
						switch(select3)
						{
						case 1:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is monday \n Train time is 7.20 pm   \n Train Name is 12628 – Karnataka Express ";
							break;
						case 2:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Tuesday \n Train time is 7.20 pm  \n Train Name is 12628 – Karnataka Express ";
							break;
						case 3:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Wedensday \n Train time is 7.20 pm  \n Train Name 12628 – Karnataka Express ";
							break;
						case 4:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Thursday \n Train time is 7.20 pm  \n Train Name is 12628 – Karnataka Express ";
							break;
						case 5:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Friday \n Train time is 7.20 pm  \n Train Name is 12628 – Karnataka Express ";
							break;
						case 6:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Saturday \n Train time is 7.20 pm  \n Train Name is 12628 – Karnataka Express ";
							break;
						case 7:
							ticketPrice+=300;
							System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
							ans2 = sc.next().charAt(0);
							if(ans2 == 'y' || ans2 == 'Y')
							{
								ticketPrice+=2;
								bookdTickets+="\n Insurance price is Rs 2";
							}
							else
							{
								bookdTickets+="\n You don't take any Insurance Policy";
							}
							bookdTickets+="\n Train Ticket  price is Rs 300";
							bookdTickets+="\n Train Day is Sunday \n Train time is 7.20 pm  \n Train Name is 12628 – Karnataka Express ";
							break;
						}
						break;
						
					default:
						System.out.println("Sorry this train is not avalable ");
						break;
					}
					break;
			case 3:
				System.out.println("3. Trains from Solapur to Pune ");
				System.out.println();
				System.out.println("1. 14805 – Barmer AC Express SUR TO PUNE (Time 7.20 pm)");
				System.out.println("2. 22160 – Mumbai CSMT SF Express SUR TO PUNE (Time 2 pm)");
				System.out.println("3. 22731 – Mumbai CSMT SF Express SUR TO PUNE(Time 7 am)");
				System.out.println("4. 11014 – Mumbai LTT Express SUR TO PUNE(Time 4.15 am)");
				System.out.println("5. 22226 – Mumbai CSMT Vande Bharat Express SUR TO PUNE (Time 12 am )");
				System.out.println("6. 12158 – Hutatma Express SUR TO PUNE (Time 4 pm");
				System.out.println();
				System.out.println("Select any train to Travel ");
				select2=sc.nextInt();

				switch(select2)
				{
				case 1:
			        System.out.println("_______________Welcome_to_Barmer_AC_Express_______________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel  to 22160–Barmer AC Express");
					select3=sc.nextInt();
					switch(select3)
					{
					case 1:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is monday \n Train time is 7.20 pm   \n Train Name is 14805 – Barmer AC Express ";
						break;
					case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Tuesday \n Train time is 7.20 pm  \n Train Name is 14805 – Barmer AC Express ";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 7.20 pm  \n Train Name 14805 – Barmer AC Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is 7.20 pm  \n Train Name is 14805 – Barmer AC Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 7.20 pm  \n Train Name is 14805 – Barmer AC Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is 7.20 pm  \n Train Name is 14805 – Barmer AC Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 7.20 pm  \n Train Name is 14805 – Barmer AC Express ";
						break;
					}
					break;
				case 2:
			        System.out.println("________________Welcome_to_Mumbai___CSMT__SF__Express ___________________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel to 22731– Mumbai CSMT SF Express");
					select3=sc.nextInt();
					switch(select3)
					{
					case 1:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is monday \n Train time is 2 pm  \n Train Name is 22731– Mumbai CSMT SF Express ";
						break;
					case 2:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Tuesday \n Train time is 2 pm   \n Train Name is 22731– Mumbai CSMT SF Express ";
						break;
					case 3:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Wedensday \n Train time is  2 pm  \n Train Name 22731– Mumbai CSMT SF Express ";
						break;
					case 4:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Thursday \n Train time is 2 pm   \n Train Name is 22731– Mumbai CSMT SF Express ";
						break;
					case 5:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Friday \n Train time is 2 pm   \n Train Name is 22731– Mumbai CSMT SF Express ";
						break;
					case 6:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Saturday \n Train time is  2 pm  \n Train Name is 22731– Mumbai CSMT SF Express ";
						break;
					case 7:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Sunday \n Train time is  2 pm  \n Train Name is 22731– Mumbai CSMT SF Express ";
						break;
					}
					
					break;
				case 3:
			        System.out.println("________________Welcome_to_Mumbai___CSMT__SF__Express ___________________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel to Mumbai CSMT SF Express");
					select3=sc.nextInt();
					switch(select3)
					{
					case 1:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is monday \n Train time is  7 am \n Train Name is 22731 – Mumbai CSMT SF Express ";
						break;
					case 2:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Tuesday \n Train time is 7 am  \n Train Name is 22731 – Mumbai CSMT SF Express ";
						break;
					case 3:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Wedensday \n Train time is  7 am \n Train Name is 22731 – Mumbai CSMT SF Express ";
						break;
					case 4:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Thursday \n Train time is 7 am  \n Train Name is 22731 – Mumbai CSMT SF Express ";
						break;
					case 5:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");							
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Friday \n Train time is 7 am  \n Train Name is 22731 – Mumbai CSMT SF Express ";
						break;
					case 6:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Saturday \n Train time is  7 am \n Train Name is 22731 – Mumbai CSMT SF Express ";
						break;
					case 7:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Sunday \n Train time is  7 am \n Train Name is 22731 – Mumbai CSMT SF Express ";
						break;
					}
					break;
				case 4:
			        System.out.println("________________Welcome_to_Mumbai__LTT__Express ___________________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel to Mumbai LTT Express");
					select3=sc.nextInt();
					switch(select3)
					{
					case 1:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is monday \n Train time is  4.15 am \n Train Name is 11014 – Mumbai LTT Express ";
						break;
					case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Tuesday \n Train time is 4.15 am  \n Train Name is  11014 – Mumbai LTT Express ";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 4.15 am  \n Train Name is  11014 – Mumbai LTT Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is  4.15 am \n Train Name is  11014 – Mumbai LTT Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is  4.15 am \n Train Name is  11014 – Mumbai LTT Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is 4.15 am  \n Train Name is  11014 – Mumbai LTT Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 4.15 am  \n Train Name is  11014 – Mumbai LTT Express ";
						break;
					}
					break;
				case 5:
			        System.out.println("________________Welcome_to_Mumbai__CSMT__Vande__Bharat__Express ___________________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel to Mumbai CSMT Vande Bharat Express");
					select3=sc.nextInt();
					switch(select3)
					{
					   case 1:
					        ticketPrice += 300;
					        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
					        ans2 = sc.next().charAt(0);
					        if(ans2 == 'y' || ans2 == 'Y')
					        {
					            ticketPrice += 2;
					            bookdTickets += "\nInsurance price is Rs 2";
					        }
					        else
					        {
					            bookdTickets += "\nYou don't take any Insurance Policy";
					        }
					        bookdTickets += "\nTrain Ticket price is Rs 300";
					        bookdTickets += "\nTrain Day is Monday";
					        bookdTickets += "\nTrain time is 12 am";
					        bookdTickets += "\nTrain Name is 22226 – Mumbai CSMT Vande Bharat Express";
					        break;
					  case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\nInsurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\nTrain Ticket  price is Rs 300";
						bookdTickets+="\nTrain Day is Tuesday \nTrain time is 12 am  \nTrain Name is 22226 – Mumbai CSMT Vande Bharat Express ";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 12 am  \n Train Name is 22226 – Mumbai CSMT Vande Bharat Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is  12 am \n Train Name is 22226 – Mumbai CSMT Vande Bharat Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 12 am  \n Train Name is 22226 – Mumbai CSMT Vande Bharat Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is  12 am \n Train Name is 22226 – Mumbai CSMT Vande Bharat Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 12 am  \n Train Name is 22226 – Mumbai CSMT Vande Bharat Express ";
						break;
					}
					break;
				case 6:
			        System.out.println("________________Welcome_to_Hutatma__Express ___________________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel to Hutatma Express");
					select3=sc.nextInt();
					switch(select3)
					{
					   case 1:
					        ticketPrice += 300;
					        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
					        ans2 = sc.next().charAt(0);
					        if(ans2 == 'y' || ans2 == 'Y')
					        {
					            ticketPrice += 2;
					            bookdTickets += "\nInsurance price is Rs 2";
					        }
					        else
					        {
					            bookdTickets += "\nYou don't take any Insurance Policy";
					        }
					        bookdTickets += "\nTrain Ticket price is Rs 300";
					        bookdTickets += "\nTrain Day is Monday";
					        bookdTickets += "\nTrain time is 4 pm";
					        bookdTickets += "\nTrain Name is 12158 – Hutatma Express ";
					        break;
					  case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\nInsurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\nTrain Ticket  price is Rs 300";
						bookdTickets+="\nTrain Day is Tuesday \nTrain time is 4 pm  \nTrain Name is 12158 – Hutatma Express ";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 4 pm  \n Train Name is 12158 – Hutatma Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is  4 pm \n Train Name is 12158 – Hutatma Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 4 pm  \n Train Name is 12158 – Hutatma Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is  4 pm \n Train Name is 12158 – Hutatma Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 4 pm  \n Train Name is 12158 – Hutatma Express ";
						break;
					}
					break;
				default:
					System.out.println("Sorry  this Train in not avaliable ");
					break;
				}
			case 4:
				System.out.println("Select any trains from Muumbai to Delhi");
				System.out.println();
				System.out.println("1. 19019 – Haridwar Express from Mumbai to Hazrat Nizamuddin Delhi (Time 4 pm)");
				System.out.println("2. 12925 – Paschim SF Express from Mumbai to New Delhi station ( Time 12 am)");
				System.out.println("3. 12216 – Delhi Sarai Rohilla Garib Rath Express from Mumbai to Delhi Cantonment (Time 4.15 am )");
				System.out.println("4. 22949 – Delhi Sarai Rohilla SF Express from Mumbai to Delhi Cantonment (Time 7 am)");
				System.out.println("5. 22917 – Haridwar SF Express from Mumbai to Hazrat Nizamuddin Delh (Time 2 pm)");
				System.out.println("6. 22221 – Hazrat Nizamuddin Rajdhani Express from Mumbai to Hazrat Nizamuddin Delhi(Time 7.20 pm)");
				select2=sc.nextInt();
				switch(select2)
				{
				case 1:
			        System.out.println("_______________Welcome_to_Haridwar__Express_______________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel  to Haridwar Express");
					select3=sc.nextInt();
					switch(select3)
					{
					   case 1:
					        ticketPrice += 300;
					        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
					        ans2 = sc.next().charAt(0);
					        if(ans2 == 'y' || ans2 == 'Y')
					        {
					            ticketPrice += 2;
					            bookdTickets += "\nInsurance price is Rs 2";
					        }
					        else
					        {
					            bookdTickets += "\nYou don't take any Insurance Policy";
					        }
					        bookdTickets += "\nTrain Ticket price is Rs 300";
					        bookdTickets += "\nTrain Day is Monday";
					        bookdTickets += "\nTrain time is 4 pm";
					        bookdTickets += "\nTrain Name is 19019 – Haridwar Express ";
					        break;
					  case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\nInsurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\nTrain Ticket  price is Rs 300";
						bookdTickets+="\nTrain Day is Tuesday \nTrain time is 4 pm  \nTrain Name is 19019 – Haridwar Express ";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 4 pm  \n Train Name is 19019 – Haridwar Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is  4 pm \n Train Name is 19019 – Haridwar Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 4 pm  \n Train Name is 19019 – Haridwar Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is  4 pm \n Train Name is 19019 – Haridwar Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 4 pm  \n Train Name is 19019 – Haridwar Express ";
						break;
					}
					break;
				case 2:
			        System.out.println("_______________Welcome_to_ Paschim__SF__Expres_______________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel  to  Paschim SF Expres");
					select3=sc.nextInt();
					switch(select3)
					{
					   case 1:
					        ticketPrice += 300;
					        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
					        ans2 = sc.next().charAt(0);
					        if(ans2 == 'y' || ans2 == 'Y')
					        {
					            ticketPrice += 2;
					            bookdTickets += "\nInsurance price is Rs 2";
					        }
					        else
					        {
					            bookdTickets += "\nYou don't take any Insurance Policy";
					        }
					        bookdTickets += "\nTrain Ticket price is Rs 300";
					        bookdTickets += "\nTrain Day is Monday";
					        bookdTickets += "\nTrain time is 12 am";
					        bookdTickets += "\nTrain Name is 12925 – Paschim SF Express";
					        break;
					  case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\nInsurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\nTrain Ticket  price is Rs 300";
						bookdTickets+="\nTrain Day is Tuesday \nTrain time is 12 am  \nTrain Name is 12925 – Paschim SF Express ";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 12 am  \n Train Name is 12925 – Paschim SF Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is  12 am \n Train Name is 12925 – Paschim SF Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 12 am  \n Train Name is 12925 – Paschim SF Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is  12 am \n Train Name is 12925 – Paschim SF Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 12 am  \n Train Name is 12925 – Paschim SF Express ";
						break;
					}
					break;
				case 3:
			        System.out.println("_______________Welcome_to_ Delhi__Sarai__Rohilla__Garib__Rath__Express_______________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel  to  Delhi Sarai Rohilla Garib Rath Express");
					select3=sc.nextInt();
					switch(select3)
					{
					case 1:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is monday \n Train time is  4.15 am \n Train Name is 12216 – Delhi Sarai Rohilla Garib Rath Express ";
						break;
					case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Tuesday \n Train time is 4.15 am  \n Train Name is 12216 – Delhi Sarai Rohilla Garib Rath Express ";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 4.15 am  \n Train Name is  12216 – Delhi Sarai Rohilla Garib Rath Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is  4.15 am \n Train Name is 12216 – Delhi Sarai Rohilla Garib Rath Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is  4.15 am \n Train Name is 12216 – Delhi Sarai Rohilla Garib Rath Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is 4.15 am  \n Train Name is  12216 – Delhi Sarai Rohilla Garib Rath Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 4.15 am  \n Train Name is 12216 – Delhi Sarai Rohilla Garib Rath Express";
						break;
					}
					break;
				case 4:
			        System.out.println("_______________Welcome_to_Delhi__Sarai__Rohilla__SF__Express_______________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel  to  Delhi Sarai Rohilla SF Express");
					select3=sc.nextInt();
					switch(select3)
					{
					case 1:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is monday \n Train time is  7 am \n Train Name is 22949 – Delhi Sarai Rohilla SF Express ";
						break;
					case 2:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Tuesday \n Train time is 7 am  \n Train Name is 22949 – Delhi Sarai Rohilla SF Express ";
						break;
					case 3:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Wedensday \n Train time is  7 am \n Train Name is 22949 – Delhi Sarai Rohilla SF Express ";
						break;
					case 4:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Thursday \n Train time is 7 am  \n Train Name is 22949 – Delhi Sarai Rohilla SF Express ";
						break;
					case 5:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");							
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Friday \n Train time is 7 am  \n Train Name is 22949 – Delhi Sarai Rohilla SF Express ";
						break;
					case 6:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Saturday \n Train time is  7 am \n Train Name is 22949 – Delhi Sarai Rohilla SF Express ";
						break;
					case 7:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Sunday \n Train time is  7 am \n Train Name is 22949 – Delhi Sarai Rohilla SF Express ";
						break;
					}
					break;
				case 5:
			        System.out.println("_______________Welcome_to_Haridwar__SF__Express _______________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel  to  Haridwar SF Express ");
					select3=sc.nextInt();
					switch(select3)
					{
					case 1:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is monday \n Train time is 2 pm  \n Train Name is 22917 – Haridwar SF Express ";
						break;
					case 2:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Tuesday \n Train time is 2 pm   \n Train Name is 22917 – Haridwar SF Express ";
						break;
					case 3:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Wedensday \n Train time is  2 pm  \n Train Name 22917 – Haridwar SF Express ";
						break;
					case 4:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Thursday \n Train time is 2 pm   \n Train Name is 22917 – Haridwar SF Express ";
						break;
					case 5:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Friday \n Train time is 2 pm   \n Train Name is 22917 – Haridwar SF Express ";
						break;
					case 6:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Saturday \n Train time is  2 pm  \n Train Name is 22917 – Haridwar SF Express ";
						break;
					case 7:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Sunday \n Train time is  2 pm  \n Train Name is 22917 – Haridwar SF Express ";
						break;
					}
					break;
				case 6:
			        System.out.println("_______________Welcome_to_Hazrat__Nizamuddin__Rajdhani__Express______________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel  to  Hazrat Nizamuddin Rajdhani Express");
					select3=sc.nextInt();
					switch(select3)
					{
					case 1:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is monday \n Train time is 7.20 pm   \n Train Name is 22221 – Hazrat Nizamuddin Rajdhani Express ";
						break;
					case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Tuesday \n Train time is 7.20 pm  \n Train Name is 22221 – Hazrat Nizamuddin Rajdhani Express ";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 7.20 pm  \n Train Name 22221 – Hazrat Nizamuddin Rajdhani Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is 7.20 pm  \n Train Name is 22221 – Hazrat Nizamuddin Rajdhani Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 7.20 pm  \n Train Name is22221 – Hazrat Nizamuddin Rajdhani Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is 7.20 pm  \n Train Name is 22221 – Hazrat Nizamuddin Rajdhani Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 7.20 pm  \n Train Name is 22221 – Hazrat Nizamuddin Rajdhani Express ";
						break;
					}
					break;
				default:
					System.out.println("Sorry this train in not avaliable ");
					break;
				}
			
				break;	
			case 5:
				System.out.println("Select List of Vande Bharat Express for Travels");
				System.out.println();
				System.out.println("1. 22226- Mumbai CSMT Vande Bharat Express SUR to CSMT (Time 7.20 pm)");
				System.out.println("2. 12461- Vande Bharat Exp from JODHPUR JN to SABARMATI BG(Time 2 pm)");
				System.out.println("3. 12462- Ju Vande Bharat from DELHI to JODHPUR JN (Time 7 am)");
				System.out.println("4. 20902- Vande Bharat Exp from GANDHINAGAR CAP to MUMBAI CENTRAL(Time 12 am)");
				System.out.println("5. 22415- Vande Bharat Exp from VISAKHAPATNAM to NEW DELHI (Time 12 am)");
				select2=sc.nextInt();
				switch(select2)
				{
				case 1:
			        System.out.println("_______________Welcome_to_Mumbai CSMT Vande Bharat Express_______________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel  to Mumbai CSMT Vande Bharat Express");
					select3=sc.nextInt();
					switch(select3)
					{
					case 1:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is monday \n Train time is 7.20 pm   \n Train Name is 22226- Mumbai CSMT Vande Bharat Express ";
						break;
					case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Tuesday \n Train time is 7.20 pm  \n Train Name is 22226- Mumbai CSMT Vande Bharat Express ";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 7.20 pm  \n Train Name 22226- Mumbai CSMT Vande Bharat Express ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is 7.20 pm  \n Train Name is 22226- Mumbai CSMT Vande Bharat Express ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 7.20 pm  \n Train Name is 22226- Mumbai CSMT Vande Bharat Express ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is 7.20 pm  \n Train Name is 22226- Mumbai CSMT Vande Bharat Express ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 7.20 pm  \n Train Name is 22226- Mumbai CSMT Vande Bharat Express ";
						break;
					}
					break;
				case 2:
			        System.out.println("_______________Welcome_to_12461- Vande Bharat Exp______________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel  to 12461- Vande Bharat Exp");
					select3=sc.nextInt();
					switch(select3)
					{
					case 1:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is monday \n Train time is 2 pm  \n Train Name is 12461- Vande Bharat Exp ";
						break;
					case 2:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Tuesday \n Train time is 2 pm   \n Train Name is 12461- Vande Bharat Exp ";
						break;
					case 3:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Wedensday \n Train time is  2 pm  \n Train Name 12461- Vande Bharat Exp ";
						break;
					case 4:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Thursday \n Train time is 2 pm   \n Train Name is 12461- Vande Bharat Exp ";
						break;
					case 5:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Friday \n Train time is 2 pm   \n Train Name is 12461- Vande Bharat Exp ";
						break;
					case 6:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Saturday \n Train time is  2 pm  \n Train Name is 12461- Vande Bharat Exp ";
						break;
					case 7:
						ticketPrice+=350;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 350";
						bookdTickets+="\n Train Day is Sunday \n Train time is  2 pm  \n Train Name is 12461- Vande Bharat Exp ";
						break;
					}
					break;
				case 3:
			        System.out.println("_______________Welcome_to_12462- Ju Vande Bharat_______________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel  to 12462- Ju Vande Bharat");
					select3=sc.nextInt();
					switch(select3)
					{
					case 1:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is monday \n Train time is  7 am \n Train Name is  12462- Ju Vande Bharat ";
						break;
					case 2:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Tuesday \n Train time is 7 am  \n Train Name is  12462- Ju Vande Bharat ";
						break;
					case 3:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Wedensday \n Train time is  7 am \n Train Name is  12462- Ju Vande Bharat ";
						break;
					case 4:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Thursday \n Train time is 7 am  \n Train Name is  12462- Ju Vande Bharat ";
						break;
					case 5:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");							
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Friday \n Train time is 7 am  \n Train Name is  12462- Ju Vande Bharat ";
						break;
					case 6:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Saturday \n Train time is  7 am \n Train Name is  12462- Ju Vande Bharat ";
						break;
					case 7:
						ticketPrice+=450;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 450";
						bookdTickets+="\n Train Day is Sunday \n Train time is  7 am \n Train Name is  12462- Ju Vande Bharat ";
						break;
					}
					break;
				case 4:
			        System.out.println("_______________Welcome_to_20902- Vande Bharat Exp_______________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel  to 20902- Vande Bharat Exp");
					select3=sc.nextInt();
					switch(select3)
					{
					   case 1:
					        ticketPrice += 300;
					        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
					        ans2 = sc.next().charAt(0);
					        if(ans2 == 'y' || ans2 == 'Y')
					        {
					            ticketPrice += 2;
					            bookdTickets += "\nInsurance price is Rs 2";
					        }
					        else
					        {
					            bookdTickets += "\nYou don't take any Insurance Policy";
					        }
					        bookdTickets += "\nTrain Ticket price is Rs 300";
					        bookdTickets += "\nTrain Day is Monday";
					        bookdTickets += "\nTrain time is 12 am";
					        bookdTickets += "\nTrain Name is 20902- Vande Bharat Exp";
					        break;
					  case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\nInsurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\nTrain Ticket  price is Rs 300";
						bookdTickets+="\nTrain Day is Tuesday \nTrain time is 12 am  \nTrain Name is 20902- Vande Bharat Exp ";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 12 am  \n Train Name is 20902- Vande Bharat Exp ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is  12 am \n Train Name is 20902- Vande Bharat Exp ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 12 am  \n Train Name is 20902- Vande Bharat Exp ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is  12 am \n Train Name is 20902- Vande Bharat Exp ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2 == 'y' || ans2 == 'Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 12 am  \n Train Name is 20902- Vande Bharat Exp ";
						break;
					}
					break;
				case 5:
			        System.out.println("_______________Welcome_to_22415- Vande Bharat Exp_______________");
					System.out.println("1.Train Day(Monday)");
					System.out.println("2.Train Day(Tuesday)");
					System.out.println("3.Train Day(Wednesday)");
					System.out.println("4.Train Day(Thursday)");
					System.out.println("5.Train Day(Friday)");
					System.out.println("6.Train Day(Saturday)");
					System.out.println("7.Train Day(Sunday)");
					System.out.println();
					System.out.println("Select any day for travel  to 22415- Vande Bharat Exp");
					select3=sc.nextInt();
					switch(select3)
					{
					   case 1:
					        ticketPrice += 300;
					        System.out.println("Do You Want Insurance Policy It just Rs 2 (Yes\\No)");
					        ans2 = sc.next().charAt(0);
					        if(ans2 == 'y' || ans2 == 'Y')
					        {
					            ticketPrice += 2;
					            bookdTickets += "\nInsurance price is Rs 2";
					        }
					        else
					        {
					            bookdTickets += "\nYou don't take any Insurance Policy";
					        }
					        bookdTickets += "\nTrain Ticket price is Rs 300";
					        bookdTickets += "\nTrain Day is Monday";
					        bookdTickets += "\nTrain time is 12 am";
					        bookdTickets += "\nTrain Name is 22415- Vande Bharat";
					        break;
					  case 2:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\nInsurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\nTrain Ticket  price is Rs 300";
						bookdTickets+="\nTrain Day is Tuesday \nTrain time is 12 am  \nTrain Name is 22415- Vande Bharat";
						break;
					case 3:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Wedensday \n Train time is 12 am  \n Train Name is 22415- Vande Bharat ";
						break;
					case 4:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Thursday \n Train time is  12 am \n Train Name is 22415- Vande Bharat ";
						break;
					case 5:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Friday \n Train time is 12 am  \n Train Name is 22415- Vande Bharat ";
						break;
					case 6:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Saturday \n Train time is  12 am \n Train Name is 22415- Vande Bharat ";
						break;
					case 7:
						ticketPrice+=300;
						System.out.println("Do You Want Insurance Policy It just Rs 2  (Yes\\No)");
						ans2 = sc.next().charAt(0);
						if(ans2=='y' || ans2=='Y')
						{
							ticketPrice+=2;
							bookdTickets+="\n Insurance price is Rs 2";
						}
						else
						{
							bookdTickets+="\n You don't take any Insurance Policy";
						}
						bookdTickets+="\n Train Ticket  price is Rs 300";
						bookdTickets+="\n Train Day is Sunday \n Train time is 12 am  \n Train Name is 22415- Vande Bharat ";
						break;
					}
					break;
				default:
					System.out.println("Sorry this train is not avaliable");
					break;
				}
				break;
			default :
				System.out.println("Sorry no train avaliable for this location");
				break;
			
				}
				
			System.out.println("Do you want to book New Ticket fome same train (yes/no): ");
			ans = sc.next().charAt(0);
			
				}while(ans == 'Y'||ans == 'y') ;
			System.out.println("Do you want to Travel another place  (yes/no): ");
			ans = sc.next().charAt(0);
			}
			while(ans =='Y'||ans =='y') ;
			System.out.println("Your Name is "+Name);
			System.out.println("Your Numbar is "+mobNumber);
			System.out.println("Total Price:-"+ticketPrice);
			System.out.println(bookdTickets);
		}
	}
			
			
			
			






							

								
								
								
								
								
								
								
								
								
	




			
