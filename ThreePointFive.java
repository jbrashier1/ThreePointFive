import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
		roleChoice.setOnAction(e-> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("User Role");
			alert.setHeaderText("Selected User Role:");
			switch(roles.indexOf(roleChoice.getValue())) {
				case 0:
					alert.setContentText("Welcome Administrator!");
					break;
				case 1:
					alert.setContentText("Welcome Faculty!");
					break;
				case 2:
					alert.setContentText("Welcome Staff!");
					break;
				case 3: 
					alert.setContentText("Welcome Student!");
					break;
				default:
					alert.setContentText("Welcome Guest!");
			}
			alert.showAndWait();
		});
			//label.setText("Welcome " + roleChoice.getValue() + "!"));
		pane.getChildren().add(label);
		pane.getChildren().add(roleChoice);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
