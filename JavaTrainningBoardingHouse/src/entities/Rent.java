package entities;

public class Rent {
	
	private int rentNumber;
	private String studentName;
	private String studentEmail;
	private int room;
	
	public Rent() {
		
	}
	
	public Rent(int rentNumber, String studentName, String studentEmail, int room) {
	
		this.rentNumber = rentNumber;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.room = room;
	}
	
	public int getRentNumber() {
		return rentNumber;
	}
	public void setRentNumber(int rentNumber) {
		this.rentNumber = rentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	
	
	 
	 
	 
}
