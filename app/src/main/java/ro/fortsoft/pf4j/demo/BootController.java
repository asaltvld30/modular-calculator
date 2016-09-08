package ro.fortsoft.pf4j.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import ro.fortsoft.pf4j.DefaultPluginManager;
import ro.fortsoft.pf4j.PluginManager;
import ro.fortsoft.pf4j.demo.api.LabelExtensionPoint;
import ro.fortsoft.pf4j.demo.api.Operation;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by Iulian on 9/8/2016.
 */
public class BootController implements Initializable {
    final PluginManager pluginManager = new DefaultPluginManager();
    @FXML
    public GridPane gridPane = new GridPane();

    public BootController() {
        // load the plugins
        pluginManager.loadPlugins();

        // start (active/resolved) the plugins
        pluginManager.startPlugins();

        List<Operation> operations = pluginManager.getExtensions(Operation.class);
        System.out.println("Am aici o operatie " + operations.size());
        for (Operation operation: operations) {
            System.out.println(operation.compute(3, 4));
        }
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<LabelExtensionPoint> labels = pluginManager.getExtensions(LabelExtensionPoint.class);
        System.out.println("Am aici " + labels.size() + " label-uri ");

        int index = 1;
        for (LabelExtensionPoint label:  labels) {
            gridPane.add(label.getNode(), 0, index++);
        }
    }
}
