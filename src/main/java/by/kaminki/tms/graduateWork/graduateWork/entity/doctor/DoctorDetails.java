package by.kaminki.tms.graduateWork.graduateWork.entity.doctor;

import by.kaminki.tms.graduateWork.graduateWork.entity.Patient.PatientAddress;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "doctorDetails")
public class DoctorDetails {

    @Id
    @Column(name = "id_doctor_details")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPatientDetails;

    @OneToOne
    @Column(name = "doctor")
    private Doctor doctor;

    @Column(name = "email")
    private String email;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "licenseNumber")
    private String licenseNumber;

    @Column(name = "birthDate")
    private LocalDate birthDate;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private int age;

    public DoctorDetails() {
    }
}
