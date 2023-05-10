package org.umur.messagesend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

@XmlRootElement
public class AddressDTO {

    private static final Collator COLLATOR = Collator.getInstance(new Locale("tr", "tr"));
    public static final Comparator<AddressDTO> COMPARATOR = (AddressDTO a1, AddressDTO a2)
            -> COLLATOR.compare(a1.getDisplayName(), a2.getDisplayName());

    @JsonIgnore
    private transient String dn;
    private String cn;

    private String displayName;
    private String address;

    private Boolean frequentlyUsedUser;
    private Long frequentlyUsedUserRank;

    public AddressDTO() {
    }

    public AddressDTO(String displayName, String address) {
        this.displayName = displayName;
        this.address = address;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName the displayName to set
     *
     * @return this object
     */
    public AddressDTO setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     *
     * @return this object
     */
    public AddressDTO setAddress(String address) {
        this.address = address;
        return this;
    }

    public AddressDTO setDn(String dn) {
        this.dn = dn;
        return this;
    }

    public String getDn() {
        return dn;
    }

    public String getCn() {
        return cn;
    }

    public AddressDTO setCn(String cn) {
        this.cn = cn;
        return this;
    }

    public Boolean getFrequentlyUsedUser() {
        return frequentlyUsedUser;
    }

    public void setFrequentlyUsedUser(Boolean frequentlyUsedUser) {
        this.frequentlyUsedUser = frequentlyUsedUser;
    }

    public Long getFrequentlyUsedUserRank() {
        return frequentlyUsedUserRank;
    }

    public void setFrequentlyUsedUserRank(Long frequentlyUsedUserRank) {
        this.frequentlyUsedUserRank = frequentlyUsedUserRank;
    }

}
