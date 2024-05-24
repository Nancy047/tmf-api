package com.example.tmf666.Entity;


import lombok.Data;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Entity
@Data
public class DigitalIdentity {
    @Id
    private String clientId;
    private String type;
    @ElementCollection
    private List<String> redirectUrl;
    private String jwksUrl;
    private String issuerUrl;
}
