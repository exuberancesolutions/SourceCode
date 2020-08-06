package enityModel;

public class CompanyDetails {
    private Long cid;//auto increment 5 digit code(start 20000), primary key
    private String organisation_name;
    private String organisation_type;
    private String cin;
    private String gstin; //unique
    private String pan;
    private String iec;
    private String email;
    private String contact;
    private String website;
    private int gstType;

    //address (one to one);
    //userdetails (one to many) mapped by userdetails 
}