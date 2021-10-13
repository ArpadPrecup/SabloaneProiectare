import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapters = new ArrayList<>();

    Book(String name){
        this.name = name;
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }

    public int createChapter(String name){
        Chapter ch = new Chapter((name));
        chapters.add(ch);
        return chapters.indexOf(ch);
    }

    public Chapter getChapter(int index){
        return chapters.get(index);
    }

    public String getName(){
        return this.name;
    }

    public void print(){
        System.out.println(this.name + " written by: ");
        this.authors.forEach((author) -> System.out.println(author.getName()));
        System.out.println("has the following chapters: ");
        this.chapters.forEach((chapter -> chapter.print()));
    }

}
