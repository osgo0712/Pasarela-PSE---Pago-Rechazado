package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;


@DefaultUrl ("https://www.colsubsidio.com/ssoc/#/ingresar?goto=http:%2F%2F40.117.63.112%2Fportal%2Fsalud")

public class PagoRechazadoPageObject extends PageObject {


	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	Properties loadProperty = new Properties();	
	
	//HOME
	static By User = PagoRechazadoElements.txtUser.getValor_campo();
	static By Pass = PagoRechazadoElements.txtPass.getValor_campo();
	static By Ing = PagoRechazadoElements.btningreso.getValor_campo();
	static By Servicio = PagoRechazadoElements.btnserv.getValor_campo();
	static By Ingreso = PagoRechazadoElements.btningresarportal.getValor_campo();
	//AGENDAR CITA
	static By Agendar = PagoRechazadoElements.btnagendar.getValor_campo();
	//TIPO DE CITA
	static By TipoCita = PagoRechazadoElements.btntipocita.getValor_campo();
	static By CitaPresencial = PagoRechazadoElements.btncitapresencial.getValor_campo();
	//SELECCION DE CIUDAD
	static By Ciudad = PagoRechazadoElements.btnciudad.getValor_campo();
	static By Bogota = PagoRechazadoElements.btnBogota.getValor_campo();
	static By ConfirmarCiudad = PagoRechazadoElements.btnconfirmarciudad.getValor_campo();
	//SELECCION CENTRO MEDICO
	static By CentroMedico = PagoRechazadoElements.btncentromedico.getValor_campo();
	static By CentroMedicoSuba = PagoRechazadoElements.btncentromedicosuba.getValor_campo();
	static By Horario = PagoRechazadoElements.btnhorario.getValor_campo();
	static By ConfirmarHorario = PagoRechazadoElements.btnconfirmarhora.getValor_campo();
	//SELECCION FECHA
	static By Fecha = PagoRechazadoElements.btnfecha.getValor_campo();
	static By ValidacionDisponibilidad = PagoRechazadoElements.txtValidacionDisponibilidad.getValor_campo();
	static By Atras = PagoRechazadoElements.btnAtras.getValor_campo();
	static By Hora = PagoRechazadoElements.btnconfirmarhora.getValor_campo();
	static By Medico = PagoRechazadoElements.btnmedico.getValor_campo();
	static By ConfirmarFecha = PagoRechazadoElements.btnconfirmarfecha.getValor_campo();
	//ConfirmarReserva
	static By ConfirmarReserva = PagoRechazadoElements.btnconfirmarreserva.getValor_campo();
	//PAGO
	static By BtnCitasAegndadas = PagoRechazadoElements.btnCitasAgendadas.getValor_campo();
	static By BtnPagarCitaAgendada = PagoRechazadoElements.btnPagarCitaAgendada.getValor_campo();
	static By BtnIconoPago = PagoRechazadoElements.btnIcono.getValor_campo();
	static By TxtCel = PagoRechazadoElements.txtCel.getValor_campo();
	static By TxtEmail = PagoRechazadoElements.txtemail.getValor_campo();
	static By Captchat = PagoRechazadoElements.btnCaptchat.getValor_campo();
	static By BtnConfirmarDatos = PagoRechazadoElements.btnPagar.getValor_campo();
	static By BtnPSE = PagoRechazadoElements.btnPSE.getValor_campo();
	static By MsjCreacion = PagoRechazadoElements.MnsjCreacion.getValor_campo();
	//TIPO PERSONA
	static By BtnTipoPersona = PagoRechazadoElements.btnTipoPersona.getValor_campo();
	static By BtnPersonaNatural = PagoRechazadoElements.btnPersonaNatural.getValor_campo();
	static By BtnBanco = PagoRechazadoElements.btnBanco.getValor_campo();
	static By BtnBancoUnionColombiano = PagoRechazadoElements.btnBancoUnionColombia.getValor_campo();
	static By BtnContinuarPago = PagoRechazadoElements.btnContinuarPago.getValor_campo();
	//EMAIL PSE
	static By TxtEmailPSE = PagoRechazadoElements.txtEamilPSE.getValor_campo();
	static By BtnAceptar = PagoRechazadoElements.btnAceptar.getValor_campo();
	static By BtnIrBanco = PagoRechazadoElements.btnIrBanco.getValor_campo();
	//INFORMACION PAGO
	static By BtnDebug = PagoRechazadoElements.btnDebug.getValor_campo();
	static By BtnEstado = PagoRechazadoElements.btnEstado.getValor_campo();
	static By BtnRechazado = PagoRechazadoElements.btnRechazado.getValor_campo();
	static By TxtFecha = PagoRechazadoElements.txtFecha.getValor_campo();
	static By TxtCodigo = PagoRechazadoElements.txtCodigo.getValor_campo();
	static By BtnCall = PagoRechazadoElements.btnCall.getValor_campo();
	static By BtnPPE = PagoRechazadoElements.btnPpe.getValor_campo();



