import cs1.Keyboard;

public class HelpDesk {

    private ArrayPriorityQueue<Ticket> tickets;
    private static int count;

    //>>>>>>>>>>>>>>> CONSTRUCTOR <<<<<<<<<<<<<<<
    public HelpDesk() {
	tickets = new ArrayPriorityQueue<Ticket>();
	count = 0;
    }

    //>>>>>>>>>>>>>>> METHODS <<<<<<<<<<<<<<<
    //must be completed right after a ticket is created in order to ensure
    //that it's priority variable is set
    
    public static void calculatePriority(Ticket x) {
	int prior = count + x.problem;
	x.setPriority(prior);
	count++;
    }
    
    public static void main(String[] args) {
	
	System.out.println("Hello! Welcome to the magical Help Desk.");
	System.out.println("We're here to solve all of your problems. To begin, please tell us what your name is:");

	String inputName = Keyboard.readWord();

	System.out.println("Next, please input one number that best describes your problem. If you don't enter one of these integers, we will not solve your problem.");
	System.out.println("0: Hardware");
	System.out.println("1: Software");
	System.out.println("2: Internet");
	System.out.println("3: Login Credentials");
	int i = Keyboard.readInt();


	Ticket newU = new Ticket(i, inputName);
	calculatePriority(newU);

	if ( i == 0 || i == 1 || i == 3){
	    System.out.println("Hold on, we will get you connected with an expert shortly.");
	}
	else if ( i == 2){
	    System.out.println("Reboot your router.");
	}
	else{
	    System.out.println("That is invalid.");
	}
	    
    }

}
