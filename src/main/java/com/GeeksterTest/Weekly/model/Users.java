package com.GeeksterTest.Weekly.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "UsersTable")

public class Users {

    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_Id")
    private Long id;

    @Column(name = "user_Tittle")
    private String title;

    @Column(name = "user_description")
    private String description;

    @Column(name = "user_Location")
    private String location;

    @Column(name = "user_Salary")
    private Double salary;

    @Column(name = "user_CompanyName")
    private String companyName;

    @Column(name = "employerName")

    private String employerName;

    private Enum jobType;
}
