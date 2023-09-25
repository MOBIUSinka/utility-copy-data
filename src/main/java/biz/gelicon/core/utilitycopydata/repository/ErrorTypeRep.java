package biz.gelicon.core.utilitycopydata.repository;


import biz.gelicon.core.utilitycopydata.model.ErrorType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorTypeRep extends JpaRepository<ErrorType, Long> {
    boolean existsByerrortypeId(Integer errortypeId);

}
