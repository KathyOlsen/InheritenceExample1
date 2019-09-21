package com.company;

import java.util.Scanner;

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
                int counter1 = 0;
                int counterA = 0;
                for (Book book : bd.getBooks()) {
                    if(counter1 == 0) {
                        if (r.equalsIgnoreCase(book.getCode())) {
                            System.out.println("Matching item:\n" + book.toStringBook());
                            counter1 = 1;
                        } else{
                            counterA += 1;
                            if(counterA == bd.getBooks().size()){
                                System.out.println("Sorry. Book not found.");
                            }
                        }
                    }
                }
                System.out.println("Do you want to search for another item? (yes/no)");
                again = key.nextLine();
            }else if (rSplit[0].equalsIgnoreCase("Program")) {
                int counter2 = 0;
                int counterB = 0;
                for (Software software : sd.getSofts()) {
                    if(counter2 == 0) {
                        if (r.equalsIgnoreCase(software.getCode())) {
                            System.out.println("Matching item:\n" + software.toStringSoft());
                            counter2 = 1;
                        } else {
                            counterB += 1;
                            if(counterB == sd.getSofts().size()){
                                System.out.println("Sorry. Software not found.");
                            }
                        }
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
