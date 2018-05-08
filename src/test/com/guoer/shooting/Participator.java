package com.guoer.shooting;

public class Participator {
    private Long id;
    private Long atvid;
    private Long empid;
    private Integer roletype;
    private String rolename;
    private Byte status;
    private String remark;
    private Long created;
    private Integer createdms;
    private Long updated;
    private Integer updatedms;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAtvid() {
        return atvid;
    }

    public void setAtvid(Long atvid) {
        this.atvid = atvid;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public Integer getRoletype() {
        return roletype;
    }

    public void setRoletype(Integer roletype) {
        this.roletype = roletype;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Integer getCreatedms() {
        return createdms;
    }

    public void setCreatedms(Integer createdms) {
        this.createdms = createdms;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Integer getUpdatedms() {
        return updatedms;
    }

    public void setUpdatedms(Integer updatedms) {
        this.updatedms = updatedms;
    }
}
