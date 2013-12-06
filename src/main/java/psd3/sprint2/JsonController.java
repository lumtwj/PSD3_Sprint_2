package psd3.sprint2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import psd3.sprint2.object.SessionSetup;

import com.google.gson.Gson;

@Controller
public class JsonController {
	@RequestMapping(value="json", method=RequestMethod.GET)
	public @ResponseBody String sessionData(Model model) {
		ArrayList<SessionSetup> ssal = new ArrayList<SessionSetup>();

		try {
			FileReader reader = new FileReader("newSession.csv");
			Scanner scan = new Scanner(reader);

			while (scan.hasNext()) {
				String line = scan.nextLine();
				String [] arr = line.split(",");

				ssal.add(new SessionSetup(
						arr[0], 
						arr[1], 
						"null", 
						arr[7],
						arr[2], 
						arr[3], 
						arr[4],
						Integer.parseInt(arr[5]), 
						Boolean.parseBoolean(arr[6])
						));
			}

			scan.close();
		}
		catch (FileNotFoundException e) {e.printStackTrace();}

		Gson gson = new Gson();

		return gson.toJson(ssal);
	}
}