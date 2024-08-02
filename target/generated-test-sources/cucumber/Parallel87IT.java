import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"/Users/mathumathibalakrishnan/eclipse/Mathumathi_2024/bddCrossParallel/src/test/resources/features/feature1.feature:6"},
        plugin = {"json:/Users/mathumathibalakrishnan/eclipse/Mathumathi_2024/bddCrossParallel/target/cucumber-parallel/1.json"},
        monochrome = true,
        glue = {"stepDefinitions", " hooks"})
public class Parallel87IT {
}
