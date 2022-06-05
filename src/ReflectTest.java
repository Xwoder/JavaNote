import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws IOException {
        final Class<ReflectTest> reflectTestClass = ReflectTest.class;
        final ClassLoader reflectTestClassLoader = reflectTestClass.getClassLoader();
        final InputStream resourceStream = reflectTestClassLoader.getResourceAsStream("pro.properties");

        Properties properties = new Properties();
        properties.load(resourceStream);

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        System.out.println(className);
        System.out.println(methodName);
        
    }
}
