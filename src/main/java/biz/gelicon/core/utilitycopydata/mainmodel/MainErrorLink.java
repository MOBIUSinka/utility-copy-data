package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "errorlink")
public class MainErrorLink {

    @Id
    @Column(name = "errorlink_id", nullable = false)
    private Integer errorLinkId;

    @Column(name = "errormain_id", nullable = false)
    private Integer errorMainId;

    @Column(name = "error_id", nullable = false)
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

    public MainErrorLink() {

    }

    public MainErrorLink(Integer errorLinkId, Integer errorMainId, Integer errorId) {
        this.errorLinkId = errorLinkId;
        this.errorMainId = errorMainId;
        this.errorId = errorId;
    }
}
