package cn.zxy.drinkmachine.product;

/**
 * @author Silence 000996
 * @data 17/7/6
 */
public enum DrinkTypeEnum {
    PESSI("peesi", "百事可乐"), NONGFUSHANQUAN("nfsq", "农夫山泉");

    private String code;
    private String desc;

    DrinkTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
