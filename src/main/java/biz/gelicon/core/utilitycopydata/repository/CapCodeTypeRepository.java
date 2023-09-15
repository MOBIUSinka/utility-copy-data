package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.CapCodeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapCodeTypeRepository extends JpaRepository<CapCodeType, Long> {
    boolean existsById(Integer id);
}
