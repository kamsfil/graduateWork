package by.kaminki.tms.graduateWork.graduateWork.entity.Patient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "PatientDetails")
public class PatientDetails {

    @Id
    @Column(name = "id_patient_details")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPatientDetails;

    @Column(name = "email")
    private String email;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @OneToOne
    @Column(name = "patientAddress")
    private PatientAddress patientAddress;

    @Column(name = "birthDate")
    private LocalDate birthDate;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private int age;

    public PatientDetails() {
    }
}
