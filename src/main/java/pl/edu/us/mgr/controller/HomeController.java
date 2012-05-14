package pl.edu.us.mgr.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.edu.us.mgr.model.Event;

/**
 * Podstawowy kontroler aplikacji Odpowiada na zadanie strony glownej
 * 
 * @author skupiszy
 * 
 */
@Controller
public class HomeController {

	private static Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Metoda zwraca index.jsp
	 * 
	 * @return
	 */
	// metoda wykona sie po wywolaniu adresu glowny ( http://server/mgr/ )
	@RequestMapping(value = "/")
	public String index() {
		logger.info("index");
		// nazwa pliku bez rozszerzenia z katalogu WEB-INF/views
		return "index";
	}

	// dla przykladu jak handlowac inny adres (tylko metoda GET)
	@RequestMapping(value = "/first", method = RequestMethod.GET)
	public String first(Model model) {
		logger.info("Received first");

		Event event = new Event();
		event.setDate(new Date());
		event.setName("Przykladowy Event");
		event.setDescription("Opis");
		
		// dodajemy zmienna do widoku
		model.addAttribute("event", event);

		// zwracamy widok
		return "first";
	}

}
