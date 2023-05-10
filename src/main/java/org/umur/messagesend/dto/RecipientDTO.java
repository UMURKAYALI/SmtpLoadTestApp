package org.umur.messagesend.dto;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RecipientDTO {

    private AddressDTO address;
    private NotificationRequestsDTO notificationRequests;

    /**
     * @return the address
     */
    public AddressDTO getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    /**
     * @return the notificationRequests
     */
    public NotificationRequestsDTO getNotificationRequests() {
        return notificationRequests;
    }

    /**
     * @param notificationRequests the notificationRequests to set
     */
    public void setNotificationRequests(NotificationRequestsDTO notificationRequests) {
        this.notificationRequests = notificationRequests;
    }

}
