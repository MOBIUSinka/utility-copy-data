package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.Error;
import biz.gelicon.core.utilitycopydata.model.ErrorComment;
import biz.gelicon.core.utilitycopydata.model.ErrorStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErrorStatusRepository extends JpaRepository<ErrorStatus, Long> {

    ErrorStatus findTopByOrderByErrorTransitIdDesc();

    List<ErrorStatus> findAllByErrorTransitIdBetween(Integer fromId, Integer toId);

}
