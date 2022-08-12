public class User {
    private String name;
    private String surname;

    @Override
    public String toString(){
        return "User: " + this.name + " " + this.surname;
    }
}
