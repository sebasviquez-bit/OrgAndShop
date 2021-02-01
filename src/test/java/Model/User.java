package Model;

public class User {

    public String username;
    public String firstName;
    public String lastName;
    public String password;
    public String password1;
    public String password2;


    public User (String firstName, String lastName, String username, String password1, String password2){

        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password1 = password1;
        this.password2 = password2;
    }

    public User(String username, String password){

        this.username = username;
        this.password = password;
    }


}
