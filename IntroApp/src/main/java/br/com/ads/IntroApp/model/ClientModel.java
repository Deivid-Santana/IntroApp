package br.com.ads.IntroApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity //Informa que é uma entidade
@Table(name = "clients")
@Data //Cria gets e sets automaticamente
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 1)
    private String gender;

    @Column(nullable = false, length = 50)
    private String city;
}

// novos atributos na v2