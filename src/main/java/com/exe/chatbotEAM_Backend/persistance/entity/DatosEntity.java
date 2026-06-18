package com.exe.chatbotEAM_Backend.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="datos")
public class DatosEntity {

    @Id
    @UuidGenerator
    private String idDatos;

    private String name;

    private String areaCode;

    private String cellPhone;

    private String province;

    private String chooseOption;

    @CreationTimestamp
    private LocalDateTime dateCreated;

    @UpdateTimestamp
    private LocalDateTime dateUpdated;
}
