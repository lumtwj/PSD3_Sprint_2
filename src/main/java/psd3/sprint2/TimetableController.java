package psd3.sprint2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import psd3.sprint2.object.SessionSetup;

@Controller
public class TimetableController {
	@RequestMapping(value="timetable", method=RequestMethod.GET)
	public String newSession(Model model) {
		//Load timetable
		ArrayList<SessionSetup> ssal = new ArrayList<SessionSetup>();

		try {
			FileReader reader = new FileReader("newSession.csv");
			Scanner scan = new Scanner(reader);

			while (scan.hasNext()) {
				String line = scan.nextLine();
				String [] arr = line.split(",");

				SessionSetup ss = new SessionSetup();

				ss.setDate(arr[0]);
				ss.setDuration(arr[1]);
				ss.setRepeatFrequency(arr[2]);
				ss.setLecturer(arr[3]);
				ss.setMaxAttendance(Integer.parseInt(arr[4]));
				ss.setCompulsary(Boolean.parseBoolean(arr[5]));
				ss.setVenue(arr[6]);

				ssal.add(ss);
			}

			scan.close();

			model.addAttribute("joetest", ssal);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "timetable";
	}
}