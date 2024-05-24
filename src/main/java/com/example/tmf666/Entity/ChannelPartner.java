package com.example.tmf666.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "channel_partner")
public class ChannelPartner {
    @Id
    private String id;
    private String type;

}
