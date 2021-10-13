import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subchapters = new ArrayList<>();
    public Chapter(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int createSubChapter(String name){
        SubChapter sc = new SubChapter(name);
        subchapters.add(sc);
        return subchapters.indexOf(sc);
    }

    public SubChapter getSubChapter(int index){
        return subchapters.get(index);
    }

    public void print(){
        System.out.println("Chapter name: " + this.getName());
        System.out.println("has the following subchapters:");
        subchapters.forEach(s -> s.print());
    }
}
