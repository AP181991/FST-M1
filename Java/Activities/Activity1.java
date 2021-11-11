package SeleniumActivity;


public class Activity1 {

	public static void main(String[] args) {
		Car toyota = new Car();
        toyota.make = 2017;
        toyota.color = "White";
        toyota.transmission = "Automatic";
    
       
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();

	}

}
