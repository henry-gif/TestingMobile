package com.bdd.RunnerTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)@CucumberOptions( glue = {"com.bdd.Stepdefinition"},
        features = {"src/test/resources/Mobile"},
        stepNotifications = true,
        tags = "@Prueba")

public class RunnerTest {

}
