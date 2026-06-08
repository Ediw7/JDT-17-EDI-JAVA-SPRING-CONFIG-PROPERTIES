package com.indivaragroup.jdt17.spring.dasar.config.ministore.part_1;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "store")
public class StoreProperties {

    private String name;
    private String city;
    private String currency;
    private Integer maxDailyOrder;
    private Boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getMaxDailyOrder() {
        return maxDailyOrder;
    }

    public void setMaxDailyOrder(Integer maxDailyOrder) {
        this.maxDailyOrder = maxDailyOrder;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}