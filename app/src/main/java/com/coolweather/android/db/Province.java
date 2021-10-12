package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;
import org.litepal.exceptions.DataSupportException;

/**
 * <p>描述: <p>
 *
 * @author chenzi
 * @CreateDate 2021/10/12 21:08
 * @description:使用 LitePalSupport 代替DataSupport
 * @update [序号][日期YYYY-MM-DD][更改人姓名][变更描述]
 */
public class Province extends LitePalSupport {

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
