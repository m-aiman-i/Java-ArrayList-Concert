/*
 * This program is used to insert 20 different concert events into a list called ArrayList which the data can
 * be added, remove, rearrange and deleted.
 *
 * @Author   Muhammad Aiman Iskandar
 * @Version  JDK 18
 * @Since    01-06-2022
 * */
import javax.swing.*;
import java.util.*;

public class Concert {
    static ArrayList<ArrayList<String>> sonnyList = new ArrayList<>(); // Initialising an ArrayList that holds other
                                                                       // ArrayList objects with object name sonnyList

    static ArrayList<String> getCrtID = new ArrayList<>(); // Initialising an ArrayList with object named getCrtID
    static ArrayList<String> getCrtVenue= new ArrayList<>(); // Initialising an ArrayList with object named getCrtVenue
    static ArrayList<String> getCrtDate= new ArrayList<>(); // Initialising an ArrayList with object named getCrtDate
    static ArrayList<String> getSCrtMnSinger= new ArrayList<>(); // Initialising an ArrayList with object named getSCrtMnSinger
    static ArrayList<String> getApproximateDCost= new ArrayList<>(); // Initialising an ArrayList with object named getApproximateDCost
    static ArrayList<String> getBBckpSinger = new ArrayList<>(); // Initialising an ArrayList with object named getBBckpSinger
    static ArrayList<String> getMainSponsorName = new ArrayList<>(); // Initialising an ArrayList with object named getMainSponsorName


    private static String sCrtID; // Declaring a variable named sCrtID
    private static String sCrtVenue; // Declaring a variable named sCrtVenue
    private static String sCrtDate; // Declaring a variable named sCrtDate
    private static String sCrtMnSinger; // Declaring a variable named sCrtMnSinger
    private static double dAprxiDCost; // Declaring a variable named sAprxiDCost
    private static boolean bBckpSinger; // Declaring a variable named bBckpSinger
    private static String sMnSponsorName; // Declaring a variable named sMnSponsorName

    public Concert () {} //no-arg constructor

    public static void Concert(){
        sonnyList.add(getCrtID);
        sonnyList.add(getCrtVenue);
        sonnyList.add(getCrtDate);
        sonnyList.add(getSCrtMnSinger);
        sonnyList.add(getApproximateDCost);
        sonnyList.add(getBBckpSinger);
        sonnyList.add(getMainSponsorName);
        getCrtID();
        getCrtVenue();
        getCrtDate();
        getSCrtMnSinger();
        getApproximateDCost();
        getBBckpSinger();
        getMainSponsorName();
    } //normal constructor

    public static void setDataConcert() {
        getSCrtMnSinger.remove(1);
        getSCrtMnSinger.add(1,"Ning Aishah");
        System.out.println("\n\nConcert ID              " + sonnyList.get(0));
        System.out.println("Concert Venue               " + sonnyList.get(1));
        System.out.println("Concert Date                " + sonnyList.get(2));
        System.out.println("The main singer             " + sonnyList.get(3));
        System.out.println("Cost of each concert (RM)   " + sonnyList.get(4));
        System.out.println("Have back-up singer         " + sonnyList.get(5));
        System.out.println("Main sponsor                " + sonnyList.get(6));
    } //setter or mutator

    public static void getCrtID() {
        for (int i = 0; i <= 17; i++) {
            sCrtID = JOptionPane.showInputDialog("Please insert Concert ID", "con");
            getCrtID.add(sCrtID);
        }
        getCrtID.add(0,"con9078");
        getCrtID.add(1,"con7659");

        System.out.println("Concert ID               " + sonnyList.get(0));
    } //getter or accessor

    public static void getCrtVenue() {
        for (int i = 0; i <= 19; i++) {
            sCrtVenue = JOptionPane.showInputDialog("Please insert Concert Venue for each concert ID");
            getCrtVenue.add(sCrtVenue);
        }

        System.out.println("Concert Venue            " + sonnyList.get(1));
    }

    public static String getCrtDate() {
        for (int i = 0; i <= 19; i++) {
            sCrtDate = JOptionPane.showInputDialog("Please insert Concert Date for each concert events");
            getCrtDate.add(sCrtDate);
        }

        System.out.println("Concert Date             " + sonnyList.get(2));

        return null;
    }

    public static String getSCrtMnSinger() {
        for (int i = 0; i <= 19; i++) {
            sCrtMnSinger = JOptionPane.showInputDialog("Who will be the main singer for each concert?");
            getSCrtMnSinger.add(sCrtMnSinger);
        }

        System.out.println("The main singer          " + sonnyList.get(3));

        return null;
    }

    public static double  getApproximateDCost() {
        for (int i = 0; i <= 19; i++) {
            dAprxiDCost = Double.parseDouble(JOptionPane.showInputDialog("How much will each concert cost?", 0.0));
            getApproximateDCost.add(String.valueOf(dAprxiDCost));
        }

        System.out.println("Cost of each concert (RM)" + sonnyList.get(4));
        return 0;
    }

    public static boolean getBBckpSinger() {

        for (int i = 0; i <= 19; i++) {
            bBckpSinger = Boolean.parseBoolean(JOptionPane.showInputDialog("Will there be backup singer for each shows?\nAnswer TRUE or FALSE"));
            getBBckpSinger.add(String.valueOf(bBckpSinger));
        }

        System.out.println("Have back-up singer      " + sonnyList.get(5));

        return false;
    }

    public static String getMainSponsorName() {
        for (int i = 0; i <= 19; i++) {
            sMnSponsorName = JOptionPane.showInputDialog("Who will be the sponsor?");
            getMainSponsorName.add(sMnSponsorName);
        }

        System.out.println("Main sponsor             " + sonnyList.get(6));

        return null;
    }

    public static void main(String[] args) {
        Concert();
        setDataConcert();
    }
} // End of class
