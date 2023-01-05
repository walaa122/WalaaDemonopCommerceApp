package org.example.testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/walaaFeatures",
                glue = "org.example.walaastepDefinitions",
                tags = "@test",
                plugin = { "pretty",
                        "html:target/cucumber.html",
                        "json:target/cucumber.json",
                        "junit:target/cukes.xml",
                        "rerun:target/rerun.txt"}
        )


public class runners extends AbstractTestNGCucumberTests {
}
