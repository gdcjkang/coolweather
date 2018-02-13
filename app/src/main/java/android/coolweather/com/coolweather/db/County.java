package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/2/14.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weathetId;
    private  int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeathetId(){
        return weathetId;
    }
    public void setWeathetId(String weathetId){
        this.weathetId=weathetId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
