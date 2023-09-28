package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.ErrorComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErrorCommentRepository extends JpaRepository<ErrorComment, Long> {

    boolean existsByErrorCommentId(Integer errorCommentId);

    ErrorComment findTopByOrderByErrorCommentIdDesc();

    List<ErrorComment> findAllByErrorCommentIdBetween(Integer fromId, Integer toId);
}
