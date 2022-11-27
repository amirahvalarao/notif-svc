package com.did.notifsvc.dto;

public class EmailDto {
    private String deliveryManagerName;
    private String moduleName;
    private String pageName;
    private String description;

    public EmailDto() {
    }

    public EmailDto(String deliveryManagerName, String moduleName, String pageName, String description) {
        this.deliveryManagerName = deliveryManagerName;
        this.moduleName = moduleName;
        this.pageName = pageName;
        this.description = description;
    }

    public String getDeliveryManagerName() {
        return deliveryManagerName;
    }

    public void setDeliveryManagerName(String deliveryManagerName) {
        this.deliveryManagerName = deliveryManagerName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
