package enityModel;

public class UserAccountLogin {
    private Long uid; //primary, auto increment
    private String username; //Unique varchar(25), Optional can be with only email or Oauth2.
    private String password; //hash password
    private String password_salt; // can be null, to be added in password,
    private String password_hash_algorithm; // hash algorithm
    private int status; // 0 active, 1 inactive, 2 blocked, deafult is 0 active
    // one to one userdetails
}