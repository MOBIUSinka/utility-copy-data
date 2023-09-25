package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

@Entity
@Table(name = "errorcomment")
public class ErrorComment {

    @Id
    @Column(name = "errorcomment_id", nullable = false)
    @Size(max = 10)
    private Integer errorCommentId;

    @Column(name = "error_id", nullable = false)
    @Size(max = 10)
    private Integer errorId;

    @Column(name = "parenterrorcomment_id", nullable = false)
    @Size(max = 10)
    private Integer parentErrorCommentId;

    @Column(name = "author_id", nullable = false)
    @Size(max = 10)
    private Integer authorId;

    @Column(name = "addressee_id", nullable = true)
    @Size(max = 10)
    private Integer addresseeId;

    @Column(name = "errorcomment_date", nullable = false)
    @Size(max = 19)
    private Timestamp errorCommentDate;

    @Column(name = "errorcomment_text", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] errorCommentText;

    @Column(name = "errorcomment_needanswer", nullable = false)
    @Size(max = 10)
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

    public Timestamp getErrorCommentDate() {
        return errorCommentDate;
    }

    public void setErrorCommentDate(Timestamp errorCommentDate) {
        this.errorCommentDate = errorCommentDate;
    }

    public byte[] getErrorCommentText() {
        return errorCommentText;
    }

    public void setErrorCommentText(byte[] errorCommentText) {
        this.errorCommentText = errorCommentText;
    }

    public Integer getErrorCommentNeedAnswer() {
        return errorCommentNeedAnswer;
    }

    public void setErrorCommentNeedAnswer(Integer errorCommentNeedAnswer) {
        this.errorCommentNeedAnswer = errorCommentNeedAnswer;
    }

    public ErrorComment() {

    }

    public ErrorComment(Integer errorCommentId,
                        Integer errorId,
                        Integer parentErrorCommentId,
                        Integer authorId,
                        Integer addresseeId,
                        Timestamp errorCommentDate,
                        byte[] errorCommentText,
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
