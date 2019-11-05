package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/pruebareto.feature",//mapea la histori
        glue = "stepdefinitions", //mapea los steps
        snippets =SnippetType.CAMELCASE) //estandar de java

public class PruebaRunner {

}