	public void ClickAgendar() throws InterruptedException, AWTException {
		if (element(User).isDisplayed()) {
			Thread.sleep(1000);
			find(User).click();
			//INGRESO USUARIO
			find(User).sendKeys("53084100");
			Thread.sleep(1000);	
			find(Pass).click();
			//INGRESO CONTRASEÑA
			find(Pass).sendKeys("Mafe2408");
			Thread.sleep(1500);	
			find(Ing).click();
			Thread.sleep(5000);	
			find(Servicio).click();
			Thread.sleep(1000);	
			find(Ingreso).click();
			Thread.sleep(3000);	
			find(Agendar).click();
			Thread.sleep(3000);	
		}		
	}

	public void TipoCita() throws InterruptedException {
		find(TipoCita).click();
		Thread.sleep(2000);	
		find(CitaPresencial).click();
		Thread.sleep(4000);	
	}

	public void SeleccionarCiudad() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		find(Ciudad).click();
		Thread.sleep(1000);
		find(Bogota).click();
		Thread.sleep(1000);
		//robot.keyPress(KeyEvent.VK_DOWN);
		//robot.keyPress(KeyEvent.VK_ENTER);
		find(ConfirmarCiudad).click();
		Thread.sleep(1000);
	}

	public void SeleccionCentroMedico() throws InterruptedException, AWTException {
		find(CentroMedico).click();
		Thread.sleep(1000);
		find(CentroMedicoSuba).click();
		Thread.sleep(1000);	
		find(Horario).click();
		Thread.sleep(1000);	
		find(ConfirmarHorario).click();
		Thread.sleep(1000);	

	}

	public void SeleccionFecha() throws AWTException, InterruptedException {

		Robot robot = new Robot();	
			Thread.sleep(1000);	
			find(Fecha).click();
			Thread.sleep(3000);		
			//HORA
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			//MEDICO
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			find(ConfirmarFecha).click();
			Thread.sleep(3000);
		
	}

	public void ConfirmarReserva() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(3000);
		find(ConfirmarReserva).click();
		Thread.sleep(9000);

	}

	public void CitaAgendada() throws InterruptedException {
		if(element(BtnCitasAegndadas).isDisplayed()) {
			find(BtnCitasAegndadas).click();
			Thread.sleep(1000);
		}
	}

	public void ClickBtnPagar() throws InterruptedException {


		String mainTab = getDriver().getWindowHandle();
		String newTab = "";	
		System.out.println("Main Tab" + mainTab);
		find(BtnPagarCitaAgendada).click();
		Thread.sleep(2000);

		Set<String> handles = getDriver().getWindowHandles();
		for (String actual : handles) {
			System.out.println("Handle id:" + actual);	
			if (!actual.equalsIgnoreCase(mainTab)) {
				//Cambio de Pestaña
				getDriver().switchTo().window(actual);
			}
		}

	}


	public void RegistrarDatos()  {
		try {
			//Robot robot = new Robot();
			find(BtnIconoPago).click();
			Thread.sleep(2000);
			//INGRESO DATOS DE PRUEBA
			find(TxtCel).sendKeys("3104985492");
			Thread.sleep(1000);
			find(TxtEmail).sendKeys("Test@gmail.com");
			Thread.sleep(2000);
			getDriver().switchTo().frame(getDriver().findElement(By.xpath("//*[@id=\"ngrecaptcha-0\"]/div/div/iframe")));
			Thread.sleep(1000);
			find(Captchat).click();
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			getDriver().switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void ConfirmarDatos() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		find(BtnConfirmarDatos).click();	
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		find(BtnPSE).click();	
		Thread.sleep(2000);
	}

	public void ValidarMensajeCreacion() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
	}

	public void RegistroDatosPago() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,500)");
		find(BtnTipoPersona).click();
		Thread.sleep(2000);
		find(BtnPersonaNatural).click();
		Thread.sleep(2000);
		find(BtnBanco).click();
		Thread.sleep(2000);
		find(BtnBancoUnionColombiano).click();
		Thread.sleep(2000);
		find(BtnContinuarPago).click();
		Thread.sleep(3000);

	}

	public void IngresoEmailPSE() throws InterruptedException {
		//INGRESO DE EMAIL PSE
		find(TxtEmailPSE).sendKeys("oscaesgo@colsubsidio.com");
		//CONFIRMACION EMAIL
		Thread.sleep(2000);
		find(BtnAceptar).click();
		Thread.sleep(1000);
		find(BtnIrBanco).click();
		Thread.sleep(2000);
	}

	public void FlujoDebug() throws InterruptedException {
		find(BtnDebug).click();
		Thread.sleep(2000);
	}
	
	public void IngresoDatos() throws InterruptedException, AWTException, FileNotFoundException, IOException {
		Robot robot = new Robot();
		
		//INGRESO FECHA DE TRANSACCION, PONER FECHA ACTUAL
		find(TxtFecha).sendKeys("30/11/2021");
		Thread.sleep(1000);
		
		find(TxtCodigo).sendKeys("00001");
		Thread.sleep(1000);
		//find(BtnRechazado).click();
		find(BtnEstado).click();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		//find(TxtFecha).type(loadProperty.getProperty("FechaTransaccion"));
		
	}

	public void Call() throws InterruptedException {
		find(BtnCall).click();
		Thread.sleep(1000);
		find(BtnPPE).click();	
		Thread.sleep(5000);	

	}
	

	public void ValidarMensajeRechazado() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(5000);		
	}

}