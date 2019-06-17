package cn.weiwei.observer.base;

/**
 * 观察者模式，主题接口
 * 当此接口的实现类的状态发生改变的时候，
 * 这个实现类的依赖对象都会收到通知
 */
public interface Subject {
    /**
     * 注册新的观察者对象
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 删除指定的观察者对象
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有的观察者更新状态
     */
    public void notifyObservers();
}
