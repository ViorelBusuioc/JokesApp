package dev.lpa.jokesapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 300);
        stage.setTitle("JokeApp");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }

    public static String generateJoke() {

        URL url;
        try {
            url = new URL("https://official-joke-api.appspot.com/random_joke");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        String json;
        try {
            json = IOUtils.toString(url, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JSONObject object = new JSONObject(new JSONTokener(json));
        String setup = object.getString("setup");
        String punchline = object.getString("punchline");
        return setup + "\n\n" + punchline;
    }

    public static String generateGeneralJoke() {

        URL url;
        try {
            url = new URL("https://official-joke-api.appspot.com/jokes/general/random");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        String json;
        try {
            json = IOUtils.toString(url, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String modifiedJson = json.substring(1, json.length() - 1);
        JSONObject object = new JSONObject(new JSONTokener(modifiedJson));
        String setup = object.getString("setup");
        String punchline = object.getString("punchline");
        return setup + "\n\n" + punchline;
    }

    public static String generateProgrammingJoke() {

        URL url;
        try {
            url = new URL("https://official-joke-api.appspot.com/jokes/programming/random");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        String json;
        try {
            json = IOUtils.toString(url, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String modifiedJson = json.substring(1, json.length() - 1);
        JSONObject object = new JSONObject(new JSONTokener(modifiedJson));
        String setup = object.getString("setup");
        String punchline = object.getString("punchline");
        return setup + "\n\n" + punchline;
    }

    public static String generateDadJoke() {

        URL url;
        try {
            url = new URL("https://official-joke-api.appspot.com/jokes/dad/random");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        String json;
        try {
            json = IOUtils.toString(url, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String modifiedJson = json.substring(1, json.length() - 1);
        JSONObject object = new JSONObject(new JSONTokener(modifiedJson));
        String setup = object.getString("setup");
        String punchline = object.getString("punchline");
        return setup + "\n\n" + punchline;
    }

    public static String generateKnockJoke() {

        URL url;
        try {
            url = new URL("https://official-joke-api.appspot.com/jokes/knock-knock/random");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        String json;
        try {
            json = IOUtils.toString(url, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String modifiedJson = json.substring(1, json.length() - 1);
        JSONObject object = new JSONObject(new JSONTokener(modifiedJson));
        String setup = object.getString("setup");
        String punchline = object.getString("punchline");
        return setup + "\n\n" + punchline;
    }
}
