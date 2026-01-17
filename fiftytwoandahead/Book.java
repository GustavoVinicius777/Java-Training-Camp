package fiftytwoandahead;

public class Book {

    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return this.title;
    }
    public int getpages() {
        return this.pages;
    }

    public void setpages(int pages) {
        this.pages = pages;
    }

    public String displayinfo(){
        return this.title + " (" + this.pages + " pages)";
    }
}

