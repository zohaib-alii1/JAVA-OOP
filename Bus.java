public class Bus{
	private String busNumber;
	private Seat[][] seats;
	private int rows;
	private int count=1;
	public Bus(){
		this("unknown",3);

		}
	public Bus(String busNumber,int rows){
		this.busNumber=busNumber;
	this.rows=rows;
		this.seats=new Seat[rows][4];

		for(int i=0;i<rows;i++){
			for(int j=0;j<4;j++){
				 seats[i][j]=new Seat(count);
					count++;
		}
		}

		}

	public void display(){
		for(int i=0;i<rows;i++){
			for(int j=0;j<4;j++){
				if(!seats[i][j].isReserved()){
					System.out.print("O");}
				else{
					System.out.print("X");}
			System.out.println(" ");
	}}

		}

	public void reserveseat(int seatnumber){
		for(int i=0;i<rows;i++){
			for(int j=0;j<4;j++){
				if(seats[i][j].getseatnumber()==seatnumber){
					if(seats[i][j].reserve()){
						System.out.println("Seat Reserved Successfully");}}

					else{
						System.out.println("Seat is alreaday Reserved");}}}

		}
	public int countseat(){
		int availble=0;
	
		for(int i=0;i<rows;i++)
			for(int j=0;j<4;j++)
				if(!seats[i][j].isReserved())
					availble++;
	 return availble;
		}
	



}