package controllers;

import models.Directory;
import models.Preferences;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import service.DirectoryService;
import service.PreferenceService;

/**
 * Controller that handles directory mapping
 */
@Controller
@RequestMapping("/")
@EnableWebMvc
public class DirectoryController {

	/**
	 * Shows initial directory (stored in current preferences) when user opens the main page of service
	 * @param  model ModelMap to add necessary data
	 * @return the name of default page
	 */
	@RequestMapping("/")
	public String printWelcome(ModelMap model) {
		model.addAttribute("initialDirectory",PreferenceService.getPreferences().getInitialDirectory());
		return "index";
	}

	/**
	 * Returns JSON object of directory with specified path. Next it will be recieved by client.
	 * @param path the exact path of directory
	 * @return object of Directory with specified path considering current preferences
	 */
	@RequestMapping("/dir/{path}")
	@ResponseBody
	public Directory showDir(@PathVariable String path) {
		Preferences preferences = PreferenceService.getPreferences();
		return DirectoryService.getDirectoryByPath(path, preferences);
	}

}