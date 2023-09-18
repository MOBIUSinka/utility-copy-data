package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "CapCode")
public class CapCode {
    @Id
    @Size(max = 10)
    @Column(name = "CapCode_Id", nullable = false)
    private Integer capCodeId;
    @Size(max = 10)
    @Column(name = "CapCodeType_Id", nullable = false)
    private Integer capCodeTypeId;
    @Size(max = 10)
    @Column(name = "CapCode_Code", nullable = false)
    private String capCodeCode;

    @Size(max = 50)
    @Column(name = "CapCode_Name", nullable = false)
    private String capCodeName;

    @Size(max = 10)
    @Column(name = "CapCode_SortCode", nullable = true)
    private String capCodeSortCode;

    @Column(name = "CapCode_Text", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] capCodeText;

    public Integer getCapCodeId() {
        return capCodeId;
    }

    public void setCapCodeId(Integer capCodeId) {
        this.capCodeId = capCodeId;
    }

    public Integer getCapCodeTypeId() {
        return capCodeTypeId;
    }

    public void setCapCodeTypeId(Integer capCodeTypeId) {
        this.capCodeTypeId = capCodeTypeId;
    }

    public String getCapCodeCode() {
        return capCodeCode;
    }

    public void setCapCodeCode(String capCodeCode) { this.capCodeCode = capCodeCode;
    }

    public String getCapCodeName() {
        return capCodeName;
    }

    public void setCapCodeName(String capCodeName) {
        this.capCodeName = capCodeName;
    }

    public String getCapCodeSortCode() {
        return capCodeSortCode;
    }

    public void setCapCodeSortCode(String capCodeSortCode) {
        this.capCodeSortCode = capCodeSortCode;
    }

    public byte[] getCapCodeText() {
        return capCodeText;
    }

    public void setCapCodeText(byte[] capCodeText) {
        this.capCodeText = capCodeText;
    }

    public CapCode() {

    }

    public CapCode(Integer capCodeId, Integer capCodeTypeId, String capCodeCode, String capCodeName, String capCodeSortCode, byte[] capCodeText) {
        this.capCodeId = capCodeId;
        this.capCodeTypeId = capCodeTypeId;
        this.capCodeCode = capCodeCode;
        this.capCodeName = capCodeName;
        this.capCodeSortCode = capCodeSortCode;
        this.capCodeText = capCodeText;
    }

}
