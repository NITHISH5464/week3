package week3.day2;

public class Collage implements CollageDesign,ClassroomDesign{

	public void classWDoor() {
		// TODO Auto-generated method stub
		
	}

	public void classBoard() {
		// TODO Auto-generated method stub
		System.out.println("BLACK BOARD");
	}

	public void entranceWall() {
	
		// TODO Auto-generated method stub
		System.out.println("RATHINAM TECH");
	}

	public void mainGate() {
		// TODO Auto-generated method stub
		System.out.println("CHECK IN ");
	}

	public void building() {
		// TODO Auto-generated method stub
		System.out.println("ENGINEERING");
	}
	public static void main(String[] args) {
		Collage clg=new Collage();
		clg.building();
		clg.classBoard();
		clg.classDoor();
		clg.entranceWall();
		clg.mainGate();
		
				
	}

	public void classDoor() {
		// TODO Auto-generated method stub
		
	}
	

}
