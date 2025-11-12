public class Adapter1 implements AdapterInt{
    Adaptee tempadaptee;

    Adapter1(Adaptee tempadaptee){
        this.tempadaptee = tempadaptee;
    }

    @Override
    public double getTemperatureInCelsius() {
        return (tempadaptee.getTemperatureInFahrenheit() - 32) * 5/9;
    }   
}