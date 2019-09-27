package Operatore_BOT_GUI.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import Operatore_BOT_GUI.model.Articolo;
import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Brevetto;
import Operatore_BOT_GUI.model.Model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class KeywordCorrelationController {
	
	@FXML
    private Label lblKeyword;

    @FXML
    private ListView<Articolo> list_articoli;

    @FXML
    private ListView<Brevetto> list_brevetti;
    
    @FXML
    private Label titolo_art;

    @FXML
    private Label azienda_art;

    @FXML
    private TextArea text_art;

    @FXML
    private Label titolo_brev;

    @FXML
    private Label azienda_brev;

    @FXML
    private TextArea text_brev;
    
    Model model;
    
    public void setModel(Model model) {
    	this.model = model;
    	list_articoli.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    	list_brevetti.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }
    
    
    @FXML
    void showArticleInfo(MouseEvent event) {
    	Articolo art = list_articoli.getSelectionModel().getSelectedItem();
    	titolo_art.setText(art.getTitle());
    	azienda_art.setText(art.getPartitaIVA());
    	text_art.setText(art.getText());
    }
    
    
    @FXML
    void showPatentInfo(MouseEvent event) {
    	Brevetto brev = list_brevetti.getSelectionModel().getSelectedItem();
    	titolo_brev.setText(brev.getTitolo());
    	azienda_brev.setText(brev.getPartitaIVA());
    	text_brev.setText(brev.getAbstractBrevetto());
    }
    
    
    public void setKeyword (String key) {
    	this.lblKeyword.setText("Keyword: " + "\"" + key + "\"");
    	this.populateArticoli();
    	this.populateBrevetti();
    	
    }
    
    
    private void populateArticoli () {
    	
    	String keytext = StringUtils.substringBetween(lblKeyword.getText(), "Keyword: \"", "\"");
    	ArrayList<Articolo> articoli = model.getArticoliCorrelati(keytext);
    	
//    	for (Articolo a : articoli) System.out.println(a.getTitle());
    	
    	ObservableList<Articolo> items = FXCollections.observableArrayList(articoli);
    	list_articoli.setItems(items);
    	
    	System.out.println("ARRIVO QUI art");
    	
    }    
    
    
    private void populateBrevetti () {
    	
    	String keytext = StringUtils.substringBetween(lblKeyword.getText(), "Keyword: \"", "\"");
    	ArrayList<Brevetto> brevetti = model.getBrevettiCorrelati(keytext);
    	
//    	for (Brevetto b : brevetti) System.out.println(b.getTitolo());
    	
    	ObservableList<Brevetto> items = FXCollections.observableArrayList(brevetti);
    	list_brevetti.setItems(items);
    	
    	System.out.println("ARRIVO QUI brev");
    }

}
