package cn.zxy.state.state;

/**
 * @author Silence 000996
 * @data 17/6/29
 */
public interface State  {
    /**
     * 投入25分钱
     */
    void insertQuarter();

    /**
     * 退回25分钱
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
