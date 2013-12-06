package psd3.sprint2;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import psd3.sprint2.object.SessionSetup;

@Controller
@SessionAttributes("logintype")
public class NewSessionController {
	@RequestMapping(value="NewSession", method=RequestMethod.GET)
	public String newSession(@RequestParam(value="message", required=false, defaultValue="") String message, @ModelAttribute(value="logintype") String logintype, Model model) {
		if (!logintype.equals("admin")) {
			return "redirect:/login";
		}
		else {
			//Load form
			model.addAttribute("message", message);
			model.addAttribute("sess", new SessionSetup());	
		}

		return "NewSession";
	}

	@RequestMapping(value="NewSession", method=RequestMethod.POST)
	public String saveSession(@ModelAttribute(value="sess") SessionSetup s, Model model) {
		//Process form
		model.addAttribute("message", "Session has been added");

		//Save to database
		try {
			FileWriter f = new FileWriter("newSession.csv", true);
			f.write(s.getTitle() + "," + s.getStart() + "," + s.getDuration() + "," + s.getRepeatFrequency() + "," + s.getLecturer() + "," + s.getMaxAttendance() + "," + s.isCompulsary() + "," + s.getVenue() + "\n");
			f.close();
		} 
		catch (IOException e) {e.printStackTrace();}

		//Clear the forms
		model.addAttribute("sess", new SessionSetup());

		return "NewSession";
	}
}
