package com.frgp.f1telemetry.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.frgp.f1telemetry.entity.elements.Header;

public abstract class Packet {

    private Header header;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public String toJSON() {
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(this);
        } catch (Exception e) {
            //TODO: Handle this exception
        }
        return json;
    }
}
