package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.Error;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErrorRepository extends JpaRepository<Error, Long> {

    boolean existsByErrorId(Integer errorId);

    List<Error> findAllByErrorIdBetween(Integer fromId, Integer toId);
}
