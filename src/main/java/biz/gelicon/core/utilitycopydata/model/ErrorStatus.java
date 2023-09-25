package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "errorstatus")
public class ErrorStatus {

    @Id
    @Column(name = "error_id", nullable = false)
    @Size(max = 10)
    private Integer errorId;

    @Column(name = "errortransit_id", nullable = false)
    @Size(max = 10)
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

    public ErrorStatus() {

    }

    public ErrorStatus(Integer errorId,
                       Integer errorTransitId) {
        this.errorId = errorId;
        this.errorTransitId = errorTransitId;
    }
}
