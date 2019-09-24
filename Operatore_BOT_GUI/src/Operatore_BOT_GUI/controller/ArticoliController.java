package Operatore_BOT_GUI.controller;

	import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import Operatore_BOT_GUI.model.Articolo;
import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Model;
import Operatore_BOT_GUI.model.WordCloudGenerator;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;
	import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
	
	

		public class ArticoliController {
			
		    @FXML // ResourceBundle that was given to the FXMLLoader
		    private ResourceBundle resources;

		    @FXML // URL location of the FXML file that was given to the FXMLLoader
		    private URL location;

		    @FXML // fx:id="imgComparaangAzAr"
		    private ImageView imgComparaangAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="lblAziendaCompArt"
		    private Label lblAziendaCompArt; // Value injected by FXMLLoader

		    @FXML // fx:id="cmbArticoli"
		    private ComboBox<Articolo> cmbArticoli; // Value injected by FXMLLoader

		    @FXML // fx:id="btninfoAzArt"
		    private Button btninfoAzArt; // Value injected by FXMLLoader

		    @FXML // fx:id="btnIndBilancioAzAr"
		    private Button btnIndBilancioAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="btnIndBrevettiAzAr"
		    private Button btnIndBrevettiAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="btnIndAppaltiAzAr"
		    private Button btnIndAppaltiAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="btnIndProgettiAzAr"
		    private Button btnIndProgettiAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="btnIndProdottiAzAr"
		    private Button btnIndProdottiAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="btnArticArt"
		    private Button btnArticArt; // Value injected by FXMLLoader

		    @FXML // fx:id="btnIndNewsAzAr"
		    private Button btnIndNewsAzAr; // Value injected by FXMLLoader

		    @FXML // fx:id="btnTornaClassificaAr"
		    private Button btnTornaClassificaAr; // Value injected by FXMLLoader

		    @FXML // fx:id="cmbAltraAziendaAr"
		    private ComboBox<Azienda> cmbAltraAziendaAr; // Value injected by FXMLLoader

		    @FXML // fx:id="lblLinkArt"
		    private Label lblLinkArt; // Value injected by FXMLLoader

		    @FXML // fx:id="lblBackArt"
		    private Label lblBackArt; // Value injected by FXMLLoader

		    @FXML // fx:id="lblTestoArt"
		    private Label lblTestoArt; // Value injected by FXMLLoader

		    @FXML // fx:id="lblDataArticolo"
		    private Label lblDataArticolo; // Value injected by FXMLLoader

		    @FXML // fx:id="lblKeywordsAr"
		    private Label lblKeywordsAr; // Value injected by FXMLLoader

		    @FXML // fx:id="txtAppNumero"
		    private TextField txtAppNumero; // Value injected by FXMLLoader

		    @FXML // fx:id="txtFamilyID"
		    private TextField txtFamilyID; // Value injected by FXMLLoader

		    @FXML // fx:id="txtTit"
		    private TextField txtTit; // Value injected by FXMLLoader

		    @FXML // fx:id="txtTestoArt"
		    private TextArea txtTestoArt; // Value injected by FXMLLoader

		    @FXML // fx:id="txtDataArt"
		    private TextField txtDataArt; // Value injected by FXMLLoader

		    @FXML // fx:id="txtKeywordArt"
		    private TextField txtKeywordArt; // Value injected by FXMLLoader

		    @FXML // fx:id="txtBackArti"
		    private TextField txtBackArti; // Value injected by FXMLLoader

		    @FXML // fx:id="txtLinkArt"
		    private TextField txtLinkArt; // Value injected by FXMLLoader

		    Model model;
		    private Articolo articolo = new Articolo();
		    Azienda aziendaSel;
		    
		    public void setModel(Model model) {
		    	this.model = model;
		    	aziendaSel = model.getAziendaSelezionata();
		    	List<Articolo> articoli = this .model.getArticoliAzienda(aziendaSel);
		    	cmbArticoli.getItems().addAll(articoli);
		    	cmbArticoli.getItems().add(0, null);
		    	lblAziendaCompArt.setText(aziendaSel.toString());
		    	List<Azienda> altreAz = model.getAziendeMenoSelezionata(aziendaSel);
		    	cmbAltraAziendaAr.getItems().addAll(altreAz);
		    	cmbAltraAziendaAr.getItems().add(0, null);
		    }
		    
		    @FXML
		    void doApriaListaAziende(ActionEvent event) throws IOException {
		    	model.setAziendaSelezionata(cmbAltraAziendaAr.getValue());
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Articoli.fxml"));
				ScrollPane root = (ScrollPane)loader.load();
				ArticoliController controller = loader.getController();
				controller.setModel(model);
		    	
				Scene goToHome = new Scene(root);
		    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	newStage.setScene(goToHome);
		    	newStage.show();

		    }
		    
		    @FXML
		    void doApriBilancio(ActionEvent event) throws IOException {
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("IndiciBilancio.fxml"));
				ScrollPane root = (ScrollPane)loader.load();
				IndiciBilancioController controller = loader.getController();
				controller.setModel(model);
		    	
				Scene goToHome = new Scene(root);
		    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	newStage.setScene(goToHome);
		    	newStage.show();
		    }

		    @FXML
		    void doEstraiAppalti(ActionEvent event) throws IOException {
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Appalti.fxml"));
				ScrollPane root = (ScrollPane)loader.load();
				AppaltiController controller = loader.getController();
				controller.setModel(model);
		    	
				Scene goToHome = new Scene(root);
		    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	newStage.setScene(goToHome);
		    	newStage.show();
		    }

		    @FXML
		    void doEstraiArticoli(ActionEvent event) throws IOException {
//		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Articoli.fxml"));
//				ScrollPane root = (ScrollPane)loader.load();
//				ArticoliController controller = loader.getController();
//				controller.setModel(model);
//		    	
//				Scene goToHome = new Scene(root);
//		    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
//		    	newStage.setScene(goToHome);
//		    	newStage.show();
		    }

		    @FXML
		    void doEstraiAziendeArtic(ActionEvent event) {
		    	this.articolo = cmbArticoli.getValue();

		    	WordCloudGenerator gen = new WordCloudGenerator (articolo.getText());
		    	gen.generateCloud();
		    	
		    	txtLinkArt.setText(articolo.getLink());
		    	txtBackArti.setText(articolo.getBacklink());
		    	txtTestoArt.setText(articolo.getText());
		    	txtKeywordArt.setText(articolo.getKeywords());
		    	txtDataArt.setText(articolo.getDate());

		    }

		    @FXML
		    void doEstraiBrevetti(ActionEvent event) throws IOException {
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("AziendaBrevetto.fxml"));
				ScrollPane root = (ScrollPane)loader.load();
				AziendaBrevettoController controller = loader.getController();
				controller.setModel(model);
		    	
				Scene goToHome = new Scene(root);
		    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	newStage.setScene(goToHome);
		    	newStage.show();
		    }

		    @FXML
		    void doEstraiInfoAzienda(ActionEvent event) throws IOException {
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("InfoAzienda.fxml"));
				ScrollPane root = (ScrollPane)loader.load();
				InfoAziendaController controller = loader.getController();
				controller.setModel(model);
		    	
				Scene goToHome = new Scene(root);
		    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	newStage.setScene(goToHome);
		    	newStage.show();
		    }

		    @FXML
		    void doEstraiNews(ActionEvent event) throws IOException {
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("News.fxml"));
				ScrollPane root = (ScrollPane)loader.load();
				NewsController controller = loader.getController();
				controller.setModel(model);
		    	
				Scene goToHome = new Scene(root);
		    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	newStage.setScene(goToHome);
		    	newStage.show();
		    }

		    @FXML
		    void doEstraiProdotti(ActionEvent event) throws IOException {
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("ProdottiServizi.fxml"));
				ScrollPane root = (ScrollPane)loader.load();
				ProdottiServiziController controller = loader.getController();
				controller.setModel(model);
		    	
				Scene goToHome = new Scene(root);
		    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	newStage.setScene(goToHome);
		    	newStage.show();
		    }

		    @FXML
		    void doEstraiProgetti(ActionEvent event) throws IOException {
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Progetti.fxml"));
				ScrollPane root = (ScrollPane)loader.load();
				ProgettiController controller = loader.getController();
				controller.setModel(model);
		    	
				Scene goToHome = new Scene(root);
		    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	newStage.setScene(goToHome);
		    	newStage.show();
		    }

		    @FXML
		    void doTornaclassifica(ActionEvent event) throws IOException {
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
		    	AnchorPane root = (AnchorPane)loader.load();
				homeController controller = loader.getController();
				controller.setModel(model);
		    	
				Scene goToHome = new Scene(root);
		    	Stage newStage = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	newStage.setScene(goToHome);
		    	newStage.show();
		    }

		    @FXML // This method is called by the FXMLLoader when initialization is complete
		    void initialize() {
		        assert imgComparaangAzAr != null : "fx:id=\"imgComparaangAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert lblAziendaCompArt != null : "fx:id=\"lblAziendaCompArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert cmbArticoli != null : "fx:id=\"cmbArticoli\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btninfoAzArt != null : "fx:id=\"btninfoAzArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnIndBilancioAzAr != null : "fx:id=\"btnIndBilancioAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnIndBrevettiAzAr != null : "fx:id=\"btnIndBrevettiAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnIndAppaltiAzAr != null : "fx:id=\"btnIndAppaltiAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnIndProgettiAzAr != null : "fx:id=\"btnIndProgettiAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnIndProdottiAzAr != null : "fx:id=\"btnIndProdottiAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnArticArt != null : "fx:id=\"btnArticArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnIndNewsAzAr != null : "fx:id=\"btnIndNewsAzAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert btnTornaClassificaAr != null : "fx:id=\"btnTornaClassificaAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert cmbAltraAziendaAr != null : "fx:id=\"cmbAltraAziendaAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert lblLinkArt != null : "fx:id=\"lblLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert lblBackArt != null : "fx:id=\"lblBackArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert lblTestoArt != null : "fx:id=\"lblTestoArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert lblDataArticolo != null : "fx:id=\"lblDataArticolo\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert lblKeywordsAr != null : "fx:id=\"lblKeywordsAr\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtAppNumero != null : "fx:id=\"txtAppNumero\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtFamilyID != null : "fx:id=\"txtFamilyID\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtTit != null : "fx:id=\"txtTit\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtTestoArt != null : "fx:id=\"txtTestoArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtDataArt != null : "fx:id=\"txtDataArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtKeywordArt != null : "fx:id=\"txtKeywordArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtBackArti != null : "fx:id=\"txtBackArti\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";
		        assert txtLinkArt != null : "fx:id=\"txtLinkArt\" was not injected: check your FXML file 'Articoli_Azienda.fxml'.";

		    }
		}
