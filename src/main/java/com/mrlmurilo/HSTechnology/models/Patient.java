package com.mrlmurilo.HSTechnology.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "pacientes")
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Paciente_ID")
    private Long id;

    @Column(name = "Nome")
    private String name;

    @Column(name = "Sexo")
    private String sex;

    public Patient() {
    }

    public Patient(Long id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Object[] getPatientData() {
        return new Object[]{
            this.id,
            this.name,
            this.sex,};
    }

    @Override
    public String toString() {
        return this.name;
    }
}
