import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    private List<Author> authors = new ArrayList<>();
    private List<Element> content = new ArrayList<>();
    public Book(String name) {
        super(name);
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }

    public void render(){
        System.out.println("Book: " + super.getTitle());
        System.out.println("Authors: ");
        this.authors.forEach(author -> author.print());
        //super.render();
    }


    public void addContent(Section e){
        this.content.add(e);
    }

    public void accept(Visitor v){
        v.visit(this);
        for (Element e: content){
            e.accept(v);
        }
    }
}
