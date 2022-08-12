public class User {
    private String name;
    private String surname;
    private Integer age;

    public User(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    @Override
    public String toString(){
        return "User: " + this.name + " " + this.surname;
    }
}
