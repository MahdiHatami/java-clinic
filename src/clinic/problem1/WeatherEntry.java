package clinic.problem1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherEntry
{
    private Date when;
    private Float pressure;
    private Float humidity;

    public WeatherEntry()
    {

    }

    public Date getWhen()
    {
        return when;
    }

    public void setWhen(Date when)
    {
        this.when = when;
    }

    public Float getPressure()
    {
        return pressure;
    }

    public void setPressure(Float pressure)
    {
        this.pressure = pressure;
    }

    public Float getHumidity()
    {
        return humidity;
    }

    public void setHumidity(Float humidity)
    {
        this.humidity = humidity;
    }


    //fields to be used from input files

    public String toString()
    {
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        return ("Data for: " + format.format(when)
                + " Barometric Pressure: " + pressure
                + " Humidity: " + humidity);
    }
}
