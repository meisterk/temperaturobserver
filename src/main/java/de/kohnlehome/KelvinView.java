package de.kohnlehome;

public class KelvinView implements Observer{
    private TemperaturModel temperaturModel;

    public KelvinView(TemperaturModel temperaturModel) {
        this.temperaturModel = temperaturModel;
        this.temperaturModel.attach(this);
    }

    @Override
    public void update() {
        double temperatur = temperaturModel.getTemperaturInKelvin();
        String text = String.format("Temperatur: %.1fK", temperatur);
        System.out.println(text);
    }
}