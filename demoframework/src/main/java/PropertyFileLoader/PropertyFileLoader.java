package PropertyFileLoader;

import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class PropertyFileLoader {

    Properties properties = new Properties();

    private String propertyFileLoader(String property) throws IOException {
        FileReader reader = new FileReader("src/test/java/resources/config.properties");
        properties.load(reader);
       return properties.getProperty(property);
    }

    public String getDriverType() throws IOException {
        return propertyFileLoader("browser");
    }

    public String getApplicationURL() throws IOException {
        return propertyFileLoader("appURL");
    }

    public String getUserName() throws IOException {
        return propertyFileLoader("username");
    }

    public String getPassword() throws IOException {
        return propertyFileLoader("password");
    }
}
