package week3.day2;

public class Automation extends MultipleLanguage implements TestTool,Language{
	

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("RUBY LANG");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("JAVA LANG");
	}

	public void selinum() {
		// TODO Auto-generated method stub
		System.out.println("SELENIUM");
	}
	public static void main(String[] args) {
		Automation input=new Automation();
		input.python();
		input.java();
		input.selinum();
	}

}
