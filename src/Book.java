public class Book {
    private String name;
    private final Author name1;
    private int year;
    public Book(String name, Author name1, int year) {
        this.name = name;
        this.name1 = name1;
        this.year = year;
    }
    public String getName() {
        return this.name;
    }
    public int getYear()  {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }


}
