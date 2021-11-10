public class ImageProxy extends Element{
    Image image;
    String url;

    public ImageProxy(String url){
        this.url = url;
        image = null;
    }
    @Override
    void print() {
        if (this.image == null){
            this.image = this.loadImage(this.url);
        }
        System.out.println("Image with name: " + this.url);
    }

    private Image loadImage(String url){
       Image image = new Image(url);
       return image;
    }
    @Override
    void add(Element e) {
        return;
    }

    @Override
    void remove(Element e) {
        return;
    }

    @Override
    Element get() {
        return this;
    }
}
