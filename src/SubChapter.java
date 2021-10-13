import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    String name;
    public List<Paragraph> paragraphs = new ArrayList<>();
    public List<Image> images = new ArrayList<>();
    public List<Table> tables = new ArrayList<>();
    public SubChapter(String name){
        this.name = name;
    }

    public int createNewParagraph(String name){
        Paragraph p = new Paragraph(name);
        paragraphs.add(p);
        return paragraphs.indexOf(p);
    }

    public int createNewImage(String name){
        Image i = new Image(name);
        images.add(i);
        return images.indexOf(i);
    }

    public int createNewTable(String name){
        Table t = new Table(name);
        tables.add(t);
        return tables.indexOf(t);
    }

    public void print(){
        System.out.println("Subparagraph " + this.name);
        System.out.println("Images: ");
        this.images.forEach((image) -> image.print());
        System.out.println("Paragraphs: ");
        this.paragraphs.forEach((p) -> p.print());
        System.out.println("Tables: ");
        this.tables.forEach((t) -> t.print());
    }
}
