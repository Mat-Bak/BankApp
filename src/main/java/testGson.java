
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mateusz
 */

// name,  surname,  city,  address,  login,  password,  sex,  email,  phoneNumber,  pesel,  postCode  

public class testGson {
    public static void main(String[] args) {
        try {
    // create a list of users
    List<Account> users = Arrays.asList(
            new Account("Adam", "Doe", "Poznan", "Kolorowa 12", "tajnyLogin", "!1234Qwer", "Male", "john.doe@example.com", "458785458", "45898565487", "85478"),
            new Account("Bob", "Sue", "Krakov", "srednia 122", "toJestLogin", "!1234Qwer", "Female", "Bob.doe@example.com", "525252525", "52332565232", "854-74")
    );

    // create writer
    Writer writer = new FileWriter("D:\\Własne\\Programowanie\\Repozytorium\\bankapp\\src\\main\\java\\accounts.json");

    // convert users list to JSON file
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    gson.toJson(users, writer);

    // close writer
    writer.close();

} catch (Exception ex) {
    ex.printStackTrace();
}
    }
    
}
