package cn.weiwei.observer;

import cn.weiwei.observer.base.Observer;
import cn.weiwei.observer.base.Subject;

import java.util.ArrayList;

/**
 * 气象站，可以检测温度、湿度、气压数据
 * 当气象数据发生变化时，会通知所有的气象布告板
 */
public class WeatherData implements Subject {

    /**封装所有的气象数据布告板*/
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(observer);
        }

    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当气象数据发生改变时，通知所有的观察者
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setmeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
