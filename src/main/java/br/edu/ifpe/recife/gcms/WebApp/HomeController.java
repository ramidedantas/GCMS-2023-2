package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World!!!!";
	}

	@RequestMapping("/fulano")
	public @ResponseBody String greetingFulano() {
		return "Hello, Fulano!!!!";
	}

	@RequestMapping("/rafael")
	public @ResponseBody String greetingRafael() {
		return "Hello, Rafael!?!??!";
	}
	
	@RequestMapping("/alane")
	public @ResponseBody String greetingAlane() {
		return "Hello, Alane!?!?";
	}

	@RequestMapping("/hotfix")
	public @ResponseBody String greetingHotfix() {
		return "Hello, Hotfix!!!";
	}
	
	@RequestMapping("/rafaelmarques")
	public @ResponseBody String greetingRafaelMarques() {
		return "Hello, Rafael Marques!!!????";
	}
	@RequestMapping("/Luciano")
	public @ResponseBody String greetingLuciano() {
	return "Hello, Luciano!";
	}
	
	@RequestMapping("/flavio")
	public @ResponseBody String greetingFlavio() {
		return "Hello, Flavio!!! Branch criada";
	}
	

	@RequestMapping("/maiara")
	public @ResponseBody String greetingMaiara() {
		return "Hello, Maiara!?!?";
	}

	@RequestMapping("/rebeca")
	public @ResponseBody String greetingRebeca() {
		return "Hello, Rebeca!";
	}
	@RequestMapping("/rebecajamilly")
	public @ResponseBody String greetingRebecaJamilly() {
		return "Hello, Rebeca Jamilly!!";
	}
	
	@RequestMapping("/andre")
	public @ResponseBody String greetingAndre() {
		return "Hello, Andre!!!!";
	}
	
	
	
	@RequestMapping("/andrehotfix2")
	public @ResponseBody String greetingAndreHotFix() {
		return "Hello, AndreHotFix2!!!!";
//=======
//	@RequestMapping("/andrehotfix")
//	public @ResponseBody String greetingAndre() {
//		return "Hello, AndreHotFix!!!!";
//>>>>>>> hotfix

	}
	
	@RequestMapping("/filipe")
	public @ResponseBody String greetingFilipe() {
		return "Hello, Filipe!!!!";
	}
	
	@RequestMapping("/LucianoCopiaModificada")
	public @ResponseBody String greetingLuciano2() {
	return "Hello, LucianoCopiaModificada!";
	}

	@RequestMapping("/allamy")
	public @ResponseBody String greetingAllamy() {
		return "Hello, Allamy!!!!";
	}

/*	@RequestMapping("/allamyHotfix")
	public @ResponseBody String greetingAllamyHotfix() {
		return "Hello, Allamy - Hotfix!!!!";
	} */


}
