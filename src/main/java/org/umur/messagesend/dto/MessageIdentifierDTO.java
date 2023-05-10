package org.umur.messagesend.dto;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageIdentifierDTO {

    /**
     * Identifies this message uniquely. MessagingAdapter implementations are responsible for filling this field.
     */
    private long id;

    /**
     * Identifier to be used for relation purposes. This id is used to relate a report (delivery or receipt) with a
     * message.
     */
    private String relationId;

    /** Name of the folder that this message belongs to. */
    private String folderPath;

    /** Transfer identifier of message. */
    private String transferId;

    public MessageIdentifierDTO() {
    }

    public MessageIdentifierDTO(long id, String relationId, String folderPath, String transferId) {
        this.id = id;
        this.relationId = relationId;
        this.folderPath = folderPath;
        this.transferId = transferId;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the relationId
     */
    public String getRelationId() {
        return relationId;
    }

    /**
     * @param relationId the relationId to set
     */
    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    /**
     * @return the folderPath
     */
    public String getFolderPath() {
        return folderPath;
    }

    /**
     * @param folderPath the folderPath to set
     */
    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    /**
     * @return the transferId
     */
    public String getTransferId() {
        return transferId;
    }

    /**
     * @param transferId the transferId to set
     */
    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

}
