package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.ErrorTransit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErrorTransitRepository extends JpaRepository<ErrorTransit, Long> {

    boolean existsByErrorTransitId(Integer errorTransitId);

    ErrorTransit existsErrorTransitByErrorTransitId(Integer errorTransitId);

    List<ErrorTransit> findAllByErrorTransitIdBetween(Integer fromId, Integer toId);

    @Query("select new ErrorTransit(" +
            "e.errorTransitId, " +
            "e.errorTransitTypeId, " +
            "e.errorId, " +
            "e.workerId, " +
            "e.errorTransitDate, " +
          //  "e.ErrorTransitText, " +
            "e.ErrorTransitPlan, " +
            "e.ErrorTransitFact, " +
            "e.ErrorTransitDateNeed, " +
            "e.fromWorkerId, " +
            "e.transitPlanFlag) " +
            "from ErrorTransit e " +
            "where e.errorTransitId >= :fromId " +
            "and e.errorTransitId <= :toId")
    List<ErrorTransit> findAllBetweenSQL(@Param("fromId") Integer fromId, @Param("toId") Integer toId);

    @Query("select coalesce(e.ErrorTransitText, null) from ErrorTransit e where e.errorTransitId = ?1")
    byte[] findErrorTransitTextByIdSql(Integer idErrorTransit);

}
