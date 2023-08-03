package com.mrlmurilo.HSTechnology.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "exames")
@Entity
public class Exames {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_exame;

    @Column(name = "DataHoraExame")
    private LocalDateTime dataHoraExame;

    @Column(name = "TipoExame")
    private String tipoExame;

    @Column(name = "Observacoes")
    private String observacoes;

    @Column(name = "ComentarioImpressao")
    private String comentario;

    @OneToOne
    private Patient id_patient;

    public Exames() {
    }

    public Exames(LocalDateTime dateHoraExame, String tipoExame, String observacoes, String comentario, Patient id_patient) {
        this.id_patient = id_patient;
        this.dataHoraExame = dataHoraExame;
        this.tipoExame = tipoExame;
        this.observacoes = observacoes;
        this.comentario = comentario;

    }

    public Object[] getPatientData() {
        return new Object[]{
            this.id_patient,
            this.dataHoraExame,
            this.tipoExame,
            this.observacoes,
            this.comentario
        };
    }
}
