package org.umur.messagesend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.umur.messagesend.configuration.ServerConfiguration;

@Component
public class StartUpRunner implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(StartUpRunner.class);

    @Autowired
    private ServerConfiguration serverConfiguration;


    @Override
    public void run(String... args) {
        try {
            ServerConfigurationContext.setConfiguration(serverConfiguration);
        } catch (Exception ex) {
            LOG.error("Error occured while initing the security context for TLS (encryption, signing).", ex);
        }
    }
}