package by.kaminki.tms.graduateWork.graduateWork.repositories;

import by.kaminki.tms.graduateWork.graduateWork.entity.admin.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
