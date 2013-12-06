package psd3.sprint2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("logintype")
public class TimetableController {
	@RequestMapping(value="timetable", method=RequestMethod.GET)
	public String timetable(@ModelAttribute(value="logintype") String logintype, Model model) {
		if (!logintype.equals("user")) {
			return "redirect:/login";
		}

		return "timetable";
	}
}