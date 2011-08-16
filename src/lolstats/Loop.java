package lolstats;

/**
 * Main loop of the application.
 * @author Devin
 */
import lolstats.data.PlayerInfo;
import lolstats.io.DataOperations;
import lolstats.io.WebReader;
import lolstats.util.Formatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Loop {
    public WebReader webReader;
    public Formatting f;
    public PlayerInfo pi;
    public DataOperations dops;
    public Config c;
    public String summoners = "";

    public Loop() {
        System.out.print("Search Summoner's Stats: ");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        try {
            summoners = reader.readLine();
        } catch(Exception e) {}
        webReader = new WebReader(c.idSearchURL + summoners);
        System.out.println("Debug: " + webReader.rawData);
        pi = new PlayerInfo();
        webReader = new WebReader(c.statSearchURL + pi.pID);
        dops = new DataOperations(webReader.rawData);
    }

}
