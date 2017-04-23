public class Ticket implements Comparable<Ticket> {
  
    private int ID;
    public int problem;
    private int priority;
    private String username;

    //>>>>>>>>>>>>>> CONSTRUCTOR <<<<<<<<<<<<<<<
    public Ticket(int prob, String theUser){
	ID = (int)(Math.random() * 10000);
	problem = prob;
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

    public int getProb(){
	return problem;
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

    public void problemChange(int newP){
	problem = newP;
    }

}
