
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

    
   private String name, surname, city, address, login, password, rePassword, sex, email, phoneNumber, pesel, postCode;
    public Account(){
        
    }
   
    public Account(String name, String surname, String city, String address, String login, String password, String sex, String email, String phoneNumber, String pesel, String postCode  ) {
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
    
    
    
    

    
    
    
    
}
