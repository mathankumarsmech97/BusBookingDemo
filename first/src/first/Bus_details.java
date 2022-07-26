package first;

public class Bus_details { 
		private int BusNo;
		private boolean ac;
		private int Capacity;
		
		Bus_details(int no,boolean ac,int cap){
			this.BusNo = no;
			this.ac = ac;
			this.Capacity = cap;
				}
		public int getBusNo() {
			return BusNo; 
		}
		public boolean getAc() {
			return ac;
		}
		public int getCapacity() {
			return Capacity;
		}
		public void setAc(boolean val) {
			ac = val;
		}
		public void setCapacity(int cap) {
			Capacity=cap;
		}public void displaybusInfo() {
			System.out.println("Bus No "+ BusNo+"ac: "+ ac +"Total capacity "+ Capacity);
		}
		
		
		
		

}
