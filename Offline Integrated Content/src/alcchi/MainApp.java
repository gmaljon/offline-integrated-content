/*
 * The MIT License
 *
 * Copyright 2016 Aljon D. Familara.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package alcchi;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 *
 * @author Aljon D. Familara
 */
public class MainApp extends Application {
    //main window
    private Stage mainStage;
    //main layout
    private BorderPane rootLayout;
    
    //override default application start method
    @Override
    public void start(Stage mainStage){
        this.mainStage = mainStage;
        this.mainStage.setTitle("OIC - Offline References for Programming Languages");
        initRootLayout();
        showWelcomeScreen();
    }
    //initialize root layout
    public void initRootLayout(){
        try {
            //load
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("oic/ref/view/RootLayout.fxml"));
            //set root and scene
            rootLayout = (BorderPane) loader.load();
            Scene scene = new Scene(rootLayout);
            mainStage.setScene(scene);
            //show scene
            mainStage.show();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showWelcomeScreen(){
        try {
            // load design
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("oic/ref/view/WelcomeScreen.fxml"));
            // set welcome screen
            AnchorPane welcome = (AnchorPane) loader.load();
            rootLayout.setCenter(welcome);
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }
    // return overridden main stage
    public Stage getPrimaryStage(){
        return mainStage;
    }
    //start app
    public static void main(String[] args) {
        launch(args);
    }
    //Alj...
    //insert comments below
	//gandako
	//okkkaaayyyy
        //Umasa
}
