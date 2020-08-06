package enityModel;

import java.util.Date;
/**
 * @Param clmdid = id;
 * @param clmdid = ref to user details;
 * @Param meetingdate = default date;
 * @Param meetingdetails = all the details comunicated;
 * @Param pipelinestatus = (follow up, deal final, Canclled, not interested)
 * @Param followdate = date of follow up
 */
public class crmleadmeetingdetails {
private Long clmdid;
private Long cludid;
private Date meetingdate;
private String meetingdetails;
private int pipelinestatus;
private Date followdate; 
}