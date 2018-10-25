package it.vtsolutions.campionibio.entity;


import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
/**
 * The persistent class for the campione_biologico database table.
 * 
 */
@Entity
@Table(name = "campione_biologico")
public class CampioneBiologico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "cod_rh")
	private String codRh;

	@Column(name = "cod_umg")
	private String codUmg;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_biopsia")
	private Date dataBiopsia;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_reclutament")
	private Date dataEsecuzione;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_intervento")
	private Date dataIntervento;

	@Column(name = "dimensione_ghiandola_prostatica")
	private int dimensioneGhiandolaProstatica;

	@Column(name = "esame_istologico_gleason_score")
	private String esameIstologicoGleasonScore;

	@Column(name = "esame_istologico_gleason_score_composizione")
	private String esameIstologicoGleasonScoreComposizione;

	@Column(name = "esame_istologico_n")
	private String esameIstologicoN;

	@Column(name = "esame_istologico_t")
	private String esameIstologicoT;

	@Column(name = "esito_biopsia_prostatica_gleason_score")
	private String esitoBiopsiaProstaticaGleasonScore;

	@Column(name = "esito_biopsia_prostatica_gleason_score_composizione")
	private String esitoBiopsiaProstaticaGleasonScoreComposizione;

	@Column(name = "eta_paziente")
	private int etaPaziente;

	private String malattia;

	@Column(name = "numero_cartella_clinica")
	private BigInteger numeroCartellaClinica;

	@Column(name = "numero_prelievi_positivi_sul_totale")
	private int numeroPrelieviPositiviSulTotale;

	@Column(name = "pregressa_chirurgia_prostatica")
	private boolean pregressaChirurgiaProstatica;

	@Column(name = "psa_free")
	private float psaFree;

	@Column(name = "psa_totale")
	private float psaTotale;

	@Column(name = "radioterapia_pelvi")
	private boolean radioterapiaPelvi;

	@Column(name = "rapporto_ft")
	private float rapportoFt;

	private String rischio;

	@Column(name = "terapia_antiandrogenica_neoadiuvante")
	private boolean terapiaAntiandrogenicaNeoadiuvante;

	@Column(name = "terapia_inibitori_5_alfa_reduttasi")
	private boolean terapiaInibitori5AlfaReduttasi;

	@Column(name = "tipo_campione")
	private String tipoCampione;

	@Column(name = "totale_prelievi")
	private int totalePrelievi;

	@Column(name = "valutazione_pca_3")
	private String valutazionePca3;

	public CampioneBiologico() {
	}

	public String getCodRh() {
		return this.codRh;
	}

	public void setCodRh(String codRh) {
		this.codRh = codRh;
	}

	public String getCodUmg() {
		return this.codUmg;
	}

	public void setCodUmg(String codUmg) {
		this.codUmg = codUmg;
	}

	public Date getDataBiopsia() {
		return this.dataBiopsia;
	}

	public void setDataBiopsia(Date dataBiopsia) {
		this.dataBiopsia = dataBiopsia;
	}

	public Date getDataEsecuzione() {
		return this.dataEsecuzione;
	}

	public void setDataEsecuzione(Date dataEsecuzione) {
		this.dataEsecuzione = dataEsecuzione;
	}

	public Date getDataIntervento() {
		return this.dataIntervento;
	}

	public void setDataIntervento(Date dataIntervento) {
		this.dataIntervento = dataIntervento;
	}

	public int getDimensioneGhiandolaProstatica() {
		return this.dimensioneGhiandolaProstatica;
	}

	public void setDimensioneGhiandolaProstatica(int dimensioneGhiandolaProstatica) {
		this.dimensioneGhiandolaProstatica = dimensioneGhiandolaProstatica;
	}

	public String getEsameIstologicoGleasonScore() {
		return this.esameIstologicoGleasonScore;
	}

	public void setEsameIstologicoGleasonScore(String esameIstologicoGleasonScore) {
		this.esameIstologicoGleasonScore = esameIstologicoGleasonScore;
	}

	public String getEsameIstologicoGleasonScoreComposizione() {
		return this.esameIstologicoGleasonScoreComposizione;
	}

	public void setEsameIstologicoGleasonScoreComposizione(String esameIstologicoGleasonScoreComposizione) {
		this.esameIstologicoGleasonScoreComposizione = esameIstologicoGleasonScoreComposizione;
	}

	public String getEsameIstologicoN() {
		return this.esameIstologicoN;
	}

	public void setEsameIstologicoN(String esameIstologicoN) {
		this.esameIstologicoN = esameIstologicoN;
	}

	public String getEsameIstologicoT() {
		return this.esameIstologicoT;
	}

	public void setEsameIstologicoT(String esameIstologicoT) {
		this.esameIstologicoT = esameIstologicoT;
	}

	public String getEsitoBiopsiaProstaticaGleasonScore() {
		return this.esitoBiopsiaProstaticaGleasonScore;
	}

	public void setEsitoBiopsiaProstaticaGleasonScore(String esitoBiopsiaProstaticaGleasonScore) {
		this.esitoBiopsiaProstaticaGleasonScore = esitoBiopsiaProstaticaGleasonScore;
	}

	public String getEsitoBiopsiaProstaticaGleasonScoreComposizione() {
		return this.esitoBiopsiaProstaticaGleasonScoreComposizione;
	}

	public void setEsitoBiopsiaProstaticaGleasonScoreComposizione(
			String esitoBiopsiaProstaticaGleasonScoreComposizione) {
		this.esitoBiopsiaProstaticaGleasonScoreComposizione = esitoBiopsiaProstaticaGleasonScoreComposizione;
	}

	public int getEtaPaziente() {
		return this.etaPaziente;
	}

	public void setEtaPaziente(int etaPaziente) {
		this.etaPaziente = etaPaziente;
	}

	public String getMalattia() {
		return this.malattia;
	}

	public void setMalattia(String malattia) {
		this.malattia = malattia;
	}

	public BigInteger getNumeroCartellaClinica() {
		return this.numeroCartellaClinica;
	}

	public void setNumeroCartellaClinica(BigInteger numeroCartellaClinica) {
		this.numeroCartellaClinica = numeroCartellaClinica;
	}

	public int getNumeroPrelieviPositiviSulTotale() {
		return this.numeroPrelieviPositiviSulTotale;
	}

	public void setNumeroPrelieviPositiviSulTotale(int numeroPrelieviPositiviSulTotale) {
		this.numeroPrelieviPositiviSulTotale = numeroPrelieviPositiviSulTotale;
	}

	public boolean getPregressaChirurgiaProstatica() {
		return this.pregressaChirurgiaProstatica;
	}

	public void setPregressaChirurgiaProstatica(boolean pregressaChirurgiaProstatica) {
		this.pregressaChirurgiaProstatica = pregressaChirurgiaProstatica;
	}

	public float getPsaFree() {
		return this.psaFree;
	}

	public void setPsaFree(float psaFree) {
		this.psaFree = psaFree;
	}

	public float getPsaTotale() {
		return this.psaTotale;
	}

	public void setPsaTotale(float psaTotale) {
		this.psaTotale = psaTotale;
	}

	public boolean getRadioterapiaPelvi() {
		return this.radioterapiaPelvi;
	}

	public void setRadioterapiaPelvi(boolean radioterapiaPelvi) {
		this.radioterapiaPelvi = radioterapiaPelvi;
	}

	public float getRapportoFt() {
		return this.rapportoFt;
	}

	public void setRapportoFt(float rapportoFt) {
		this.rapportoFt = rapportoFt;
	}

	public String getRischio() {
		return this.rischio;
	}

	public void setRischio(String rischio) {
		this.rischio = rischio;
	}

	public boolean getTerapiaAntiandrogenicaNeoadiuvante() {
		return this.terapiaAntiandrogenicaNeoadiuvante;
	}

	public void setTerapiaAntiandrogenicaNeoadiuvante(boolean terapiaAntiandrogenicaNeoadiuvante) {
		this.terapiaAntiandrogenicaNeoadiuvante = terapiaAntiandrogenicaNeoadiuvante;
	}

	public boolean getTerapiaInibitori5AlfaReduttasi() {
		return this.terapiaInibitori5AlfaReduttasi;
	}

	public void setTerapiaInibitori5AlfaReduttasi(boolean terapiaInibitori5AlfaReduttasi) {
		this.terapiaInibitori5AlfaReduttasi = terapiaInibitori5AlfaReduttasi;
	}

	public String getTipoCampione() {
		return this.tipoCampione;
	}

	public void setTipoCampione(String tipoCampione) {
		this.tipoCampione = tipoCampione;
	}

	public int getTotalePrelievi() {
		return this.totalePrelievi;
	}

	public void setTotalePrelievi(int totalePrelievi) {
		this.totalePrelievi = totalePrelievi;
	}

	public String getValutazionePca3() {
		return this.valutazionePca3;
	}

	public void setValutazionePca3(String valutazionePca3) {
		this.valutazionePca3 = valutazionePca3;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}