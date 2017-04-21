public class Ticket implements Comparable<Ticket> {
  
    private int ID;
    public String desc;
    private int priority;
    private String username;

    //>>>>>>>>>>>>>> CONSTRUCTOR <<<<<<<<<<<<<<<
    public Ticket(int theID, String theDesc, int thePrior, String theUser){
	ID = theID;
	desc = theDesc;
	priority = thePrior;
	username = theUser;
    }

    //>>>>>>>>>>>>>>> ACCESSORS <<<<<<<<<<<<<<<
    public int getID() {
	return ID;
    }

    public int getPriority() {
	return priority;
    }

    public String getUsername() {
	return username;
    }

    //>>>>>>>>>>>>>>> MUTATORS <<<<<<<<<<<<<<<
    public void setID(int x) {
	ID = x;
    }
    
    public void setPriority(int x) {
	priority = x;
    }

    public void setUsername(String x) {
	username = x;
    }

    //>>>>>>>>>> OTHER METHODS <<<<<<<<<<
    public int compareTo(Ticket x) {
	if (priority < x.getPriority()){
	    return -1;
	}
	else if (priority > x.getPriority()){
	    return 1;
	}
	return 0;
    }

}
