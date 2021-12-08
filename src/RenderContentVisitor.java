public class RenderContentVisitor implements Visitor{

    @Override
    public void visit(Book b) {
        b.render();
    }

    @Override
    public void visit(Section s) {
        s.render();
    }

    @Override
    public void visit(TableOfContents t) {
        t.render();
    }

    @Override
    public void visit(Paragraph p) {
        p.render();
    }

    @Override
    public void visit(ImageProxy i) {
        i.render();
    }

    @Override
    public void visit(Image img) {
        img.render();
    }

    @Override
    public void visit(Table table) {
        table.render();
    }
}
