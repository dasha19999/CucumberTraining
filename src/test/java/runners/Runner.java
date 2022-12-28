package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    //Basic Runner class can add more to class as project specifies


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features/",
            glue = "steps",
            dryRun = false,
            tags="@test07"
    )

    public class Runner {
}
