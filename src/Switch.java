
public class Switch {

	public static void main(String[] args) {
		
		int n =4;
		
	switch (n) {
	case 1: {
	    System.out.println("Monday");
	    break;
		}
	case 2: {
	    System.out.println("Tuesday");
	    break;
		}
	case 3: {
	    System.out.println("wednesday");
	    break;
		}
	default:
		throw new IllegalArgumentException("Unexpected value: " + n);
	}
	
	
	
	}
}
