package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

@Entity
@Table(name = "errortransit")
public class ErrorTransit {

    @Id
    @Column(name = "errortransit_id", nullable = false)
    @Size(max = 10)
    private Integer errorTransitId;

    @Column(name = "errortransittype_id", nullable = false)
    @Size(max = 10)
    private Integer errorTransitTypeId;

    @Column(name = "error_id", nullable = false)
    @Size(max = 10)
    private Integer errorId;

    @Column(name = "worker_id", nullable = false)
    @Size(max = 10)
    private Integer workerId;

    @Column(name = "errortransit_date", nullable = false)
    @Size(max = 19)
    private Timestamp errorTransitDate;

    @Column(name = "errortransit_text", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] ErrorTransitText;

    @Column(name = "errortransit_plan", nullable = true, columnDefinition = "DOUBLE PRECISION")
    @Size(max = 53)
    private Double ErrorTransitPlan;

    @Column(name = "errortransit_fact", nullable = true, columnDefinition = "DOUBLE PRECISION")
    @Size(max = 53)
    private Double ErrorTransitFact;

    @Column(name = "errortransit_dateneed", nullable = true)
    @Size(max = 19)
    private Timestamp ErrorTransitDateNeed;

    @Column(name = "fromworker_id", nullable = false)
    @Size(max = 10)
    private Integer fromWorkerId;

    @Column(name = "transitplan_flag", nullable = false)
    @Size(max = 10)
    private Integer transitPlanFlag;

    public Integer getErrorTransitId() {
        return errorTransitId;
    }

    public void setErrorTransitId(Integer errorTransitId) {
        this.errorTransitId = errorTransitId;
    }

    public Integer getErrorTransitTypeId() {
        return errorTransitTypeId;
    }

    public void setErrorTransitTypeId(Integer errorTransitTypeId) {
        this.errorTransitTypeId = errorTransitTypeId;
    }

    public Integer getErrorId() {
        return errorId;
    }

    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Timestamp getErrorTransitDate() {
        return errorTransitDate;
    }

    public void setErrorTransitDate(Timestamp errorTransitDate) {
        this.errorTransitDate = errorTransitDate;
    }

    public byte[] getErrorTransitText() {
        return ErrorTransitText;
    }

    public void setErrorTransitText(byte[] errorTransitText) {
        ErrorTransitText = errorTransitText;
    }

    public Double getErrorTransitPlan() {
        return ErrorTransitPlan;
    }

    public void setErrorTransitPlan(Double errorTransitPlan) {
        ErrorTransitPlan = errorTransitPlan;
    }

    public Double getErrorTransitFact() {
        return ErrorTransitFact;
    }

    public void setErrorTransitFact(Double errorTransitFact) {
        ErrorTransitFact = errorTransitFact;
    }

    public Timestamp getErrorTransitDateNeed() {
        return ErrorTransitDateNeed;
    }

    public void setErrorTransitDateNeed(Timestamp errorTransitDateNeed) {
        ErrorTransitDateNeed = errorTransitDateNeed;
    }

    public Integer getFromWorkerId() {
        return fromWorkerId;
    }

    public void setFromWorkerId(Integer fromWorkerId) {
        this.fromWorkerId = fromWorkerId;
    }

    public Integer getTransitPlanFlag() {
        return transitPlanFlag;
    }

    public void setTransitPlanFlag(Integer transitPlanFlag) {
        this.transitPlanFlag = transitPlanFlag;
    }

    public ErrorTransit() {

    }

    public ErrorTransit(Integer errorTransitId,
                        Integer errorTransitTypeId,
                        Integer errorId,
                        Integer workerId,
                        Timestamp errorTransitDate,
                        //  byte[] errorTransitText,
                        Double errorTransitPlan,
                        Double errorTransitFact,
                        Timestamp errorTransitDateNeed,
                        Integer fromWorkerId,
                        Integer transitPlanFlag) {
        this.errorTransitId = errorTransitId;
        this.errorTransitTypeId = errorTransitTypeId;
        this.errorId = errorId;
        this.workerId = workerId;
        this.errorTransitDate = errorTransitDate;
        //  ErrorTransitText = errorTransitText;
        ErrorTransitPlan = errorTransitPlan;
        ErrorTransitFact = errorTransitFact;
        ErrorTransitDateNeed = errorTransitDateNeed;
        this.fromWorkerId = fromWorkerId;
        this.transitPlanFlag = transitPlanFlag;
    }
}
