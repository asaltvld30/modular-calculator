package ro.fortsoft.pf4j.demo.multiply;

import javafx.scene.control.Label;
import ro.fortsoft.pf4j.Extension;
import ro.fortsoft.pf4j.Plugin;
import ro.fortsoft.pf4j.PluginWrapper;
import ro.fortsoft.pf4j.RuntimeMode;
import ro.fortsoft.pf4j.demo.api.LabelExtensionPoint;
import ro.fortsoft.pf4j.demo.api.Operation;

public class MultiplyPlugin extends Plugin {

    public MultiplyPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }
    @Override
    public void start() {
        System.out.println("OperationPlugin.start()");
        // for testing the development mode
        if (RuntimeMode.DEVELOPMENT.equals(wrapper.getRuntimeMode())) {

        }
    }

    @Override
    public void stop() {
        System.out.println("OperationPlugin.stop()");
    }

    @Extension
    public static class MultiplyPluginOperation implements LabelExtensionPoint {
        public Label getNode() {
            return new Label("Asta este Plugin #4");
        }
    }
}
