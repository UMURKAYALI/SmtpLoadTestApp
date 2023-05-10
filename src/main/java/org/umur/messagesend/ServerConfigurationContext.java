package org.umur.messagesend;

import org.umur.messagesend.configuration.ServerConfiguration;

public class ServerConfigurationContext {

    private static ServerConfiguration serverConfiguration;

    public static void setConfiguration(ServerConfiguration serverConfiguration) {
        ServerConfigurationContext.serverConfiguration = serverConfiguration;
    }

    public static ServerConfiguration getServerConfiguration() {
        return serverConfiguration;
    }

}