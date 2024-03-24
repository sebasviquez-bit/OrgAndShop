package Model;

public class User {

    public String username;
    public String firstName;
    public String lastName;
    public String password;
    public String password1;
    public String password2;


    public User (String firstName, String lastName, String username, String password1, String password2){

        username = username;
        firstName = firstName;
        lastName = lastName;
        password1 = password1;
        password2 = password2;
    }

    public User(String username, String password){

        username = username;
        password = password;
    }


}
