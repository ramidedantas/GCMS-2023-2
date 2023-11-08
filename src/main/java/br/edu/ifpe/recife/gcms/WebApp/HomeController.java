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
//=======
	
	@RequestMapping("/andre")
	public @ResponseBody String greetingAndre() {
		return "Hello, Andre!!!!";
	}
//<<<<<<< HEAD
//criei a ramificação andresilva	
	@RequestMapping("/andrehotfix2")
	public @ResponseBody String greetingAndreHotFix2() {
		return "Hello, AndreHotFix2!!!!";
//=======
//	@RequestMapping("/andrehotfix")
//	public @ResponseBody String greetingAndreHotFix() {
//		return "Hello, AndreHotFix!!!!";
//>>>>>>> hotfix
//>>>>>>> 38e221ad1eb11a57988edc363021c459e9a46987
	}

}
