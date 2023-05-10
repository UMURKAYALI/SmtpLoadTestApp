package org.umur.messagesend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@XmlRootElement
public class MessageHeaderDTO implements Serializable {

    private static final long serialVersionUID = 4177218232470665480L;

    private String name;
    private Object type;
    private List<String> values = new ArrayList<>();

    public MessageHeaderDTO() {
    }

    public MessageHeaderDTO(String name, Object type, List<String> values) {
        this.name = name;
        this.type = type;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public void addValue(String value) {
        this.values.add(value);
    }

    public void removeValue(String value) {
        this.values.remove(value);
    }

    @JsonIgnore
    public Optional<String> getFirstValue() {
        if (this.values != null && !this.values.isEmpty()) {
            return Optional.ofNullable(values.get(0));
        }
        return Optional.empty();
    }
}
