package com.valevich.kursach.model.request.client;

import com.valevich.kursach.model.request.Validatable;
import lombok.Data;

@Data
public class AddClientPayload extends ClientPayload implements Validatable {

    private String employeeToken;

    @Override
    public boolean isValid() {
        return employeeToken != null && !employeeToken.isEmpty()
                && getEmail() != null && !getEmail().isEmpty()
                && getEmail() != null && !getPassword().isEmpty();
    }
}
