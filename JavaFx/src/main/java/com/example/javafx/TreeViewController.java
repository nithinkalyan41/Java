package com.example.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import java.util.ResourceBundle;

import java.net.URL;
import java.util.ResourceBundle;

public class TreeViewController implements Initializable {
    @FXML
    private TreeView myTreeView;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> rootItem = new TreeItem<>("Files");
        TreeItem<String> brachItem1 = new TreeItem<>("Pictures");
        TreeItem<String> brachItem2 = new TreeItem<>("Videos");
        TreeItem<String> brachItem3 = new TreeItem<>("Music");

        TreeItem<String> leafItem1 = new TreeItem<>("Picture1");
        TreeItem<String> leafItem2 = new TreeItem<>("Picture2");
        TreeItem<String> leafItem3 = new TreeItem<>("Videos1");
        TreeItem<String> leafItem4 = new TreeItem<>("Videos2");
        TreeItem<String> leafItem5 = new TreeItem<>("Music1");
        TreeItem<String> leafItem6 = new TreeItem<>("Music2");

        brachItem1.getChildren().addAll(leafItem1,leafItem2);
        brachItem2.getChildren().addAll(leafItem3,leafItem4);
        brachItem3.getChildren().addAll(leafItem5,leafItem6);


        rootItem.getChildren().add(brachItem1);
        rootItem.getChildren().add(brachItem2);
        rootItem.getChildren().add(brachItem3);
        myTreeView.setRoot(rootItem);
    }
    public void selectItem(){
        TreeItem<String> item = (TreeItem<String>) myTreeView.getSelectionModel().getSelectedItem();

        if(item != null) {
            System.out.println(item.getValue());
        }
    }
}
