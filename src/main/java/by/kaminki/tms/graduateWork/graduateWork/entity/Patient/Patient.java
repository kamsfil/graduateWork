package by.kaminki.tms.graduateWork.graduateWork.entity.Patient;


import by.kaminki.tms.graduateWork.graduateWork.entity.doctor.Doctor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {

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

    @ManyToOne
    @Column(name = "doctor")
    private Doctor doctor;

    @OneToOne
    @Column(name = "patientDetails")
    private PatientDetails patientDetails;

    public Patient() {
    }
}
