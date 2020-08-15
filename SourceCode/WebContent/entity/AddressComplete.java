package enityModel;

@Entity
public class AddressComplete {
   private Long aid;//auto increment 
   private String address_LineOne;
   private String address_LineTwo;
   private String address_Landmark;
   private String address_Street;
   private String address_City;
   private String address_State;
   private String address_Country;
   private int address_PinCode;
}