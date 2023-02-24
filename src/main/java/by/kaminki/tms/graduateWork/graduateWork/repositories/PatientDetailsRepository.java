package by.kaminki.tms.graduateWork.graduateWork.repositories;

import by.kaminki.tms.graduateWork.graduateWork.entity.Patient.PatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDetailsRepository extends JpaRepository<PatientDetails, Integer> {
}
