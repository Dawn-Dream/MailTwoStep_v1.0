package com.dawndream.MailTwoStep.Config;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {
    private static final List<String> RESTRICTS = new ArrayList<>();

    public static void addPlayerName(String playerNameIn) {
        String convertedName = playerNameIn.toLowerCase();
        if (!RESTRICTS.contains(convertedName)) {
            RESTRICTS.add(convertedName);
        }
    }

    public static void removePlayerName(String playerNameIn) {
        String convertedName = playerNameIn.toLowerCase();
        RESTRICTS.remove(convertedName);
    }

    public static boolean hasPlayerName(String playerNameIn) {
        String convertedName = playerNameIn.toLowerCase();
        return RESTRICTS.contains(convertedName);
    }
}

