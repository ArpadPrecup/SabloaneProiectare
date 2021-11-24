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

    public void print(){
        System.out.println("Book: " + super.getTitle());
        System.out.println("Authors: ");
        this.authors.forEach(author -> author.print());
        super.print();
    }


    public void addContent(Element e){
        this.content.add(e);
    }
}
