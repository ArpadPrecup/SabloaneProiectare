abstract class Element {
    Element parent;
    abstract void print();
    abstract void add(Element e);
    abstract void remove(Element e);
    abstract Element get();
}
