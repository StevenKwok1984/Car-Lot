package src.main.java.dao;

import src.main.java.dto.Car;
import src.main.java.dto.CarKey;

import java.io.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CarLotDAOImpl implements CarLotDAO{

    private Map<String, Car> cars = new HashMap<>();


    @Override
    public Car addCar(String VIN, Car car);

    public Car getCar(String VIN);
    public List<Car> getCars();

    public void editCar(String VIN, Car car);

    public Car removeCar(String VIN);

    /*
      Load and Write Lib session
     */
    /*
    private void loadLib() throws DvdLibraryDaoException {
        Scanner sc;

        try {
            // Create scanner
            sc = new Scanner(
                    new BufferedReader(new FileReader(LIBRARY_FILE)));
        } catch (FileNotFoundException e) {
            throw new DvdLibraryDaoException("-_- Could not load roster data into memory.", e);
        }

        String currentLine;
        Car currentCar;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentCar = unmarshallDvd(currentLine);

            cars.put(currentCar.getVIN(), currentCar);
        }

        sc.close();
    }

    private void writeLib() throws  DvdLibraryDaoException {
        // We are translating the IOException to an application specific exception
        //and then simple throwing it i.e. reporting it to the code that called us.

        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(LIBRARY_FILE));
        } catch (IOException e) {
            throw new DvdLibraryDaoException("Could not save DVD data",e);
        }
        String dvdAsText;
        List <Car> carList = this.getAllCars;
        for (Dvd currentDvd : dvdList) {
            //turn a DVD into a string
            dvdAsText = marshallDvd(currentDvd);
            //write the DVD object to to the file;
            out.println(dvdAsText);
            //force PrintWriter to write line to the file
            out.flush();
        }
        //Clean up
        out.close();

    }


    private String marshallDvd(Car aCar) {
        String carAsText = aCar.getVIN() + DELIMITER;
        carAsText += aCar.getMake() + DELIMITER;
        carAsText += aCar.getModel() + DELIMITER;
        carAsText += aCar.getColor() + DELIMITER;
        carAsText += aCar.getPrice() + DELIMITER;
        carAsText += aCar.getOdometerMiles() + DELIMITER;
        carAsText += aCar.getKey();

        return carAsText;
    }

    private Car unmarshallDvd(String carAsText) {
        String[] carTokens = carAsText.split(DELIMITER);

        String VIN = carTokens[0];
        String make = carTokens[1];
        String model = carTokens[2];
        String color = carTokens[3];
        String priceString = carTokens[4];
        String odometerMilesString = carTokens[5];
        String CarKeyString = carTokens[6];

        Car carFromFile = new Car(VIN);

        carFromFile.setMake(make);
        carFromFile.setModel(model);
        carFromFile.setColor(color);
        carFromFile.setPrice(new BigDecimal(priceString));
        carFromFile.setOdometerMiles(Long.parseLong(odometerMilesString));
        carFromFile.setKey(new CarKey(CarKeyString));

        // return the file for saving
        return carFromFile;
    }
    */
}
