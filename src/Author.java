public class Author {
    private String name;
    private String surname;
    Author(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("Author: " + this.name);
    }

}
