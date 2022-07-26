package first;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
		String passengername;
		int busNo;
		Date date;
		
		Booking(){
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter name of passenger;");
			passengername=scanner.next();
			System.out.println("Enter a bus no;");
			busNo=scanner.nextInt();
			System.out.println("Enter  date dd-mm-yyyy");
			String dateInput=scanner.next();
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
			try {
			date=dateFormat.parse(dateInput);		
		}catch(ParseException e) {
			e.printStackTrace();
		} 
		}
			public boolean isAvailable(ArrayList<Booking>booking,ArrayList<Bus_details>buses) {
			int capacity=0;
			for(Bus_details bus:buses) {
				if(bus.getBusNo() == busNo)
					capacity = bus.getCapacity();
			}
			int booked =0;
			for(Booking b:booking) {
				if(b.busNo==busNo&& b.date.equals(date)) {
					booked++;
				}
			}
			return booked < capacity ? true:false;
		}
			}

	


