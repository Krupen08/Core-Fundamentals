package MapBasics;

import java.util.HashMap;
import java.util.Map;

public class putIFAbsentBasic
{
    static void main(String[] args)
    {
        Map<String,String> appConfig = new HashMap<String,String>();

        // Pre-populate one setting
        appConfig.put("Theme", "DARK");

        // Use putIfAbsent to apply default configurations safely
        // "theme" already exists, so "LIGHT" is ignored
        appConfig.putIfAbsent("Theme", "LIGHT");

        // "timeout" does not exist, so it gets added
        appConfig.putIfAbsent("Timeout", "3000");

        System.out.println("Final Config = " + appConfig);  //Final Config = {Timeout=3000, Theme=DARK}

    }
}
