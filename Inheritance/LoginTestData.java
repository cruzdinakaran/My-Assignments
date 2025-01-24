package week3.homeassignment.Inheritance;

//Create sub class and inherit from  superclass(TestData)
public class LoginTestData extends TestData {
	
	public void enterUsername(){
		System.out.println("Enter Username");
	}
	
	public void enterPassword(){
		System.out.println("Enter Password");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create object for subclass
		LoginTestData l=new LoginTestData();
		l.enterCredentials();
		l.enterUsername();
		l.enterPassword();
		l.navigateToHomePage();

	}

}
