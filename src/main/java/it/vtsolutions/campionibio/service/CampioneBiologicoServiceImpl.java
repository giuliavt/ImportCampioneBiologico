package it.vtsolutions.campionibio.service;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.vtsolutions.campionibio.entity.CampioneBiologico;
import it.vtsolutions.campionibio.repository.CampioneBiologicoRespository;

@Service
@Transactional(readOnly = true)
public class CampioneBiologicoServiceImpl implements CampioneBiologicoService {

	//@Autowired
	private CampioneBiologicoRespository repository;
	public CampioneBiologicoServiceImpl(CampioneBiologicoRespository repository) {
		this.repository=repository;
	}
	
	@Override
	@Transactional
	public void insertNewRows() throws IOException, ParseException {

		Stream<String> lines = Files.lines(Paths.get("./files/INNOPROST-al-19-Luglio-2018-wt-csv.txt"));
		lines.forEach(new Consumer<String>() {

			@Override
			public void accept(String linea) {
				try {
					// StringTokenizer st = new StringTokenizer(linea, ";");

					String[] campi = linea.split(";", 28);
					CampioneBiologico c = new CampioneBiologico();
					if (!campi[0].isEmpty())
						c.setCodRh(campi[0]);
					if (!campi[1].isEmpty())
						c.setNumeroCartellaClinica(new BigInteger(campi[1]));
					if (!campi[2].isEmpty())
						c.setCodUmg(campi[2]);
					if (!campi[3].isEmpty())
						c.setDataEsecuzione(new SimpleDateFormat("dd/MM/yyyy").parse(campi[3]));
					if (!campi[4].isEmpty())
						c.setEtaPaziente(Integer.parseInt(campi[4]));
					if (!campi[5].isEmpty())
						c.setDimensioneGhiandolaProstatica(Integer.parseInt(campi[5]));
					
					campi[6]=campi[6].replace("+", "_");
					if (!campi[6].isEmpty())
						c.setTipoCampione(campi[6].toUpperCase());
					if (!campi[7].isEmpty())
						c.setValutazionePca3(campi[7]);
					if (!campi[8].isEmpty())
						c.setPsaTotale(Float.parseFloat(campi[8].replaceAll(",", ".")));
					if (!campi[9].isEmpty())
						c.setRapportoFt(Float.parseFloat(campi[9].replaceAll(",", ".")));
					if (!campi[10].isEmpty())
						c.setPsaFree(Float.parseFloat(campi[10].replaceAll(",", ".")));
					
					if (!campi[11].isEmpty())
						c.setMalattia(campi[11].toUpperCase());
					if (!campi[12].isEmpty())
						c.setDataBiopsia(new SimpleDateFormat("dd/MM/yyyy").parse(campi[12]));
					if (!campi[13].isEmpty())
						c.setEsitoBiopsiaProstaticaGleasonScoreComposizione(campi[13]);
					if (!campi[14].isEmpty())
						c.setEsitoBiopsiaProstaticaGleasonScore(campi[14]);
					if (!campi[15].isEmpty())
						c.setNumeroPrelieviPositiviSulTotale(Integer.parseInt(campi[15]));
					campi[16] = campi[16].replaceAll("\\s","");
					if (!campi[16].isEmpty())
						c.setTotalePrelievi(Integer.parseInt(campi[16]));
					campi[17] = campi[17].replaceAll("\\s","");
					if (!campi[17].isEmpty() && !campi[17].equals("no") && campi[17].equals("si"))
						c.setPregressaChirurgiaProstatica(true);
					else if (campi[17].equals("no"))
						c.setPregressaChirurgiaProstatica(false);
					campi[18] = campi[18].replaceAll("\\s","");
					if (!campi[18].isEmpty() && !campi[18].equals("no") && campi[18].equals("si"))
						c.setTerapiaInibitori5AlfaReduttasi(true);
					else if (campi[18].equals("no"))
						c.setTerapiaInibitori5AlfaReduttasi(false);
					campi[19] = campi[19].replaceAll("\\s","");
					if (!campi[19].isEmpty() && !campi[19].equals("no") && campi[19].equals("si"))
						c.setTerapiaAntiandrogenicaNeoadiuvante(true);
					else if (campi[19].equals("no"))
						c.setTerapiaAntiandrogenicaNeoadiuvante(false);
					campi[20] = campi[20].replaceAll("\\s","");
					if (!campi[20].isEmpty() && !campi[20].equals("no") && campi[20].equals("si"))
						c.setRadioterapiaPelvi(true);
					else if (campi[20].equals("no"))
						c.setRadioterapiaPelvi(false);
					
					if (!campi[21].isEmpty()) {
						c.setRischio(campi[21].toUpperCase());
					}
					if (!campi[22].isEmpty())
						c.setDataIntervento(new SimpleDateFormat("dd/MM/yyyy").parse(campi[22]));

					if (!campi[23].isEmpty())
						c.setEsameIstologicoT(campi[23]);

					if (!campi[24].isEmpty())
						c.setEsameIstologicoN(campi[24]);

					if (!campi[25].isEmpty())
						c.setEsameIstologicoGleasonScoreComposizione(campi[25]);

					if (!campi[26].isEmpty()) {
						c.setEsameIstologicoGleasonScore(campi[26]);
					}
					repository.saveAndFlush(c);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
