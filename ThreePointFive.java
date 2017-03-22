import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
/**
 * Name: Jack Brashier
 * Date: 03/20/2017
 * Purpose: To demonstrate understanding of ComboBoxes in Java.
 */
public class ThreePointFive extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("User Role");
		primaryStage.setWidth(400);
		ObservableList<String> roles = FXCollections.observableArrayList("Administrator", "Faculty", "Staff", "Student", "Guest");
		ComboBox roleChoice = new ComboBox(roles);
		Label label = new Label("Please select your User Role:");
		FlowPane pane = new FlowPane();	
		roleChoice.setOnAction(e->label.setText("Welcome " + roleChoice.getValue() + "!"));
		pane.getChildren().add(label);
		pane.getChildren().add(roleChoice);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
