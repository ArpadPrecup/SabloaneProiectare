public class Image {
    String imageName;

    public Image(String name){
        this.imageName = name;
    }

    public void print(){
        System.out.println("Image name " + this.imageName);
    }
}
