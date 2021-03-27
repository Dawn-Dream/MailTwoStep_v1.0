package com.dawndream.MailTwoStep.Config;

import com.dawndream.MailTwoStep.main;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigReader {
    public static FileConfiguration config = main.instance.getConfig();

    public static boolean isPlayerRegistered(String playerName) {
        return (boolean) config.get(playerName.toLowerCase() + "_mod");
    }
    // 查询是否开启

    public static void addPlayer(String playerName, String mail) {
        main.instance.getConfig().set(playerName.toLowerCase() + "_mail", mail);
        main.instance.getConfig().set(playerName.toLowerCase() + "_mod", true);
        main.instance.saveConfig();
    }
    // 注册玩家二步验证信息

    public static void truePlyaer(String playerName) {
        main.instance.getConfig().set(playerName.toLowerCase() + "_mod", true);
        main.instance.saveConfig();
    }
    // 设置开启模式

    public static void falsePlyaer(String playerName) {
        main.instance.getConfig().set(playerName.toLowerCase() + "_mod", false);
        main.instance.saveConfig();
    }
    // 设置关闭模式

    public static String getMailInfo(String mod) {
        if (mod.equalsIgnoreCase("smtp")) {
            return main.instance.getConfig().getString("mail_smtp");
        } else if (mod.equalsIgnoreCase("sender")) {
            return main.instance.getConfig().getString("mail_sender");
        } else if (mod.equalsIgnoreCase("password")) {
            return main.instance.getConfig().getString("mail_password");
        }
        return null;
    }

    public static boolean ifModTrue(String playerName) {
        if (main.instance.getConfig().getBoolean(playerName + "_mod")) {
            return true;
        }
        return false;
    }

    public static String getPlayerEmil(String playerName) {
        return main.instance.getConfig().getString(playerName + "_mail");
    }
}

