public class User{
    String name, adr, tel, cpf;
    int borrow = 10;

    public void register(){
        System.out.println("Registering...");
    }
    public int BorrowedBooks(){
        System.out.println(borrow + "books borrowed");
        return borrow;
    }
    public User(String name, String adr, String cpf){
        this.name = name;
        this.adr = adr;
        this.cpf = cpf;
    }
}
