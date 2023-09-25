package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "errorcomment")
public class MainErrorComment {

    @Id
    @Column(name = "errorcomment_id", nullable = false)
    private Integer errorCommentId;

    @Column(name = "error_id", nullable = false)
    private Integer errorId;

    @Column(name = "parenterrorcomment_id", nullable = false)
    private Integer parentErrorCommentId;

    @Column(name = "author_id", nullable = false)
    private Integer authorId;

    @Column(name = "addressee_id", nullable = true)
    private Integer addresseeId;

    @Column(name = "errorcomment_date", nullable = false)
    private Date errorCommentDate;

    @Column(name = "errorcomment_text", nullable = true)
    private String errorCommentText;

    @Column(name = "errorcomment_needanswer", nullable = false)
    private Integer errorCommentNeedAnswer;

    public Integer getErrorCommentId() {
        return errorCommentId;
    }

    public void setErrorCommentId(Integer errorCommentId) {
        this.errorCommentId = errorCommentId;
    }

    public Integer getErrorId() {
        return errorId;
    }

    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }

    public Integer getParentErrorCommentId() {
        return parentErrorCommentId;
    }

    public void setParentErrorCommentId(Integer parentErrorCommentId) {
        this.parentErrorCommentId = parentErrorCommentId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getAddresseeId() {
        return addresseeId;
    }

    public void setAddresseeId(Integer addresseeId) {
        this.addresseeId = addresseeId;
    }

    public Date getErrorCommentDate() {
        return errorCommentDate;
    }

    public void setErrorCommentDate(Date errorCommentDate) {
        this.errorCommentDate = errorCommentDate;
    }

    public String getErrorCommentText() {
        return errorCommentText;
    }

    public void setErrorCommentText(String errorCommentText) {
        this.errorCommentText = errorCommentText;
    }

    public Integer getErrorCommentNeedAnswer() {
        return errorCommentNeedAnswer;
    }

    public void setErrorCommentNeedAnswer(Integer errorCommentNeedAnswer) {
        this.errorCommentNeedAnswer = errorCommentNeedAnswer;
    }

    public MainErrorComment() {

    }

    public MainErrorComment(Integer errorCommentId,
                            Integer errorId,
                            Integer parentErrorCommentId,
                            Integer authorId,
                            Integer addresseeId,
                            Date errorCommentDate,
                            String errorCommentText,
                            Integer errorCommentNeedAnswer) {
        this.errorCommentId = errorCommentId;
        this.errorId = errorId;
        this.parentErrorCommentId = parentErrorCommentId;
        this.authorId = authorId;
        this.addresseeId = addresseeId;
        this.errorCommentDate = errorCommentDate;
        this.errorCommentText = errorCommentText;
        this.errorCommentNeedAnswer = errorCommentNeedAnswer;
    }
}
