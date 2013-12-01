package psd3.sprint2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TimetableController {

	@RequestMapping(value="timetable", method=RequestMethod.GET)
	public String newSession(Model model) {
		//Load timetable

		return "timetable";
	}
}
