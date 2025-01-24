package week3.homeassignment.polymorphism;

public class LoginPage extends BasePage {
	@Override 
	public void performCommonTasks() {
		System.out.println("PerformCommonTasks from login page");
	}
	
	public static void main(String[] args) {
		
		//Create object for LoginPage class
		LoginPage lp=new LoginPage();
		System.out.println("Print the Loginpage Class method");
		lp.performCommonTasks();
		
		//Create object for BasePage class
		BasePage bp=new BasePage();
		System.out.println("Print the BasePage Class  methods");
		bp.findElement();
		bp.enterText();
		bp.performCommonTasks();
	}
}
