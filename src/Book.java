import java.util.ArrayList;

public class Book {
    private String name;
    private ArrayList<String> paragraphs = new ArrayList<>();
    private ArrayList<String> images = new ArrayList<>();
    private ArrayList<String> tables = new ArrayList<>();

    Book(String name){
        this.name = name;
    }

    public void createNewParagraph(String newParagraph){
        this.paragraphs.add(newParagraph);
    }

    public void createNewImage(String newImage){
        this.images.add(newImage);
    }

    public void createNewTable(String newTable){
        this.tables.add(newTable);
    }

    public ArrayList<String> getParagraphs(){
        return this.paragraphs;
    }

    public ArrayList<String> getImages(){
        return this.images;
    }

    public ArrayList<String> getTables(){
        return this.tables;
    }

    public String getName(){
        return this.name;
    }

    public void print(){
        System.out.println("The book's name is " + this.getName());
        System.out.println("Paragraphs:");
        this.getParagraphs().forEach((paragraph) -> System.out.println(paragraph));
        System.out.println("Images:");
        this.getImages().forEach((image) -> System.out.println(image));
        System.out.println("Tables:");
        this.getTables().forEach((table) -> System.out.println(table));
    }

}
