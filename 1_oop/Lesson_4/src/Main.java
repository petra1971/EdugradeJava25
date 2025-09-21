public class Main{
    public static void main(String[] args) {
        EBook ebook = new EBook();
        ebook.setTitle("Borta med vinden");
        ebook.setPages(100);
        ebook.setPublicationYear(2023);

        System.out.println(ebook.getTitle());
        System.out.println(ebook.getPages());
        System.out.println(ebook.getYearPublished());
    }
}
class LibraryBook {
    private String title;
    private int pages;
    private int yearPublished;


    public LibraryBook(String title, int pages, int yearPublished) {
        this.title = title;
        this.pages = pages;
        this.yearPublished = yearPublished;
    }

    public LibraryBook() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    protected void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}

class EBook extends LibraryBook {
    public void setPublicationYear(int year) {
        setYearPublished(year); // Kan anropa den skyddade set-metoden från en subklass
    }
}

