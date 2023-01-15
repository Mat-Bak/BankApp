
import java.awt.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mateusz
 */
public class Account {

    
   private String name, surname, city, address, login, password, sex, email, phoneNumber, pesel, postCode;
   int balance;
    public Account(){
        
    }
   
   
    public Account(String name, String surname, String city, String address, String login, String password, String sex, String email, String phoneNumber, String pesel, String postCode, int balance  ) {
        
        /*
        name = this.name;
        surname = this.surname;
        city = this.city;
        address = this.address;
        login = this.login;
        password = this.password;
        sex = this.sex;
        email = this.email;
        phoneNumber = this.phoneNumber;
        pesel = this.pesel;
        postCode = this.postCode;
        */
        
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.address = address;
        this.login = login;
        this.password = password;
        this.sex = sex;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pesel = pesel;
        this.postCode = postCode;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPesel() {
        return pesel;
    }

    public String getPostCode() {
        return postCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    

    
    
    
    
}
