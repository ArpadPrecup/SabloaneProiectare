public class BookStatistics implements Visitor{
    protected int numImages, numTables, numParagraphs;
    public BookStatistics(){
        this.numImages = 0;
        this.numTables = 0;
        this.numParagraphs = 0;
    }
    @Override
    public void visit(Book b) {

    }

    @Override
    public void visit(Section s) {

    }

    @Override
    public void visit(TableOfContents t) {

    }

    @Override
    public void visit(Paragraph p) {
        this.numParagraphs += 1;
    }

    @Override
    public void visit(ImageProxy i) {

    }

    @Override
    public void visit(Image img) {
        this.numImages += 1;
    }

    @Override
    public void visit(Table table) {
        this.numTables += 1;
    }

    public void printStatistics(){
        System.out.println("book Statistics:");
        System.out.println("Number of images " + this.numImages);
        System.out.println("Number of tables " + this.numTables);
        System.out.println("Number of paragraphs " + this.numParagraphs);
    }
}
