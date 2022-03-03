package br.com.petz.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        glue = "br.com.petz",
        features = "src/test/resources/features",
        plugin = "junit:Results.xml",
        tags = ""
)

public class FrameworkTest {
}
