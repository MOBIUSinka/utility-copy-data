package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "errorlink")
public class ErrorLink {

    @Id
    @Column(name = "errorlink_id", nullable = false)
    @Size(max = 10)
    private Integer errorLinkId;

    @Column(name = "errormain_id", nullable = false)
    @Size(max = 10)
    private Integer errorMainId;

    @Column(name = "error_id", nullable = false)
    @Size(max = 10)
    private Integer errorId;

    public Integer getErrorLinkId() {
        return errorLinkId;
    }

    public void setErrorLinkId(Integer errorLinkId) {
        this.errorLinkId = errorLinkId;
    }

    public Integer getErrorMainId() {
        return errorMainId;
    }

    public void setErrorMainId(Integer errorMainId) {
        this.errorMainId = errorMainId;
    }

    public Integer getErrorId() {
        return errorId;
    }

    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }

    public ErrorLink() {

    }

    public ErrorLink(Integer errorLinkId,
                     Integer errorMainId,
                     Integer errorId) {
        this.errorLinkId = errorLinkId;
        this.errorMainId = errorMainId;
        this.errorId = errorId;
    }
}
