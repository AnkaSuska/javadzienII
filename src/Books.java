public class Books {
    String bookName;
    String author;
    String publisher;
    int numberOfPages;

    public Books(String bookName, String author, String publisher, int numberOfPages){

        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;


    }
    public String bookDetails(){
        return "nazwa ksiazki:" + bookName + "\nautor" +author + "\nwydawca" +publisher + "\nliczba stron " +numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
