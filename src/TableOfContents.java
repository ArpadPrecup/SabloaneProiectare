public class TableOfContents extends Element{
    private String something;

    public TableOfContents(String smt){
        this.something = smt;
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

    @Override
    void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void render() {
        System.out.println("Table of contents: " + something);
    }
}
