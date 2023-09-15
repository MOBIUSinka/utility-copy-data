package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainCapCodeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainCapCodeTypeRepository extends JpaRepository<MainCapCodeType, Long> {
    boolean existsById(Integer id);
}
