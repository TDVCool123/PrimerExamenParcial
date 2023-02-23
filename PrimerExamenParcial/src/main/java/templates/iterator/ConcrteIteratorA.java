package templates.iterator;

public class ConcrteIteratorA implements Iterator{

    private String[] names;
    private int positions=0;

    public ConcrteIteratorA(String[] names){
        this.names=names;
    }


    @Override
    public Object next() {
        return this.names[positions++];
    }

    @Override
    public boolean hasNext() {
        return this.names.length !=0 && positions < this.names.length;
    }
}
