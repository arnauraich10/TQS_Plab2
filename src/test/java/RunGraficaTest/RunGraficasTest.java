package RunGraficaTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/graficas.feature", glue="steps")
public class RunGraficasTest extends AbstractTestNGCucumberTests{
	
}