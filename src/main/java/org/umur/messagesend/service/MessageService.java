package org.umur.messagesend.service;

import jakarta.mail.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.umur.messagesend.configuration.ServerConfiguration;
import org.umur.messagesend.operation.MessageSendOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MessageService {

    @Autowired
    private ServerConfiguration serverConfiguration;

    /* Session for SMTP connection. */
    private Session session;

    /** Slf4j Logger. */
    private static final Logger LOG = LoggerFactory.getLogger(MessageService.class);

    public void sendMessage(String username, String password,String from, String to) {

        // Creating send operation object.
        MessageSendOperation sendOperation = new MessageSendOperation(
                serverConfiguration.getHost(),
                String.valueOf(serverConfiguration.getSmtpPort()),
                username,
                password);

        // Creating session via send operation object.
        sendOperation.createSession();

        // Calling send message operation.
        sendOperation.sendMessage(from, to);
    }
}