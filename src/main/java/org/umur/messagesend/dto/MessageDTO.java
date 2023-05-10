package org.umur.messagesend.dto;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@XmlRootElement
public class MessageDTO implements Serializable {

    private MessageIdentifierDTO identifier;

    private List<RecipientDTO> bcc;
    private List<RecipientDTO> to;
    private List<RecipientDTO> cc;

    private AddressDTO from;
    private String subject;
    private long date;

    private boolean hasAttachment;
    private boolean signed;
    private boolean encrypted;

    private List<MessageHeaderDTO> headers = new ArrayList<>();

    private Map<String, String> flags = new HashMap<>();

    private Object action;

    private int priority;

    private Object body;

    private Object type;

    public MessageDTO() {
    }

    public MessageDTO(AddressDTO from, String subject, long date, boolean hasAttachment) {
        this.from = from;
        this.subject = subject;
        this.date = date;
        this.hasAttachment = hasAttachment;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public MessageIdentifierDTO getIdentifier() {
        return identifier;
    }

    public void setIdentifier(MessageIdentifierDTO identifier) {
        this.identifier = identifier;
    }

    public List<RecipientDTO> getTo() {
        return to;
    }

    public void setTo(List<RecipientDTO> to) {
        this.to = to;
    }

    public List<RecipientDTO> getCc() {
        return cc;
    }

    public void setCc(List<RecipientDTO> cc) {
        this.cc = cc;
    }

    public List<RecipientDTO> getBcc() {
        return bcc;
    }

    public void setBcc(List<RecipientDTO> bcc) {
        this.bcc = bcc;
    }

    public AddressDTO getFrom() {
        return from;
    }

    public void setFrom(AddressDTO from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public boolean isHasAttachment() {
        return hasAttachment;
    }

    public void setHasAttachment(boolean hasAttachment) {
        this.hasAttachment = hasAttachment;
    }

    public boolean isSigned() {
        return signed;
    }

    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Map<String, String> getFlags() {
        return flags;
    }

    public void setFlags(Map<String, String> flags) {
        this.flags = flags;
    }

    public Object getAction() {
        return action;
    }

    public void setAction(Object action) {
        this.action = action;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public Object getBody() {
        return body;
    }

}