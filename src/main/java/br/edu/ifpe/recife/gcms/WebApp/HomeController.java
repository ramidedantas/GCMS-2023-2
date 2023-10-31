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
	public @ResponseBody String greetingMain() {
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
		return "Hello, Flavio!!!";
	}


}
