 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.register_login;

import java.util.Scanner;

/**
 *
 * @author Student
 */
class userAuthenticator{
    //global variable
    String storedUsername;
    String storedPassword;
    String storedCellphone_number;
    Scanner inputuser = new Scanner(System.in);
    //creating a return method to check email validation
    boolean checkusername(String username){
        //must contain an underscore and must be 5 characters long
        //Fasa_
        if(username.length() == 5 && username.contains("_")){
            return true;
        }else{
            System.out.println("Username is not correctly formatted,please ensure your username contains an underscore and is no more than 5 characters in length");
            return false;    
        }         
        
    }
    //creating a return method to check password validation
    boolean checkpassword(String password){
        //must contain a capital letter,a number,a special character,must be at least 8 characters long
        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.chars().anyMatch(c-> !Character.isLetterOrDigit(c))){
            return true;    
        }else{
            System.out.println("Password is not formatted correctly,please ensure that the password at least contains 8 characters,a capital letter,a number,a special character");
            return false;
        }
    }
    // creating a return method to check cellphone number validation
    boolean checkcellphone_number(String cellphone_number){
        //cellphone number must contain international country code and must not be more than 10 characters long
        //must start with +27
        if (cellphone_number.length() == 12 && cellphone_number.startsWith("+27")){
            return true;
        }else{
            System.out.println("Cellphone incorrectly formatted or does not contain international code");
            return false;
        }
    }
    
    
    
    //creating a void method called registeruser
    //nextLine is used for String
    //nextInt is used for Integar
    //nextDouble is used for Double
    void registeruser(){
        System.out.println("=====REGISTER=====");
        System.out.println("Enter Username");
        String username = inputuser.nextLine();
        System.out.println("Enter Password");
        String password =inputuser.nextLine();
        System.out.println("Enter Cellphone Number");
        String cellphone_number =inputuser.nextLine();
        
        //if all conditions are true
        
        if(checkusername(username) && checkpassword(password) && checkcellphone_number(cellphone_number)){
            
            storedUsername = username;
            storedPassword = password;
            storedCellphone_number = cellphone_number;
            System.out.println("Registration successful!");   
        }else{
            System.out.println("Registration failed.Try again");
        }
        
    }
    //creating a void method called userlogin
    void userlogin(){
        
        if(storedUsername ==null){
            System.out.println("No user has registered");
            return;  
        }
        int attempts =4;
        boolean success= false;
        //while loop/repeats until condition is true
        //!success/not allow the user to login
        
        System.out.println("=====LOGIN=====");
        
        while (attempts >0 && !success)
        System.out.println("Enter Username");
        String username = inputuser.nextLine();
        System.out.println("Enter Password");
        String password =inputuser.nextLine();
        System.out.println("Enter Cellphone Number");
        String cellphone_number =inputuser.nextLine();
        //equals()compares string values
        
        if (username.equals(storedUsername) && password.equals(storedPassword) && cellphone_number.equals(storedCellphone_number)){
            System.out.println("Login successful! Welcome back");
            success = true;
        }else{
            attempts --;//decrease attempts
            if(attempts >0){
                System.out.println("Incorrect information.Attempts left:" + attempts);
            }
            
        }
        if(!success){
            System.out.println("Too many failed attempts.Account is locked");
            
        }
        
        
    }
    
}
        
        
        
        
        
public class Register_Login {

    
        
    
    
    
    
    
    public static void main(String[] args) {
        Scanner enterMenu = new Scanner(System.in);
        //linking instant class
        userAuthenticator register_login = new userAuthenticator();
        //stores the user's choice      
        int choice;
        
        //do-while loop runs the code at least once before checking the condition
        //creating a menu
        do{
        System.out.println("=====MENU=====");
        System.out.println("1.Register");
        System.out.println("2.Login");
        System.out.println("3.Close");
        
        System.out.println("Enter Menu option");
        choice = enterMenu.nextInt();
        switch (choice){
            case 1:
                register_login.registeruser();
                break;
            case 2:
                register_login.userlogin();
                break;
            case 3:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Invalid choice");
                
        }
            
        }while (choice!=3);{
        //loop will continue while choice is not equal to 3
        
        enterMenu.close();
        
    }
        System.out.print("");
        
    }
}
