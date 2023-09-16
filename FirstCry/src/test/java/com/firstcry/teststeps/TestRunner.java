package com.firstcry.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "Features",
             	
        glue = "com.firstcry.teststeps",
        //dryRun = true
        //tags = "@TC_102"
        tags = "@Add_To_Cart"
)



public class TestRunner extends AbstractTestNGCucumberTests{

}
