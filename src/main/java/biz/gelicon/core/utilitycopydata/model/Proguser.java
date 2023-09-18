package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Proguser")
public class Proguser {
    @Id
    @Size(max = 10)
    @Column(name = "Proguser_Id", nullable = false)
    private Integer proguserId;

    @Size(max = 10)
    @Column(name = "ProguserGroup_Id", nullable = false)
    private Integer proguserGroupId;

    @Size(max = 10)
    @Column(name = "Proguser_Status_Id", nullable = false)
    private Integer proguserStatusId;

    @Size(max = 10)
    @Column(name = "Proguser_Type", nullable = true)
    private Integer proguserType;

    @Size(max = 50)
    @Column(name = "Proguser_Name", nullable = false)
    private String proguserName;

    @Size(max = 50)
    @Column(name= "Proguser_Fullname", nullable = true)
    private String proguserFullname;

    @Size(max = 128)
    @Column(name = "Proguser_WebPassWord", nullable = true)
    private String proguserWebPassWord;

    public Integer getProguserId() {
        return proguserId;
    }

    public void setProguserId(Integer proguserId) {
        this.proguserId = proguserId;
    }

    public Integer getProguserGroupId() {
        return proguserGroupId;
    }

    public void setProguserGroupId(Integer proguserGroupId) {
        this.proguserGroupId = proguserGroupId;
    }

    public Integer getProguserStatusId() {
        return proguserStatusId;
    }

    public void setProguserStatusId(Integer proguserStatusId) {
        this.proguserStatusId = proguserStatusId;
    }

    public Integer getProguserType() {
        return proguserType;
    }

    public void setProguserType(Integer proguserType) {
        this.proguserType = proguserType;
    }

    public String getProguserName() {
        return proguserName;
    }

    public void setProguserName(String proguserName) {
        this.proguserName = proguserName;
    }

    public String getProguserFullname() {
        return proguserFullname;
    }

    public void setProguserFullname(String proguserFullname) {
        this.proguserFullname = proguserFullname;
    }

    public String getProguserWebPassWord() {
        return proguserWebPassWord;
    }

    public void setProguserWebPassWord(String proguserWebPassWord) {
        this.proguserWebPassWord = proguserWebPassWord;
    }

    public Proguser(Integer proguserId, Integer proguserGroupId, Integer proguserStatusId, Integer proguserType, String proguserName, String proguserFullname, String proguserWebPassWord) {
        this.proguserId = proguserId;
        this.proguserGroupId = proguserGroupId;
        this.proguserStatusId = proguserStatusId;
        this.proguserType = proguserType;
        this.proguserName = proguserName;
        this.proguserFullname = proguserFullname;
        this.proguserWebPassWord = proguserWebPassWord;
    }

    public Proguser() {
    }
}
