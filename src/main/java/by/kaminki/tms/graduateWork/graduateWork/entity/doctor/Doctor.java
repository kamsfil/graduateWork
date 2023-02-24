package by.kaminki.tms.graduateWork.graduateWork.entity.doctor;

import by.kaminki.tms.graduateWork.graduateWork.entity.Patient.Patient;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @OneToMany
    @Column(name = "patients")
    private List<Patient> patients;

    @OneToOne
    @Column(name = "doctorDetails")
    private DoctorDetails doctorDetails;

    public Doctor() {
    }
}
