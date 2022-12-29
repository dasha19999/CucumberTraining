package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@target/failed.txt",
        glue = "steps",
        monochrome = true,
        //pretty keyword prints the steps in the console to increase readability

        plugin = {"pretty"}
)

        public class FailedRunner{
}
