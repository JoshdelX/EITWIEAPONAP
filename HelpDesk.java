public class HelpDesk {

    private ArrayPriorityQueue tickets;
    private ArrayList keyWords;

    //>>>>>>>>>>>>>>> CONSTRUCTOR <<<<<<<<<<<<<<<
    public HelpDesk() {
	tickets = new ArrayPriorityQueue();
	keyWords = new ArrayList();
	keyWords.add("unplugged");
	keyWords.add("BSOD");
	keyWords.add("broken");
	//keyWords.add("word");
    }

    //>>>>>>>>>>>>>>> METHODS <<<<<<<<<<<<<<<
    public calculate(Ticket x) {
	x.setPriority(x.getID());
	String temp = x.getDesc();
	String temp2 = "";
	ArrayList stor = new ArrayList();
	for (int n = 0; n < temp.length(); n++ ) {
	    if (temp.substring(n, n+1) == " ") {
		stor.add(temp2);
	    }
	    else {

	    }
	}
    }

    public static void main(String[] args) {

    }

}
