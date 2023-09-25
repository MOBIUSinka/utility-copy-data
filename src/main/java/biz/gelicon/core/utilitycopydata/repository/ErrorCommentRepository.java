package biz.gelicon.core.utilitycopydata.repository;

import biz.gelicon.core.utilitycopydata.model.ErrorComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorCommentRepository extends JpaRepository<ErrorComment, Long> {

    boolean existsByErrorCommentId(Integer errorCommentId);
}
