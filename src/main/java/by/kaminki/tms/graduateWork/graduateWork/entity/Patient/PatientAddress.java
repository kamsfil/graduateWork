package by.kaminki.tms.graduateWork.graduateWork.entity.Patient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "PatientAddress")
public class PatientAddress {

    @Id
    @Column(name = "id_patient_address")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPatientAddress;

    @Column(name = "city")
    private String city;

    @Column(name = "area")
    private String area;

    @Column(name = "street")
    private String street;

    @Column(name = "house")
    private String house;

    @Column(name = "entrance")
    private String entrance;

    @Column(name = "apartment")
    private String apartment;

    public PatientAddress() {
    }
}
