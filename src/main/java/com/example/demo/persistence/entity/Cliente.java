package com.example.demo.persistence.entity;

import org.hibernate.annotations.Columns;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clientes")
public class Cliente {

    @Id
    private String id;

    private String nombre;

    private String apellidos;

    private Integer celular;

    private String direccion;

    @Column(name="correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

}
