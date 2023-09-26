package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "ErrorTransitType")
public class ErrorTransitType {
    @Id
    @Column(name = "errortransittype_id", nullable = false)
    private Integer errortransittypeId;

    @Size(max = 10)
    @Column(name = "errortransittype_code", nullable = false)
    private String errortransittypeCode;
    @Size(max = 50)
    @Column(name = "errortransittype_name", nullable = false)
    private String errortransittypeName;

    @Column(name = "errortransittype_direction", nullable = true)
    private Integer errortransittypeDirection;


    @Column(name = "towhom_id", nullable = false)
    private Integer towhomId;

    @Column(name = "witherrortransittype_id", nullable = true)
    private Integer witherrortransittypeId;

    @Column(name = "errortransittype_sendtoskv", nullable = false)
    private Integer errortransittypeSendtoskv;
    @Column(name = "errortransittype_module", nullable = false)
    private Integer errortransittypeModule;
    @Column(name = "errortransittype_result", nullable = false)
    private Integer errortransittypeResult;
    @Column(name = "errortransittype_descript", nullable = false)
    private Integer errortransittypeDescript;
    @Column(name = "errortransittype_close", nullable = false)
    private Integer errortransittypeClose;

    @Column(name = "errortransittype_notificexcl", nullable = false)
    private Integer errortransittypeNotificexcl;

    public Integer getErrortransittypeId() {
        return errortransittypeId;
    }

    public void setErrortransittypeId(Integer errortransittypeId) {
        this.errortransittypeId = errortransittypeId;
    }

    public String getErrortransittypeCode() {
        return errortransittypeCode;
    }

    public void setErrortransittypeCode(String errortransittypeCode) {
        this.errortransittypeCode = errortransittypeCode;
    }

    public String getErrortransittypeName() {
        return errortransittypeName;
    }

    public void setErrortransittypeName(String errortransittypeName) {
        this.errortransittypeName = errortransittypeName;
    }

    public Integer getErrortransittypeDirection() {
        return errortransittypeDirection;
    }

    public void setErrortransittypeDirection(Integer errortransittypeDirection) {
        this.errortransittypeDirection = errortransittypeDirection;
    }

    public Integer getTowhomId() {
        return towhomId;
    }

    public void setTowhomId(Integer towhomId) {
        this.towhomId = towhomId;
    }

    public Integer getWitherrortransittypeId() {
        return witherrortransittypeId;
    }

    public void setWitherrortransittypeId(Integer witherrortransittypeId) {
        this.witherrortransittypeId = witherrortransittypeId;
    }

    public Integer getErrortransittypeSendtoskv() {
        return errortransittypeSendtoskv;
    }

    public void setErrortransittypeSendtoskv(Integer errortransittypeSendtoskv) {
        this.errortransittypeSendtoskv = errortransittypeSendtoskv;
    }

    public Integer getErrortransittypeModule() {
        return errortransittypeModule;
    }

    public void setErrortransittypeModule(Integer errortransittypeModule) {
        this.errortransittypeModule = errortransittypeModule;
    }

    public Integer getErrortransittypeResult() {
        return errortransittypeResult;
    }

    public void setErrortransittypeResult(Integer errortransittypeResult) {
        this.errortransittypeResult = errortransittypeResult;
    }

    public Integer getErrortransittypeDescript() {
        return errortransittypeDescript;
    }

    public void setErrortransittypeDescript(Integer errortransittypeDescript) {
        this.errortransittypeDescript = errortransittypeDescript;
    }

    public Integer getErrortransittypeClose() {
        return errortransittypeClose;
    }

    public void setErrortransittypeClose(Integer errortransittypeClose) {
        this.errortransittypeClose = errortransittypeClose;
    }

    public Integer getErrortransittypeNotificexcl() {
        return errortransittypeNotificexcl;
    }

    public void setErrortransittypeNotificexcl(Integer errortransittypeNotificexcl) {
        this.errortransittypeNotificexcl = errortransittypeNotificexcl;
    }

    public ErrorTransitType(Integer errortransittypeId, String errortransittypeCode, String errortransittypeName, Integer errortransittypeDirection, Integer towhomId, Integer witherrortransittypeId, Integer errortransittypeSendtoskv, Integer errortransittypeModule, Integer errortransittypeResult, Integer errortransittypeDescript, Integer errortransittypeClose, Integer errortransittypeNotificexcl) {
        this.errortransittypeId = errortransittypeId;
        this.errortransittypeCode = errortransittypeCode;
        this.errortransittypeName = errortransittypeName;
        this.errortransittypeDirection = errortransittypeDirection;
        this.towhomId = towhomId;
        this.witherrortransittypeId = witherrortransittypeId;
        this.errortransittypeSendtoskv = errortransittypeSendtoskv;
        this.errortransittypeModule = errortransittypeModule;
        this.errortransittypeResult = errortransittypeResult;
        this.errortransittypeDescript = errortransittypeDescript;
        this.errortransittypeClose = errortransittypeClose;
        this.errortransittypeNotificexcl = errortransittypeNotificexcl;
    }

    public ErrorTransitType() {
    }
}