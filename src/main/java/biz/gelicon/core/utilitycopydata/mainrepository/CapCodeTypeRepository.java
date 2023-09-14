package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.CapCodeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapCodeTypeRepository extends JpaRepository<CapCodeType, Long> {
    @Override
    boolean existsById(Long id);
}
