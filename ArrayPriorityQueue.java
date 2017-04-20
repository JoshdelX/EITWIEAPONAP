//Team RubberDucks: Grace Cuenca, Despoina Sparakis
//APCS2 pd1
//HW32 -- Getting Past the Velvet Rope
//2017-04-19

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue{

    private ArrayList<Comparable> queue;

    public ArrayPriorityQueue(){
	queue = new ArrayList<Comparable>();
    }

    public void add (Comparable x){
	if ( isEmpty() ) {
	    queue.add(x);
	}
	else{
	    for (int i = 0; i < queue.size(); i++ ){
		if ( x.compareTo(queue.get(i)) <= 0 ){
		    queue.add(i,x);
		}
	    }
	    queue.add(x);
	}
    }

    public boolean isEmpty(){
	return queue.size() == 0;
    }

    public Comparable peekMin(){
	return queue.get(0);
    }

    public Object removeMin(){
	if ( isEmpty() ){
	    return "No elements to remove.";
	}
	else{
	    Comparable temp = queue.get(0);
	    queue.remove(0);
	    return temp;
	}
    }

    public String toString(){
	String ret = "";
	for (int x = 0; x < queue.size(); x++){
	    ret += queue.get(x) + "  ";
	}
	return ret;
    }

    public static void main (String[] args){
	ArrayPriorityQueue bob = new ArrayPriorityQueue();
	bob.add(6);
	bob.add(7);
	bob.add(9);
	System.out.println(bob.queue.size());
	System.out.println(bob);
	bob.removeMin();
	System.out.println(bob);
    }
}
