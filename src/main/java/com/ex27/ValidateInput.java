/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex27;

import java.util.Scanner;

public class ValidateInput {

    //Validate firstName
    private static boolean validateFirstName(String first) {

        if(first.isEmpty() == true) {

            System.out.println("The first name must be filled in.");

        }

        if(!(first.length() > 2) && !(first.isEmpty())) {

            System.out.println("Name entered is too short.");

        }

        return false;

    }

    //Validate lastName
    private static boolean validateLastName(String last) {

        if(last.isEmpty() == true) {

            System.out.println("The last name must be filled in.");

        }

        if(!(last.length() > 2) && !(last.isEmpty())) {

            System.out.println("Name entered is too short.");

        }

        return false;

    }

    //Validates zipcode
    private static boolean zipCodeValidation(String zipCode) {

        char[] ch = zipCode.toCharArray();

        for(int i = 0; i < 1; i++) {

            if(!(Character.isDigit(zipCode.charAt(i)))) {

                System.out.println("Zipcode must be numeric.");

            }

        }

        return false;

    }

    //Validate employeeId
    private static boolean validateId(String id) {

        for(int i = 0; i < 1; i++) {

            if(id.length() > 7) {

                System.out.println(id + " is not a valid ID.");
                System.exit(0);

            }

            if((!Character.isLetter(id.charAt(0)))) {

                System.out.println(id + " is not a valid ID.");
                System.exit(0);

            }

            if((!Character.isLetter(id.charAt(1)))) {

                System.out.println(id + " is not a valid ID.");
                System.exit(0);

            }

            if(id.charAt(2) != '-') {

                System.out.println(id + " is not a valid ID.");
                System.exit(0);

            }

            if((!Character.isDigit(id.charAt(3)))) {

                System.out.println(id + " is not a valid ID.");
                System.exit(0);

            }

            if((!Character.isDigit(id.charAt(4)))) {

                System.out.println(id + " is not a valid ID.");
                System.exit(0);

            }

            if((!Character.isDigit(id.charAt(5)))) {

                System.out.println(id + " is not a valid ID.");
                System.exit(0);

            }

            if((!Character.isDigit(id.charAt(6)))) {

                System.out.println(id + " is not a valid ID.");
                System.exit(0);

            }

        }

        return false;

    }

    public static void validateInput(String f, String l, String z, String i) {

        validateFirstName(f);
        validateLastName(l);
        zipCodeValidation(z);
        validateId(i);

        if(validateFirstName(f) == false && validateLastName(l) == false && zipCodeValidation(z) == false && validateId(i) == false) {

            System.out.print("No errors found.");

        }

    }

    public static void main(String[] args) {

        String firstName, lastName;
        String zip, id;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first name: ");
        firstName = scan.nextLine();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter last Name: ");
        lastName = scan2.nextLine();

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter zipcode: ");
        zip = scan3.nextLine();

        Scanner scan4 = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        id = scan4.nextLine();

        validateInput(firstName, lastName, zip, id);

    }

}
