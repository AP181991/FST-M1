package SeleniumActivity;
class CustomException extends Exception {
    private String message = null;
 
    public CustomException(String message) {
        this.message = message;
    }
 
    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity8 {

	public static void main(String[] args) {
		
		try {
            
            Project8.exceptionTest("Will print to console");
            
            Project8.exceptionTest(null); 
            Project8.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }
 
    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}