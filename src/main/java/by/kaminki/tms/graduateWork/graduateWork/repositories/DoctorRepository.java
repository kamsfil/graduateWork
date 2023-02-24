package by.kaminki.tms.graduateWork.graduateWork.repositories;

import by.kaminki.tms.graduateWork.graduateWork.entity.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
