package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/featurefiles"},
        plugin = {"pretty","html:target/Report/web/index.html"},
        glue = {"stepDefinitions"}
)
public class GenericRunner {

}
