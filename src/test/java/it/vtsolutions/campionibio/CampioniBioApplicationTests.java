package it.vtsolutions.campionibio;

import java.io.IOException;
import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import it.vtsolutions.campionibio.service.CampioneBiologicoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CampioniBioApplicationTests {

	@Autowired
	private CampioneBiologicoService service;

	@Test
	public void saveCampioniBiologici() throws IOException, ParseException {
			service.insertNewRows();
	}


}
