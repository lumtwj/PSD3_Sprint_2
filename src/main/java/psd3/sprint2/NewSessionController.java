package psd3.sprint2;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import psd3.sprint2.object.SessionSetup;

@Controller
public class NewSessionController {
	@RequestMapping(value="/NewSession", method=RequestMethod.GET)
	public String newSession(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		//Load form
		model.addAttribute("name", name);
		model.addAttribute("sess", new SessionSetup());

		return "NewSession";
	}

	@RequestMapping(value="/NewSession", method=RequestMethod.POST)
	public String saveSession(@ModelAttribute(value="sess") SessionSetup s, Model model) {
		//Process form
		model.addAttribute("name", "Successfully saved session:" +
				" Date: " + s.getDate() + 
				" Time: " + s.getTime() +
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
		model.addAttribute("sess", new SessionSetup());

		return "NewSession";
	}
}
