package classSystem;
import java.util.Map;

public class ExampleEnvironmentVariables {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("Environment variables of system = " + varEnv);

        System.out.println("------ System environment variables list ------");
        for(String key:varEnv.keySet()){
            System.out.println(key + " = " + varEnv.get(key));
        }
        
        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        
        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
        
        String path = System.getenv("Path");
        System.out.println("path = " + path);
    }
}
