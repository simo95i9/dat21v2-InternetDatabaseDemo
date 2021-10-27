package gredal.internetdatabasedemo.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesService {
    private static PropertiesService propertiesService;
    private final Properties properties;

    private PropertiesService() {
        this.properties = new Properties();
        try (InputStream is = ClassLoader.getSystemResourceAsStream("application.properties")) {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Properties getProperties() {
        if (propertiesService == null) {
            propertiesService = new PropertiesService();
        }
        return propertiesService.properties;
    }
}
