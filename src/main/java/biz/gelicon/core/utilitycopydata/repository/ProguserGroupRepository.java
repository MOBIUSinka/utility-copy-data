package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.Department;
import biz.gelicon.core.utilitycopydata.model.ProguserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProguserGroupRepository extends JpaRepository<ProguserGroup, Long> {
    boolean existsById(Integer id);
}
