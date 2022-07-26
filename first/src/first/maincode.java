package first;
import java.util.Scanner;
import java.util.ArrayList;
public class maincode {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bus_details> buses=new ArrayList<Bus_details>();
    	ArrayList<Booking> bookings=new ArrayList<Booking>();
    	
		buses.add(new Bus_details(1,true,1));
		buses.add(new Bus_details(2,false,2));
		buses.add(new Bus_details(3,true,3));
		
		int userop=1;
		Scanner scanner=new Scanner(System.in);
		
		for(Bus_details b:buses) {
			b.displaybusInfo();
		}
		
		while(userop==1) {
		System.out.println("Enter 1 for booking 2for Exit");
		userop=scanner.nextInt();
		
		if(userop==1) {
			System.out.println("please Enter your Details: ");
			Booking booking=new Booking();
			
			if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("your booking is confirmed");
			}
			else
				System.out.println("bus seats or full try other bus");
		}

	}

}}
