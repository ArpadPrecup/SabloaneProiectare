import java.util.concurrent.TimeUnit;

public class Image extends Element {
    String name;

    public Image(String name) {
        this.name = name;
        try{
            TimeUnit.SECONDS.sleep(5);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

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
    };

    @Override
    void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void render() {
        System.out.println("Image with name: " + this.name);
    }
}