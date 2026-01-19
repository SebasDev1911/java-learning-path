package classSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ExampleAssigningSystemProperties {
    public static void main(String[] args) {
        try{
            // Access the file with the created properties
            FileInputStream archive = new FileInputStream("src/classSystem/config.properties");

            Properties p = new Properties(System.getProperties());
            // The properties created are appended to the system properties
            p.load(archive);
            System.setProperties(p);

            // All properties and those created are shown
            System.getProperties().list(System.out);

            // Call a specific property
            System.out.println(System.getProperty("config.server.port"));
        }catch(Exception e){
            System.out.println("Not exit archive = " + e);
        }
    }
}
