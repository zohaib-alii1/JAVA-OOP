public class Seat{
	private int seatnumber;
	private boolean reserved;

	public Seat(int seatnumber){
		this.seatnumber=seatnumber;
		reserved=false;

		}
	public boolean reserve(){
		if(reserved==false){
			reserved=true;
			return true;
		}
		else
			return false;
		
			}
	public boolean isReserved(){	
		return reserved;
		
		}
	public int getseatnumber(){
		return seatnumber;
		} 


}