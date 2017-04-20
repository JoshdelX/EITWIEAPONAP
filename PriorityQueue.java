public interface PriorityQueue {

    public void add( Comparable x );
    
    public boolean isEmpty();

    public Comparable peekMin();

    public Object removeMin();

}
