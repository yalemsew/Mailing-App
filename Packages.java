package MailingSystem;

import java.lang.ref.Cleaner;

public class Packages {
    private String nameOfPackage;
    private double weight;
    private String zone;

    Packages(double weight,String zone,String nameOfPackage){
        this.weight=weight;
        this.zone=zone;
        this.nameOfPackage=nameOfPackage;
    }

    public double getWeight() {
        return weight;
    }
    public String getZone() {
        return zone;
    }
    public String getNameOfPackage(){
        return nameOfPackage;
    }



}
