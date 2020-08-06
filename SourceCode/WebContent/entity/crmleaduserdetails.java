package enityModel;

import java.util.Date;
/**
 * this in entity for leads details
 * 
 * @Param name = name of the person whom have to be contacted;
 * @Param profile = position of the person in company;
 * @Param organisation = organisation name (if any);
 * @Param type = organisation type, sole,properitor, etc...
 * @Param requirements = list of items required
 * @Param leaddate = autodate , the day the entry is made
 * @Param contact = contact of the person alog with company number
 * @Param email = contact of the person alog with company number (if any) 
 * @Param address = address of the organisation or person in case sole.
 * @Param leadownerid = lead owner id.
 * @Param ref = refered or reference via.
 */
public class crmleaduserdetails {
    private Long cludid;
    private String name;
    private String profile;
    private String organisation;
    private String type;
    private String[] requirements;
    private Date leaddate = new Date();
    private Long contact;
    private String email;
    private String address;
    private Long leadownerid;
    private String ref;
}