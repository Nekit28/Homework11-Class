public class Main {
    public static void printSeparator() {
        System.out.println("=====================");
    }

    public static void main(String[] args) {


        Author bulgakov = new Author("Михаил","Булгаков");
        printSeparator();
        System.out.println("Автор - " + bulgakov.getName() + " " + bulgakov.getSurname());
        Book dogHeart = new Book("Собачье сердце", bulgakov, 1925);
        System.out.println("Название книги - " + dogHeart.getName() );
        System.out.println("Год издания - " + dogHeart.getYear());
        printSeparator();
        Author gogol = new Author("Николай","Гоголь");
        System.out.println("Автор - " + gogol.getName() + " " + gogol.getSurname());
        Book viy = new Book("Вий",gogol,1834);
        System.out.println("Название книги - " + viy.getName());
        System.out.println("Год издания - " + viy.getYear());
        viy.setYear(1835);
        System.out.println("Год издания - " + viy.getYear());
        printSeparator();
    }


    }
