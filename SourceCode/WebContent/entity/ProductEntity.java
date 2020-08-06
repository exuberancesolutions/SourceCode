package enityModel;

public class ProductEntity {
    private Long peid; //auto increment
    private String pcode;//max(15)
    private String pname; // can be null
    private String hsncode; // can be null
    private String discription; // can be null
    // private String color; // can be null
    // nosql for color and size variant 
    // nosql for material(quality) variant
    private int retailprice; // default(0),
    private int wholesaleprice; // default(0)
    private int manufacturingprice; // default(0)
    private int purchasePrice; // can be null
    private Long barcode; // code
    private String imageurl; //nullable
    private int stockavailable;//
}