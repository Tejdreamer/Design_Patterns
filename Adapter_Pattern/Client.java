public class Client{
    public static void main(String args[]){
        
        Adaptee tempadaptee = new Adaptee();
        AdapterInt CelciusAdapter = new Adapter1(tempadaptee);
        float temp = (float) tempadaptee.getTemperatureInFahrenheit();
        System.out.println("Temp in celsius "+ CelciusAdapter.getTemperatureInCelsius());
    }
}