package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import stepDefinitions.searchActions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/featurefiles"},
        plugin = {"pretty","html:target/Report/web/index.html"},
        glue = {"stepDefinitions"},
        tags = "@Regression1",
        monochrome = true,
        dryRun = false,
        publish = true
)
public class GenericRunner {
   static void AfterClass() throws Throwable{
       searchActions.closeBrower();
    }

}
