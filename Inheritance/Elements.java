package week3.homeassignment.Inheritance;

//Create sub class and inherit from  subclass(Button)
public class Elements extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebElement and Button class objects
		Elements e=new Elements();
		e.click();
		e.setText("Hello");
		e.submit();
		
		//TextField class Object
		TextField tf=new TextField();
		tf.getText();
		
		
		//RadioButton class object
		RadioButton rb=new RadioButton();
		rb.selectRadioButton();
		
		//CheckBoxButton class object
		CheckBoxButton cb=new CheckBoxButton();
		cb.clickCheckButton();
	}

}
