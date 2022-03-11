/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enigmacamp.simplebatis.model;

import java.math.BigDecimal;

/**
 * @author edo
 */
public class Outlet {

    private String account_code;
    private String outlet_group;
    private String rom;
    private String area;
    private String description;
    private BigDecimal totalOutlet;

    public Outlet() {
    }

    public Outlet(String rom, String area, String description) {
        this.rom = rom;
        this.area = area;
        this.description = description;
    }

    /**
     * @return the account_code
     */
    public String getAccount_code() {
        return account_code;
    }

    /**
     * @param account_code the account_code to set
     */
    public void setAccount_code(String account_code) {
        this.account_code = account_code;
    }

    /**
     * @return the outlet_group
     */
    public String getOutlet_group() {
        return outlet_group;
    }

    /**
     * @param outlet_group the outlet_group to set
     */
    public void setOutlet_group(String outlet_group) {
        this.outlet_group = outlet_group;
    }

    /**
     * @return the rom
     */
    public String getRom() {
        return rom;
    }

    /**
     * @param rom the rom to set
     */
    public void setRom(String rom) {
        this.rom = rom;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the totalOutlet
     */
    public BigDecimal getTotalOutlet() {
        return totalOutlet;
    }

    /**
     * @param totalOutlet the totalOutlet to set
     */
    public void setTotalOutlet(BigDecimal totalOutlet) {
        this.totalOutlet = totalOutlet;
    }

    @Override
    public String toString() {
        return "Outlet{" +
                "account_code='" + account_code + '\'' +
                ", outlet_group='" + outlet_group + '\'' +
                ", rom='" + rom + '\'' +
                ", area='" + area + '\'' +
                ", description='" + description + '\'' +
                ", totalOutlet=" + totalOutlet +
                '}';
    }
}
