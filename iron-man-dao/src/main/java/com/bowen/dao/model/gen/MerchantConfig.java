package com.bowen.dao.model.gen;

import java.io.Serializable;
import java.util.Date;

public class MerchantConfig implements Serializable {
    private Long id;

    private Long merchantId;

    private String confKey;

    private String confValue;

    private String confDes;

    private String comment;

    private String createdby;

    private Date createdTime;

    private String updatedby;

    private Date updatedTime;

    private Boolean isActive;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getConfKey() {
        return confKey;
    }

    public void setConfKey(String confKey) {
        this.confKey = confKey == null ? null : confKey.trim();
    }

    public String getConfValue() {
        return confValue;
    }

    public void setConfValue(String confValue) {
        this.confValue = confValue == null ? null : confValue.trim();
    }

    public String getConfDes() {
        return confDes;
    }

    public void setConfDes(String confDes) {
        this.confDes = confDes == null ? null : confDes.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby == null ? null : updatedby.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MerchantConfig other = (MerchantConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getConfKey() == null ? other.getConfKey() == null : this.getConfKey().equals(other.getConfKey()))
            && (this.getConfValue() == null ? other.getConfValue() == null : this.getConfValue().equals(other.getConfValue()))
            && (this.getConfDes() == null ? other.getConfDes() == null : this.getConfDes().equals(other.getConfDes()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getCreatedby() == null ? other.getCreatedby() == null : this.getCreatedby().equals(other.getCreatedby()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedby() == null ? other.getUpdatedby() == null : this.getUpdatedby().equals(other.getUpdatedby()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()))
            && (this.getIsActive() == null ? other.getIsActive() == null : this.getIsActive().equals(other.getIsActive()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getConfKey() == null) ? 0 : getConfKey().hashCode());
        result = prime * result + ((getConfValue() == null) ? 0 : getConfValue().hashCode());
        result = prime * result + ((getConfDes() == null) ? 0 : getConfDes().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getCreatedby() == null) ? 0 : getCreatedby().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdatedby() == null) ? 0 : getUpdatedby().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        result = prime * result + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", confKey=").append(confKey);
        sb.append(", confValue=").append(confValue);
        sb.append(", confDes=").append(confDes);
        sb.append(", comment=").append(comment);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedby=").append(updatedby);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", isActive=").append(isActive);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}