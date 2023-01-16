/**
 *
 * @author Mateusz
 */

public class Account {

    
   private String name, surname, city, address, login, password, sex, email, phoneNumber, pesel, postCode;
   int balance;

    /**
     *
     */
    public Account(){
        
    }
   
    /**
     *
     * @param name
     * @param surname
     * @param city
     * @param address
     * @param login
     * @param password
     * @param sex
     * @param email
     * @param phoneNumber
     * @param pesel
     * @param postCode
     * @param balance
     */
    public Account(String name, String surname, String city, String address, String login, String password, String sex, String email, String phoneNumber, String pesel, String postCode, int balance  ) {
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

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @return
     */
    public String getPesel() {
        return pesel;
    }

    /**
     *
     * @return
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     *
     * @return
     */
    public int getBalance() {
        return balance;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    

    
    
    
    
}
