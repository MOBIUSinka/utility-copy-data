package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.Department;
import biz.gelicon.core.utilitycopydata.model.Proguser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProguserRepository extends JpaRepository<Proguser, Long> {
}
