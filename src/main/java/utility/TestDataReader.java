package utility;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;

public class TestDataReader {
    private static final String TESTDATA_FILE_PATH = "testData.json";

    public static String getEmail() {
        try (FileReader fileReader = new FileReader(TESTDATA_FILE_PATH)) {
            JsonObject jsonObject = JsonParser.parseReader(fileReader).getAsJsonObject();
            return jsonObject.get("emailAddress").getAsString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getPassword() {
        try (FileReader fileReader = new FileReader(TESTDATA_FILE_PATH)) {
            JsonObject jsonObject = JsonParser.parseReader(fileReader).getAsJsonObject();
            return jsonObject.get("password").getAsString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getTimerValue() {
        try (FileReader fileReader = new FileReader(TESTDATA_FILE_PATH)) {
            JsonObject jsonObject = JsonParser.parseReader(fileReader).getAsJsonObject();
            return jsonObject.get("timerValue").getAsString();
        } catch (IOException e) {
            e.printStackTrace();
            return "00:00:00";
        }
    }
}
