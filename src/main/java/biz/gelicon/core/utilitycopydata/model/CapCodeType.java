package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "CapCodeType")
public class CapCodeType {
    @Id
    @Size(max = 10)
    @Column(name = "CapCodeType_Id", nullable = false)
    private Integer capCodeTypeId;
    @Size(max = 10)
    @Column(name = "CapCodeType_Code", nullable = false)
    private String capCodeTypeCode;
    @Size(max = 50)
    @Column(name = "CapCodeType_Name", nullable = false)
    private String capCodeTypeName;

    @Column(name = "CapCodeType_Text", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] capCodeTypeText;

    public Integer getCapCodeTypeId() {
        return capCodeTypeId;
    }

    public void setCapCodeTypeId(Integer capCodeTypeId) {
        this.capCodeTypeId = capCodeTypeId;
    }

    public String getCapCodeTypeCode() {
        return capCodeTypeCode;
    }

    public void setCapCodeTypeCode(String capCodeTypeCode) {
        this.capCodeTypeCode = capCodeTypeCode;
    }

    public String getCapCodeTypeName() {
        return capCodeTypeName;
    }

    public void setCapCodeTypeName(String capCodeTypeName) {
        this.capCodeTypeName = capCodeTypeName;
    }

    public byte[] getCapCodeTypeText() {
        return capCodeTypeText;
    }

    public void setCapCodeTypeText(byte[] capCodeTypeText) {
        this.capCodeTypeText = capCodeTypeText;
    }

    public CapCodeType(Integer CapCodeTypeId, String CapCodeTypeCode, String CapCodeTypeName, byte[] CapCodeTypeText) {
        this.capCodeTypeId = CapCodeTypeId;
        this.capCodeTypeCode = CapCodeTypeCode;
        this.capCodeTypeName = CapCodeTypeName;
        this.capCodeTypeText = CapCodeTypeText;
    }

    public CapCodeType() {
    }
}
