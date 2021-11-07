public class Image extends Element {
    String url;

    public Image(String url) {
        this.url = url;
    }

    public void print() { System.out.println("Image with name: " + this.url); }

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
    };
}