abstract class Element {
    Element parent;
    abstract void add(Element e);
    abstract void remove(Element e);
    abstract Element get();
    abstract void accept(Visitor v);

    public abstract void render();
}
