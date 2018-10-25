package it.vtsolutions.campionibio;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import it.vtsolutions.campionibio.entity.CampioneBiologico;

@SpringBootApplication
public class CampioniBioApplication {
//aggiunta testo per test su GitHub
	public static void main(String[] args) {
		SpringApplication.run(CampioniBioApplication.class, args);

	}

}
