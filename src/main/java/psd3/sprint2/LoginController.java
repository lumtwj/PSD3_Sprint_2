package psd3.sprint2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import psd3.sprint2.object.SessionSetupLogin;

@Controller
public class LoginController {
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("sesslogin", new SessionSetupLogin());
		model.addAttribute("message","");

		return "login";
	}


	@RequestMapping(value="login", method=RequestMethod.POST)
	public String saveSession(@ModelAttribute(value="sesslogin") SessionSetupLogin sesslogin, Model model) {
		//Process login
		if (sesslogin.getLogin().equals("admin") && sesslogin.getPassword().equals("admin")) {
			return "redirect:/NewSession";
		}
		else if(sesslogin.getLogin().equals("user") && sesslogin.getPassword().equals("user")){
			return "redirect:/timetable";
		}else{
			model.addAttribute("message", "Wrong password/username");
		}

		return "login";
	}
}