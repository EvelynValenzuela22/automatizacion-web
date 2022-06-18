package com.semilleroias.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features="src/test/resources/features/login.feature",
        glue = "com.semilleroias.stepsdefinition",
        snippets = CAMELCASE,
        tags= "")
public class FeatureRunner {
}
