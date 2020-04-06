public class Library {
    int books;
    int users;
    String bookname;
    boolean available = true;

    public static void main(String[] args) {
        User u1 = new User("John Wayne", "Manhattan, New York", "123-456-789");
        System.out.println("Feel Free...");

    }
    public void borrowBooks(boolean available, String bookname){
        this.bookname = "Cartas de Amor aos Mortos";
        System.out.println("Do you want that book?");
        System.out.println("Bring it back on 7 days...");
    }

}
