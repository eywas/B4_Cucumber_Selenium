package com.kraftech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/kraftech/stepDefinitions",
        dryRun = false,  // eğer stepDefinitions içindeki eksik metodu almak istersek burayı
                        // true yapmalıyız (when metodu)
                        // burası false olmazsa testlerimizi koşturamayız
        tags = "@parametarizeMethods"
)
public class CukesRunner {
}