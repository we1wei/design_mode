package cn.weiwei.observer.base;

/**
 * 观察者模式，观察者接口
 * 当主题对象的状态更新时，
 * 所有订阅的主题的都可以收到通知，并且自动更新
 *
 * 气象布告板，可以从气象站实时获取气象数据信息
 */
public interface Observer {

    /**
     * 观察者对象获得最新的气象信息
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void update(float temp, float humidity, float pressure);

}
