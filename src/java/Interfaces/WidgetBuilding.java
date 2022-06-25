/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Classes.*;
import DB.DBSupport;
import Enums.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;

/**
 *
 * @author ervin
 */
public interface WidgetBuilding {
    
    public static TreeMap< String, Widget> buildWidgets(String net) throws SQLException, ClassNotFoundException{
        TreeMap<String, Widget> tmap = new TreeMap<>();
        Connection conn = DBSupport.establishConnection();
        Statement use = conn.createStatement();
        use.execute("USE imperial_defense");
        
        //(String wid, Endpoint wtype, Network assignedTo, Site location, String accessCode, Security secure)
        String query = String.format("SELECT * FROM Widget WHERE AssignedTo = '%s'", net);
        Statement queryStatement = conn.createStatement();
        ResultSet rs = queryStatement.executeQuery(query);
        while(rs.next()){
            String A = rs.getNString("WID");
            
            String B = rs.getNString("WType");
            Endpoint EP = Endpoint.valueOf(B);
            
            String C = rs.getNString("AssignedTo");
            Network N = buildNetwork(C);
            
            String D = rs.getNString("Location");
            Site S = buildSite(D);
            
            String E = rs.getNString("AccessCode");
            
            Boolean F = rs.getBoolean("Secure");
            Security SE;
            if(F)
                SE = Security.Encrypted;
            else
                SE = Security.Open;
            
            Widget W = new Widget(A, EP, N, S, E, SE);
            tmap.put(W.getWid(), W);
        }
        conn.close();
        return tmap;
    }
    public static Site buildSite(String ID) throws SQLException, ClassNotFoundException{
        Site S = new Site();
        //Site(String siteName, String siteID, Status siteStatus, int XCoord, int YCoord)
        Connection conn = DBSupport.establishConnection();
        Statement use = conn.createStatement();
        use.execute("USE imperial_defense");
        String query = String.format("SELECT * FROM Site WHERE SiteName = '%s'", ID);
        Statement queryStatement = conn.createStatement();
        ResultSet rs = queryStatement.executeQuery(query);
        while(rs.next()){
            String A = rs.getNString("SiteName");
            String B = rs.getNString("SiteID");
            String C = rs.getNString("SiteStatus");
            Status st = null;
            if(Status.Offline.name().equalsIgnoreCase(C))
                st = Status.Offline;
            else if(Status.Online.name().equalsIgnoreCase(C))
                st = Status.Online;
            int D = rs.getInt("XCoord");
            int E = rs.getInt("YCoord");
            S = new Site(A,B,st,D,E);
        }
        return S;
    }
    public static Network buildNetwork(String name) throws SQLException, ClassNotFoundException{
        Network N = new Network();
        //(String netName, String netType, Switching cswitched, Status netStatus, double bandwidth, 
        //double optimumBW, double maxBW, double minBW)
        Connection conn = DBSupport.establishConnection();
        Statement use = conn.createStatement();
        use.execute("USE imperial_defense");
        String query = String.format("SELECT * FROM Network WHERE NetName = '%s'", name);
        Statement queryStatement = conn.createStatement();
        ResultSet rs = queryStatement.executeQuery(query);
        while(rs.next()){
            String A = rs.getNString("NetName");
            String B = rs.getNString("NetType");
            int C = rs.getInt("CSwitched");
            Switching sh = null;
                if(C ==1)
                    sh = Switching.Switched_Net;
                else
                    sh = Switching.Unswitched_Net;
            String D = rs.getNString("NetStatus");
            Status st = null;
            if(Status.Offline.name().equalsIgnoreCase(D))
                st = Status.Offline;
            else if(Status.Online.name().equalsIgnoreCase(D))
                st = Status.Online;
            double E = rs.getDouble("Bandwidth");
            double F = rs.getDouble("OptimumBW");
            double G = rs.getDouble("MaxBW");
            double H = rs.getDouble("MinBW");
            N = new Network(A, B, sh, st, E, F, G, H);
        }
        return N;
    }
    public static double distanceToWidgets(Widget w1, Widget w2){
        return 0.0;
    }
    
}
