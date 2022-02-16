package runner;

import base.core;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/featurefiles"},
        plugin = {"pretty"},
        glue = {"stepsdefinitions"},
        tags = "@Regression",
        monochrome = true,
        dryRun = false


)
public class GenericRunner extends core {
    @BeforeClass
    public static void start()
    {
        System.out.println("Testing in Progress");
    }
    @AfterClass
    public static void teardown()
    {
        System.out.println("Test Complete");
    }
}
