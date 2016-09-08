package ro.fortsoft.pf4j.demo.plus;

import ro.fortsoft.pf4j.Extension;
import ro.fortsoft.pf4j.Plugin;
import ro.fortsoft.pf4j.PluginWrapper;
import ro.fortsoft.pf4j.RuntimeMode;
import ro.fortsoft.pf4j.demo.api.Operation;

public class PlusPlugin extends Plugin{

    public PlusPlugin(PluginWrapper wrapper) {
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
    public static class PlusPluginOperation implements Operation {
        public float compute(float... args) {
            float result = 0;
            for(float x: args) {
                result += x;
            }
            return result;
        }
    }
}
