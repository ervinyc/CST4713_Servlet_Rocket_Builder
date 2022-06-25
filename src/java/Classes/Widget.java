/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Enums.*;
import Interfaces.*;

/**
 *
 * @author ervin
 */
public class Widget implements WidgetBuilding{
    private String wid;
    private Endpoint wtype;
    private Network assignedTo;
    private Site location;
    private String accessCode;
    private Security secure;

    public Widget() {
    }

    public Widget(String wid, Endpoint wtype, Network assignedTo, Site location, String accessCode, Security secure) {
        this.wid = wid;
        this.wtype = wtype;
        this.assignedTo = assignedTo;
        this.location = location;
        this.accessCode = accessCode;
        this.secure = secure;
    }
    
    @Override
    public String toString(){
        String S = String.format("<h2>Widget WID: %s</h2>",wid)+
                String.format("<p>Type: %s</p>",wtype.getName())+
                String.format("<p>Network: %s</p>",assignedTo.getNetName())+
                String.format("<p>Location: %s</p>",location.getSiteName())+
                String.format("<p>AccessCode: %s</p>",accessCode)+
                String.format("<p>Secure: %s</p>",secure);
        return S;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public Endpoint getWtype() {
        return wtype;
    }

    public void setWtype(Endpoint wtype) {
        this.wtype = wtype;
    }

    public Network getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Network assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Site getLocation() {
        return location;
    }

    public void setLocation(Site location) {
        this.location = location;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public Security getSecure() {
        return secure;
    }

    public void setSecure(Security secure) {
        this.secure = secure;
    }
    
    
}
