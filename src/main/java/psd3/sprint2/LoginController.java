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
		//Load form
		model.addAttribute("sesslogin", new SessionSetupLogin());
		model.addAttribute("name","");
		return "login";
	}


	@RequestMapping(value="login", method=RequestMethod.POST)
	public String saveSession(@ModelAttribute(value="sesslogin") SessionSetupLogin sesslogin, Model model) {
		//Process form
		
		
		if (sesslogin.getLogin().equals("admin") && sesslogin.getPassword().equals("admin")) {
			return "redirect:/NewSession";
		}
		else if(sesslogin.getLogin().equals("user") && sesslogin.getPassword().equals("user")){
			return "redirect:/timetable";
		}else{
			model.addAttribute("name","Wrong password/username");
		}
		
		/*model.addAttribute("name", "Successfully saved session:" +
				" Date: " + s.getDate() + 
				" Duration: " + s.getDuration() +
				" Repeat frequency: " + s.getRepeatFrequency() + 
				" Lecturer: " + s.getLecturer() +
				" Max attendance: " + s.getMaxAttendance() + 
				" Compulsory: " + s.isCompulsary() + 
				" Venue: " + s.getVenue()
				);

		//Save to database
		try {
			FileWriter f = new FileWriter("newSession.csv", true);
			f.write(s.getDate() + "," + s.getDuration() + "," + s.getRepeatFrequency() + "," + s.getLecturer() + "," + s.getMaxAttendance() + "," + s.isCompulsary() + "," + s.getVenue() + "\n");
			f.close();
		} 
		catch (IOException e) {e.printStackTrace();}

		//Clear the forms
		model.addAttribute("sess", new SessionSetup());*/

		return "login";
	}
}
