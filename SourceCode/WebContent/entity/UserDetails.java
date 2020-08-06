package enityModel;

import java.util.Date;

public class UserDetails {
    private Long udid; //auto increment , primary
    private String fname;
    private String mname; // can be null
    private String lname;
    private Date dob;
    private String email; //Unique, varchar(255)
    private String contact; //Unique, varchar(15) only numeric,internationalised
    private int gender;// 0 female, 1 male, 2 other,
    // user_account_login (one to one), foreign key(user_account_login=>uid)
    //* company (many to one)
    // address (one to one);
}