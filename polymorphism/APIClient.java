package week3.homeassignment.polymorphism;

public class APIClient {
	//Method with single argument
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint: "+ endpoint);
	}
	
	//Same method name with different argument type
	public void sendRequest(String endpoint, String requestBody,boolean requestStatus) {
		System.out.println("Endpoint: "+ endpoint);
		System.out.println("Request Body: "+ requestBody);
		System.out.println("Request Status: "+ requestStatus);
	}

	public static void main(String[] args){
		
		//Create object for APIclint class
		APIClient ac=new APIClient();
		ac.sendRequest("API");
		ac.sendRequest("RestAPI", "JSON", true);
	}
}
