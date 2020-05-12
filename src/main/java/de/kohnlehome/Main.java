package de.kohnlehome;

public class Main {
    public static void main(String[] args) {
        TemperaturModel temperaturModel = new TemperaturModel();
        CelsiusView celsiusView = new CelsiusView(temperaturModel);
        KelvinView kelvinView = new KelvinView(temperaturModel);

        temperaturModel.temperaturAendern();

        temperaturModel.detach(celsiusView);

        temperaturModel.temperaturAendern();
        temperaturModel.temperaturAendern();
    }
}
