/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Enums.Status;

/**
 *
 * @author ervin
 */
public class Site {
    private String siteName;
    private String siteID;
    private Status siteStatus;
    private int XCoord;
    private int YCoord;

    public Site() {
    }

    public Site(String siteName, String siteID, Status siteStatus, int XCoord, int YCoord) {
        this.siteName = siteName;
        this.siteID = siteID;
        this.siteStatus = siteStatus;
        this.XCoord = XCoord;
        this.YCoord = YCoord;
    }
            
    public String toString(){
        return "";
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteID() {
        return siteID;
    }

    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    public Status getSiteStatus() {
        return siteStatus;
    }

    public void setSiteStatus(Status siteStatus) {
        this.siteStatus = siteStatus;
    }

    public int getXCoord() {
        return XCoord;
    }

    public void setXCoord(int XCoord) {
        this.XCoord = XCoord;
    }

    public int getYCoord() {
        return YCoord;
    }

    public void setYCoord(int YCoord) {
        this.YCoord = YCoord;
    }
    
}
