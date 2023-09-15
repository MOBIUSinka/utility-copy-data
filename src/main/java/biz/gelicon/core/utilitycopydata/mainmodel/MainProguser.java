package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Table(name = "Proguser")
public class MainProguser {
    @Id
    @Column(name = "Proguser_Id", nullable = false)
    private Integer ProguserId;

    @Column(name = "Proguser_Group_Id", nullable = false)
    private Integer ProguserGroupId;

    @Column(name = "Proguser_Status_Id", nullable = false)
    private Integer ProguserStatusId;


    @Column(name = "Proguser_Type", nullable = true)
    private Integer ProguserType;

    @Size(max = 50)
    @Column(name = "Proguser_Name", nullable = false)
    private String ProguserName;

    @Size(max = 50)
    @Column(name= "Proguser_Fullname", nullable = true)
    private String ProguserFullname;

    @Size(max = 128)
    @Column(name = "Proguser_WebPassWord", nullable = true)
    private String ProguserWebPassWord;

    @Size(max = 50)
    @Column(name = "Proguser_TimeZoneCode", nullable = true)
    private String ProguserTimeZoneCode;

    public MainProguser() {

    }

    public Integer getProguserId() {
        return ProguserId;
    }

    public void setProguserId(Integer proguserId) {
        ProguserId = proguserId;
    }

    public Integer getProguserGroupId() {
        return ProguserGroupId;
    }

    public void setProguserGroupId(Integer proguserGroupId) {
        ProguserGroupId = proguserGroupId;
    }

    public Integer getProguserStatusId() {
        return ProguserStatusId;
    }

    public void setProguserStatusId(Integer proguserStatusId) {
        ProguserStatusId = proguserStatusId;
    }

    public Integer getProguserType() {
        return ProguserType;
    }

    public void setProguserType(Integer proguserType) {
        ProguserType = proguserType;
    }

    public String getProguserName() {
        return ProguserName;
    }

    public void setProguserName(String proguserName) {
        ProguserName = proguserName;
    }

    public String getProguserFullname() {
        return ProguserFullname;
    }

    public void setProguserFullname(String proguserFullname) {
        ProguserFullname = proguserFullname;
    }

    public String getProguserWebPassWord() {
        return ProguserWebPassWord;
    }

    public void setProguserWebPassWord(String proguserWebPassWord) {
        ProguserWebPassWord = proguserWebPassWord;
    }

    public String getProguserTimeZoneCode() {
        return ProguserTimeZoneCode;
    }

    public void setProguserTimeZoneCode(String proguserTimeZoneCode) {
        ProguserTimeZoneCode = proguserTimeZoneCode;
    }

    public MainProguser(Integer proguserId, Integer proguserGroupId, Integer proguserStatusId, Integer proguserType, String proguserName, String proguserFullname, String proguserWebPassWord, String proguserTimeZoneCode) {
        ProguserId = proguserId;
        ProguserGroupId = proguserGroupId;
        ProguserStatusId = proguserStatusId;
        ProguserType = proguserType;
        ProguserName = proguserName;
        ProguserFullname = proguserFullname;
        ProguserWebPassWord = proguserWebPassWord;
        ProguserTimeZoneCode = proguserTimeZoneCode;
    }
}
