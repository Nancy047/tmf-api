package com.example.tmf666.Entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
    @Data
    @Table(name = "api_product")
    public class ApiProduct {
        @Id
        private String id;
        private String type;

    }

