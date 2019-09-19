package com.company;

public class Software extends Product {
    private String programmer = "";
    private String os = "";

    public Software(){}

    public Software(String programmer, String os, String code, String description, double price) {
        this.programmer = programmer;
        this.os = os;
        setCode(code);
        setDescription(description);
        setPrice(price);
    }

    public String toStringSoft(){
        String s = super.toString() + "Operating System:\t\t" + os + "\n" +
                "Software Written By:\t" + programmer + "\n";
        return s;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}