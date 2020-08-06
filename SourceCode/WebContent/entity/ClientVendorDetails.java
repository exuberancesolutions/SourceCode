package enityModel;

import java.util.List;

public class ClientVendorDetails {
    private Long cdid;// auto increment 
    private String name;
    private String oname;
    private Stirng ogst; //15 max
    private String contact;
    private String email;
    //addresscomplete (one to one)
    private String aliasname;// can be null
    private String pan; // max(10)
    private String iec;// max(10)
    private int ctype; // 0 client, 1 vendor, 2 both.
    private String otype; // 
    private String websitelink;


    
}