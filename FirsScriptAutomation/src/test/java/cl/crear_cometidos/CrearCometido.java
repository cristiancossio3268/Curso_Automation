package cl.crear_cometidos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.nio.channels.Selector;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class CrearCometido {

  @BeforeTest
  public void beforeTest() {
  }

  @Test
  public void CrearCometido_Script() {
	  
		 //Step 1
	  Reporter.log("Abrir pagina web de Cometidos en el navegador");
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://172.16.1.230:8081/Cometido_funcionario/login.jsp");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
		 //Step 2
	  Reporter.log("Ingresar rut y password");
	  driver.findElement(By.xpath("//input[@id='RUT']")).sendKeys("11224576");
	  driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys("Ab123456");
	  driver.findElement(By.xpath("//*[@type='button']")).click();
	  driver.findElement(By.xpath("//*[@class='confirm']")).click(); 
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
        //Step 3
	  Reporter.log("Ir a Ingresar nuevo cometido");
	  driver.findElement(By.xpath("//a[contains(text(), 'Ir »')]")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
		 //Step 4
	  Reporter.log("Ir a Paso 3: Cometido");
	  driver.findElement(By.xpath("//a[contains(text(), 'Paso 3: Cometido')]")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
		 //Step 5
	  Reporter.log("Seleccionar valor de Comuna de origen");
	  driver.findElement(By.xpath("")).click();
	  driver.findElement(By.xpath("//*[contains(text(), 'Seleccione la comuna de origen')]")).click(); selectByVisibleTexto ("ALHUE");
	  Select se = new Selector (driver.findElement(By.xpath("//*[contains(text(), 'Seleccione la comuna de origen')]")); se.select ByValue ( "Ind" ) ;
	  Select date = new Select (driver.findElement(By.xpath ("(id ('day')) ))); date.selectByVisibleText("15);
	  
		 //Step 6
	  Reporter.log("Seleccionar valor de Región de destino");
	  
		 //Step 7
	  Reporter.log("Seleccionar valor de Comuna de destino");
	  
		 //Step 8
	  Reporter.log("Presionar opción \"Agregar comuna\"");
	  
		 //Step 9
	  Reporter.log("Ingresar Motivo");
	  
		 //Step 10
	  Reporter.log("Seleccionar valor de Fecha desde");
	  
		 //Step 11
	  Reporter.log("Seleccionar valor de Fecha hasta");
	  
		 //Step 12
	  Reporter.log("Seleccionar opción \"Pernocta\"");
	  
		 //Step 13
	  Reporter.log("Seleccionar valor de Jefe directo");
	  
		 //Step 14
	  Reporter.log("Seleccionar opción \"Derecho a viático\"");
	  
		 //Step 15
	  Reporter.log("Seleccionar opción \"Alojamiento\"");
	  
		 //Step 16
	  Reporter.log("Ir a Paso 4: Programático");
	  
		 //Step 17
	  Reporter.log("Seleccionar valor de Financiamiento");
	  
		 //Step 18
	  Reporter.log("Presionar botón \"Enviar cometido\"");
	  
		 //Step 19
	  Reporter.log("Seleccionar valor de Programático");
	  
		 //Step 20
	  Reporter.log("Seleccionar valor de Función");
  }
  
  @AfterTest
  public void afterTest() {
  }

}
