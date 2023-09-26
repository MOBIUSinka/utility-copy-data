package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "errortype")
public class MainErrorType {
    @Id
    @Column(name = "errortype_id", nullable = false)
    private Integer errortypeId;

    @Size(max = 10)
    @Column(name = "errortype_code", nullable = true)
    private String errortypeCode;
    @Size(max = 50)
    @Column(name = "errortype_name", nullable = false)
    private String errortypeName;

    public Integer getErrortypeId() {
        return errortypeId;
    }

    public void setErrortypeId(Integer errortypeId) {
        this.errortypeId = errortypeId;
    }

    public String getErrortypeCode() {
        return errortypeCode;
    }

    public void setErrortypeCode(String errortypeCode) {
        this.errortypeCode = errortypeCode;
    }

    public String getErrortypeName() {
        return errortypeName;
    }

    public void setErrortypeName(String errortypeName) {
        this.errortypeName = errortypeName;
    }

    public MainErrorType(Integer errortypeId, String errortypeCode, String errortypeName) {
        this.errortypeId = errortypeId;
        this.errortypeCode = errortypeCode;
        this.errortypeName = errortypeName;
    }

    public MainErrorType() {
    }
}
