package lolstats.util;

/**
 * Utility to format strings.
 * @author Devin
 */
import lolstats.Loop;

public class Formatting extends Loop {

    public String stripHTML(final String str) {
        System.out.println("Removing html from data.");
        if (str != null && !str.isEmpty()) {
            return str.replaceAll("(^[^<]+>|<[^>]+>|<[^>]+$)", "");
        }
        return "";
    }

    public String stripTabs(String str) {
        System.out.println("Removing tabs from data.");
        if (str != null && !str.isEmpty()) {
            return str.replaceAll("\t", "");
        }
        return "";
    }

    public String getpID() {
        String a;
        int b;
        a = webReader.rawData.replace("[{\"id\":\"", "");
        b = a.indexOf("\"");
        a = a.substring(0, b);
        return a;
    }

}
