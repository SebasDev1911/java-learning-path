package classSystem;

import java.io.IOException;

public class ExampleRunOperatingSystem {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process process;

        try{
            if(System.getProperty("os.name").startsWith("Windows")){
                process = rt.exec("notepad");
            }else{
                process = rt.exec("gedit");
            }
            process.waitFor();
        }catch(Exception e){
            System.err.println("The command is stranger: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Is close the editor");
        System.exit(0);
    }
}
