package biz.gelicon.core.utilitycopydata.mainrepository;

import biz.gelicon.core.utilitycopydata.mainmodel.MainErrorComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainErrorCommentRepository extends JpaRepository<MainErrorComment, Long> {

    boolean existsByErrorCommentId(Integer errorCommentId);
}
