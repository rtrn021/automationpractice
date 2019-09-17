package com.automationpractice.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports",

        },
        tags = {"@task"},
        features = {"src/test/resources/features"
        },

        glue = {"com/automationpractice/steps"},

        dryRun = false

)
public class CukesRunner{

}
