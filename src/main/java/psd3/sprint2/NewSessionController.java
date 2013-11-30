package psd3.sprint2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewSessionController {
	@RequestMapping(value="/NewSession", method=RequestMethod.GET)
	public String loadFormPage(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		//Load form
		model.addAttribute("name", name);
		//model.addAttribute("subscriber", new Subscriber());

		return "NewSession";
	}

	@RequestMapping(value="/NewSession", method=RequestMethod.POST)
	public String newSession(Model model) {
		//Process form

		return "NewSession";
	}


}
