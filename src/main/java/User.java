public class User {
    private String name;
    private String surname;

    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String toString(){
        return "User: " + this.name + " " + this.surname;
    }
}
