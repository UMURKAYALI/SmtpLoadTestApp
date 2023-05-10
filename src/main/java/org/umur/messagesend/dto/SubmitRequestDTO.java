package org.umur.messagesend.dto;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SubmitRequestDTO {

    private MessageDTO message;
    private String username;
    private String password;

    public SubmitRequestDTO() {
    }

    public SubmitRequestDTO(MessageDTO message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the message
     */
    public MessageDTO getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(MessageDTO message) {
        this.message = message;
    }

}
