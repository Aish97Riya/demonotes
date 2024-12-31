package Runnerpkg;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\Aiswaryawkspc\\Aishexercise\\feature",glue="stepdefpkg",plugin= {"html:target-cucumber/reports"},monochrome=true)
public class seleniumcls {

}
