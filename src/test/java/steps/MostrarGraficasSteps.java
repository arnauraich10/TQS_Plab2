package steps;

import static org.testng.Assert.assertTrue;

import java.awt.Dimension;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MostrarGraficasSteps {
	
	WebDriver driver;


	@Given("El usuario esta en la pagina principal")
	public void ElUsuarioEstaEnLaPaginaPrincipal() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to("https://demoqa.com/elements");
		driver.manage().window().fullscreen();

	}
	
	@Given("El usuario esta en la pagina principal alerts")
	public void ElUsuarioEstaEnLaPaginaPrincipalAlerts() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to("https://demoqa.com/alertsWindows");
		driver.manage().window().fullscreen();

	}

	
	@When("Rellenar el formulario")
	public void RellenarElFormulario() {
		driver.findElement(By.id("userName")).sendKeys("UsuarioTest");
		driver.findElement(By.id("userEmail")).sendKeys("mailtest@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Adreca test numero 50");
		driver.findElement(By.id("permanentAddress")).sendKeys("Adreca test numero 25");
	}
	
	@Then("Submit al formulario")
	public void SubmitAlFormulario() {
		driver.findElement(By.id("userForm")).submit();
	}
	
	@When("El usuario busca radiobutton")
	public void ElUsuarioBuscaRadiobutton() {
		driver.findElement(By.id("item-2")).click();
	}
	
	@When("El usuario clica impressive")
	public void ElUsuarioClicaImpressive() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")).click();
	}
	
	@Then("Se comprueba radiobutton impressive")
	public void SeCompruebaRadiobuttonImpressive() {
		String radioImpressive = driver.findElement(By.className("text-success")).getText();
		Assert.assertTrue(radioImpressive.contains("Impressive"));
	}
	
	@When("El usuario busca dynamic properties")
	public void ElUsuarioBuscaDynamicProperties() {
		driver.findElement(By.xpath("//*[@id=\"item-8\"]")).click();
	}
	
	@When("El usuario espera cinco segundos")
	public void ElUsuarioEsperaCincoSegundos() {
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	@Then("El boton esta habilitado")
	public void ElBotonEstaHabilitado(){
		Assert.assertTrue(driver.findElement(By.id("visibleAfter")).isEnabled());
	}
	
	@Then("El color del boton ha cambiado")
	public void ElColorDelBotonHaCambiado() {
		String colorText = driver.findElement(By.id("colorChange")).getCssValue("color");
		Assert.assertTrue(colorText.contains("rgb(220, 53, 69)"));
	}
	
	@When("El usuario busca alerts frame windows")
	public void ElUsuarioBuscaAlertsFrameWindows() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/span/div"));
	}
	
	@When("El usuario clica alerts")
	public void ElUsuarioClicaAlerts() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]/span")).click();
	}
	
	@When("El usuario clica see alert")
	public void ElUsuarioClicaSeeAlert() {
		driver.findElement(By.id("alertButton")).click();
	}
	
	@Then("Se comprueba la alert")
	public void SeCompruebaLaAlert() {
		String alertText = driver.switchTo().alert().getText();
		System.out.print(alertText);
		Assert.assertTrue(alertText.contains("You clicked a button"));
	}
	
	@When("El usuario clica alert after five seconds")
	public void ElUsuarioClicaAlertAfterFiveSeconds() {
		driver.findElement(By.id("timerAlertButton")).click();
	}
	
	@Then("Se comprueba la timer alert")
	public void SeCompruebaLaTimerAlert() {
		String alertText = driver.switchTo().alert().getText();
		System.out.print(alertText);
		Assert.assertTrue(alertText.contains("This alert appeared after 5 seconds"));
	}
	
	@When("El usuario clica modal dialogs")
	public void ElUsuarioClicaModalDialogs() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[5]/span")).click();
	}
	
	@When("El usuario clica small modal")
	public void  ElUsuarioClicaSmallModal() {
		driver.findElement(By.id("showSmallModal")).click();
	}
	
	@Then("Se comprueba el dialog")
	public void SeCompruebaElDialog() {
		String smallDialog = driver.findElement(By.className("modal-body")).getText();
		Assert.assertTrue(smallDialog.contains("This is a small modal. It has very less content"));
	}
	
	@When("El usuario busca textbox")
	public void ElUsuarioBuscaTextbox() {
		driver.findElement(By.id("item-0")).click();
	}
	
	@When("El usuario clica yes")
	public void ElUsuarioClicaYes() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
	}
	
	@Then("Se comprueba el check")
	public void SeCompruebaElCheck() {
		String texto = driver.findElement(By.className("mt-3")).getText();
		Assert.assertTrue(texto.contains("You have selected Yes"));
	}
	
	@When("El usuario busca webtables")
	public void ElUsuarioBuscaWebtables() {
		driver.findElement(By.id("item-3")).click();
	}
	
	@When("El usuario filtra")
	public void ElUsuarioFiltra() {
		driver.findElement(By.id("searchBox")).sendKeys("Cierra");
	}
	
	@Then("Se comprueba la tabla")
	public void SeCompruebaLaTabla() {
		String texto2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div")).getText();
		Assert.assertTrue(texto2.contains("Cierra"));
	}
	
	@When("El usuario busca buttons")
	public void ElUsuarioBuscaButtons() {
		driver.findElement(By.id("item-4")).click();
	}
	
	@When("clicks")
	public void Clicks() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")).click();
	}
	
	@When("clicks double")
	public void ClicksDouble() {
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"))).perform();
	}
	
	@Then("Se comprueba el clic")
	public void SeCompruebaElClic() {
		String texto3 = driver.findElement(By.id("dynamicClickMessage")).getText();
		Assert.assertTrue(texto3.contains("You have done a dynamic click"));
	}
	
	@Then("Se comprueba el clic double")
	public void SeCompruebaElClicDouble() {
		String texto3 = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertTrue(texto3.contains("You have done a double click"));
	}
	
	@When("El usuario busca links")
	public void ElUsuarioBuscalinks() {
		driver.findElement(By.id("item-5")).click();
	}
	
	@When("El usuario clica en created")
	public void ElUsuarioClicaEnCreated() {
		driver.findElement(By.id("created")).click();
	}
	
	@Then("Se comprueba el created")
	public void SeCompruebaElCreated() {
		String texto4 = driver.findElement(By.id("linkResponse")).getText();
		Assert.assertTrue(texto4.contains("Link has responded with staus 201 and status text Created"));
	}
	
	@When("El usuario busca checkbox")
	public void ElUsuarioBuscaCheckbox() {
		driver.findElement(By.id("item-1")).click();
	}
	
	@When("El usuario clica en el checkbox")
	public void ElUsuarioClicaEnElCheckbox() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/label")).click();
	}
	
	@Then("Se comprueba el checkbox")
	public void SeCompruebaElCheckbox() {
		String texto5 = driver.findElement(By.id("result")).getText();
		Assert.assertTrue(texto5.contains("You have selected"));
	}
	
	@When("El usuario busca dynamicproperties")
	public void ElUsuarioBuscaDynamicproperties() {
		driver.findElement(By.xpath("//*[@id=\"item-8\"]")).click();
	}

	
}
