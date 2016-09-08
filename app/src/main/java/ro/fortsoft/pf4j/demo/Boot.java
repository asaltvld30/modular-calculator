/*
 * Copyright 2012 Decebal Suiu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.fortsoft.pf4j.demo;

import java.util.List;
import java.util.Set;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.commons.lang.StringUtils;

import org.apache.commons.lang.exception.ExceptionUtils;
import ro.fortsoft.pf4j.DefaultPluginManager;
import ro.fortsoft.pf4j.PluginManager;
import ro.fortsoft.pf4j.PluginWrapper;
import ro.fortsoft.pf4j.demo.api.Greeting;
import ro.fortsoft.pf4j.demo.api.LabelExtensionPoint;
import ro.fortsoft.pf4j.demo.api.Operation;

/**
 * A boot class that start the demo.
 *
 * @author Decebal Suiu
 */
public class Boot extends Application {


    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
        // create the plugin manager



        /*
        Runtime.getRuntime().addShutdownHook(new Thread() {

			@Override
			public void run() {
				pluginManager.stopPlugins();
			}

        });
        */
    }
}
