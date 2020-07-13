public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public void print(int pages, int copies) {
        int totalPages = pages * copies;
        if(this.paper >= totalPages){
            this.paper -= totalPages;
            this.toner -= totalPages;
        }
    }
}
