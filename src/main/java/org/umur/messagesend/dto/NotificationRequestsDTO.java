package org.umur.messagesend.dto;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NotificationRequestsDTO {

    private byte deliveryNotificationRequest;
    private byte receiptNotificationRequest;
    private boolean replyRequest;

    /**
     * @return the deliveryNotificationRequest
     */
    public byte getDeliveryNotificationRequest() {
        return deliveryNotificationRequest;
    }

    /**
     * @param deliveryNotificationRequest the deliveryNotificationRequest to set
     */
    public void setDeliveryNotificationRequest(byte deliveryNotificationRequest) {
        this.deliveryNotificationRequest = deliveryNotificationRequest;
    }

    /**
     * @return the receiptNotificationRequest
     */
    public byte getReceiptNotificationRequest() {
        return receiptNotificationRequest;
    }

    /**
     * @param receiptNotificationRequest the receiptNotificationRequest to set
     */
    public void setReceiptNotificationRequest(byte receiptNotificationRequest) {
        this.receiptNotificationRequest = receiptNotificationRequest;
    }

    /**
     * @return the replyRequest
     */
    public boolean isReplyRequest() {
        return replyRequest;
    }

    /**
     * @param replyRequest the replyRequest to set
     */
    public void setReplyRequest(boolean replyRequest) {
        this.replyRequest = replyRequest;
    }

}
