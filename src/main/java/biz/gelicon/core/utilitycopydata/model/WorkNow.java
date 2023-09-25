package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

@Entity
@Table(name = "worknow")
public class WorkNow {

    @Id
    @Column(name = "worknow_id", nullable = false)
    @Size(max = 10)
    private Integer workNowId;

    @Column(name = "worker_id", nullable = false)
    @Size(max = 10)
    private Integer workerId;

    @Column(name = "error_id", nullable = false)
    @Size(max = 10)
    private Integer errorId;

    @Column(name = "worknow_datebeg", nullable = false)
    @Size(max = 19)
    private Timestamp workNowDateBeg;

    @Column(name = "worknow_dateend", nullable = true)
    @Size(max = 19)
    private Timestamp workNowDateEnd;

    public Integer getWorkNowId() {
        return workNowId;
    }

    public void setWorkNowId(Integer workNowId) {
        this.workNowId = workNowId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getErrorId() {
        return errorId;
    }

    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }

    public Timestamp getWorkNowDateBeg() {
        return workNowDateBeg;
    }

    public void setWorkNowDateBeg(Timestamp workNowDateBeg) {
        this.workNowDateBeg = workNowDateBeg;
    }

    public Timestamp getWorkNowDateEnd() {
        return workNowDateEnd;
    }

    public void setWorkNowDateEnd(Timestamp workNowDateEnd) {
        this.workNowDateEnd = workNowDateEnd;
    }

    public WorkNow() {

    }

    public WorkNow(Integer workNowId, Integer workerId, Integer errorId, Timestamp workNowDateBeg, Timestamp workNowDateEnd) {
        this.workNowId = workNowId;
        this.workerId = workerId;
        this.errorId = errorId;
        this.workNowDateBeg = workNowDateBeg;
        this.workNowDateEnd = workNowDateEnd;
    }
}
