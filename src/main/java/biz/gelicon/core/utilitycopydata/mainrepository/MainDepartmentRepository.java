package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainDepartmentRepository extends JpaRepository<MainDepartment, Long> {

    boolean existsByDepartmentId(Integer departmentId);
}
