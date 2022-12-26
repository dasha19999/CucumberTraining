package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    //Basic Runner class can add more to class as project specifies


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features =
                    "src\\test\\java\\CucumberTool\\Login.feature"
    )

    public class Runner {
}
