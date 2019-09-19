package com.company;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Main {
    public static void main(String[] args){

        getCustomerRequest();

        System.out.println("Goodbye.");
    }

    public static void getCustomerRequest(){
        Scanner key = new Scanner(System.in);
        BookDatabase bd = new BookDatabase();
        SoftwareDatabase sd = new SoftwareDatabase();
        String again = "yes";

        while(again.equalsIgnoreCase("yes")) {
            System.out.println("To search for a product, please enter the product code " +
                    "(e.g., \"Book 314\" or \"Program 1234\") \nor enter \"all\" to receive a list of all " +
                    "products.  \nPlease omit the quotation marks but include the space: ");
            String r = key.nextLine();
            String[] rSplit = r.split(" ");
            if (rSplit[0].equalsIgnoreCase("Book")) {
                for (Book book : bd.getBooks()) {
                    if (r.equalsIgnoreCase(book.getCode())) {
                        System.out.println("Matching item:\n" + book.toStringBook());
                    } else {
                        System.out.println("Sorry. Book not found.");
                    }
                }
                System.out.println("Do you want to search for another item? (yes/no)");
                again = key.nextLine();
            }else if (rSplit[0].equalsIgnoreCase("Program")) {
                for (Software software : sd.getSofts()) {
                    if (r.equalsIgnoreCase(software.getCode())) {
                        System.out.println("Matching item:\n" + software.toStringSoft());
                    } else {
                        System.out.println("Sorry. Software not found.");
                    }
                }
                System.out.println("Do you want to search for another item? (yes/no)");
                again = key.nextLine();
                key.nextLine();
            }else if(rSplit[0].equalsIgnoreCase("all")){
                bd.printAllBooks(bd.getBooks());
                sd.printAllSoftware(sd.getSofts());
                again = "no";
            }else{
                System.out.println("Invalid Answer.  Please try again.");
            }
        }
    }
}
