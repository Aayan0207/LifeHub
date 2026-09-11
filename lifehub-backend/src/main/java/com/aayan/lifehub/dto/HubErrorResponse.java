package com.aayan.lifehub.dto;

import java.util.Map;

public class HubErrorResponse {
    private final Map<String, String> errors;

    public HubErrorResponse(Map<String, String> errors) {
        this.errors = errors;
    }

    public Map<String, String> getErrors() {
        return errors;
    }
}
