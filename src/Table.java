public class Table extends Element{
    String something;
    public Table(String smt){
        this.something = smt;
    }

    public void print(){
        System.out.println("Table name:  " + this.something);
    }

    @Override
    public void add(Element e) {
        return;
    }

    @Override
    public void remove(Element e) {
        return;
    }

    @Override
    public Element get() {
        return this;
    }
}
