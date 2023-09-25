package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "errorstatus")
public class MainErrorStatus {

    @Id
    @Column(name = "error_id", nullable = false)
    private Integer errorId;

    @Column(name = "errortransit_id", nullable = false)
    private Integer errorTransitId;

    public Integer getErrorId() {
        return errorId;
    }

    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }

    public Integer getErrorTransitId() {
        return errorTransitId;
    }

    public void setErrorTransitId(Integer errorTransitId) {
        this.errorTransitId = errorTransitId;
    }

    public MainErrorStatus() {

    }

    public MainErrorStatus(Integer errorId,
                           Integer errorTransitId) {
        this.errorId = errorId;
        this.errorTransitId = errorTransitId;
    }
}
