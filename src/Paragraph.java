import java.sql.SQLOutput;

public class Paragraph extends Element{
    private String text;
    AlignStrategy alignStrategy;
    public Paragraph(String text){
        this.text = text;
        this.alignStrategy = null;
    }

    public void setAlignStrategy(AlignStrategy as){
        this.alignStrategy = as;
    }

    @Override
    public void add(Element e) {
        return;
    }

    @Override
    public void remove(Element e) {
        return;
    }

    @Override
    public Element get() {
        return this;
    }

    public String getText() {
        return this.text;
    }

    @Override
    void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void render() {
        if (this.alignStrategy == null){
            System.out.println(this.getText());
        }
        else {
            this.alignStrategy.render(this.getText());
        }
    }
}
