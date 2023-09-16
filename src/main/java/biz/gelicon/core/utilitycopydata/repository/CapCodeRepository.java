package biz.gelicon.core.utilitycopydata.repository;


import biz.gelicon.core.utilitycopydata.model.CapCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapCodeRepository extends JpaRepository<CapCode, Long> {
    boolean existsByCapCodeId(Integer CapcodeId);
}
