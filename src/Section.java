import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private String title;
    private List<Element> elements = new ArrayList<>();
    public Section(String name){
        this.title = name;
    }

    public String getTitle(){
        return this.title;
    }





    public void print(){
        System.out.println(this.title);
        elements.forEach(element -> element.print());
    }


    @Override
    public void add(Element e) {
        elements.add(e);
    }

    @Override
    public void remove(Element e) {
        elements.remove(e);
    }

    @Override
    public Element get() {
        return this;
    }
}