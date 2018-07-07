package jkeyring;

public final class KeyringConstants {
    private static String APPNAME = "jKeyring";

    public static String getAppName() {
        return APPNAME;
    }

    public static void setAppName(String appName) {
        KeyringConstants.APPNAME = appName;
    }
}
