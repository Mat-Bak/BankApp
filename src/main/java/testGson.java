
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.nio.file.Paths;
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

//  PLIK DO TESTOWANIA

public class testGson {
    
    /**
     *
     */
   // final static File file = new File(getClass().getResource("accounts.json").getPath());
    //Path path = Path.of("bankapp", "src", "main","java","accounts.json");
    final static String outputFilePath = "\\src\\main\\java\\accounts.json";
            //D:\Własne\Programowanie\Repozytorium\bankapp\src\main\java\testGson.java
    //D:\Własne\Programowanie\Repozytorium\bankapp\src\main\java\accounts.json
    
    public static List<Account> loadData(){
        
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString() + outputFilePath;
        
        List<Account> data = null;
        try {
           File file = new File(s);
           Gson gson = new Gson();
           BufferedReader bf = new BufferedReader(new FileReader(file));

            Type userType = new TypeToken<List<Account>>(){}.getType(); 
            data = gson.fromJson(bf, userType);
        
        } catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
            System.out.println("ERROR DATA LOAD!");
        }
        
        return data;
    }
    
    public static void main(String[] args) {

        List<Account> users = loadData();
        
        for(Account user : users){
            System.out.println("User: " + user.getName());
        }

       
    }
    
}
