package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * <p>描述: <p>
 *
 * @author chenzi
 * @CreateDate 2021/10/12 21:09
 * @description:同理替换
 * @update [序号][日期YYYY-MM-DD][更改人姓名][变更描述]
 */
public class County extends LitePalSupport {

    private int id;

    private String countryName;

    private String weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
