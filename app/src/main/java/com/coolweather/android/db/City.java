package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * <p>描述: <p>
 *
 * @author chenzi
 * @CreateDate 2021/10/12 21:08
 * @description:使用LitePalSupport 代替DataSupport
 * @update [序号][日期YYYY-MM-DD][更改人姓名][变更描述]
 */
public class City extends LitePalSupport {

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
