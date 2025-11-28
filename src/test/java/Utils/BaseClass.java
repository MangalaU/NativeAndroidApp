package Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {


        public static AndroidDriver driver;
        public static Properties prop;

        @BeforeClass
        public static void setup() throws IOException {

            // Load properties file
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/main/resources/testData/data.properties");
            prop.load(fis);

            // Setup Desired Capabilities using UiAutomator2Options
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("Android");
            options.setAutomationName("UiAutomator2");
            options.setDeviceName("emulator-5554");

            // App path
            options.setApp("C:\\Users\\Mangala\\IdeaProjects\\AndroidDemo\\app\\android.wdio.native.app.v1.0.8.apk");

            // Important timeout fixes
            options.setUiautomator2ServerLaunchTimeout(Duration.ofSeconds(60));
            options.setUiautomator2ServerInstallTimeout(Duration.ofSeconds(60));
            options.setAdbExecTimeout(Duration.ofSeconds(60));

            // Waiting settings
            options.setAppWaitActivity("*");
            options.setAppWaitDuration(Duration.ofSeconds(30));

            // Reset & permissions
            options.setNoReset(false);
            options.setFullReset(false);
            options.setAutoGrantPermissions(true);

            // Session timeout
            options.setNewCommandTimeout(Duration.ofSeconds(300));

            // Start Appium session (Appium 1.x URL)
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    }
