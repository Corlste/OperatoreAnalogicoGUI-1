package Operatore_BOT_GUI.controller;

import java.util.ArrayList;
import java.util.List;

import Operatore_BOT_GUI.model.Articolo;
import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.Model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class KeywordCorrelationController {
	
	@FXML
    private Label lblKeyword;

    @FXML
    private ListView<Articolo> list_articoli;

    @FXML
    private ListView<?> list_brevetti;
    
    Model model;
    
    public void setModel(Model model) {
    	this.model = model;
    	
    	

    }
    
    private void populateArticoli () {
    	
    	ArrayList<Articolo> articoli = model.getArticoliCorrelati(lblKeyword.getText());
    	
    	for (Articolo a : articoli) System.out.println(a.getTitle());
    	
    	ObservableList<Articolo> items = FXCollections.observableArrayList(articoli);
    	list_articoli.setItems(items);
    	
    	System.out.println("ARRIVO QUI");
    	
    }
    
    
    public void setKeyword (String key) {
    	this.lblKeyword.setText(key);
    	this.populateArticoli();
    	
    }
    
    
    
    private void populateBrevetti () {
    	
    }

}
