public class AirPurifier{
    String model = null;
    String serialNo = null;
    boolean power = false;
    int pm25level = 0;
    String mode = "DEFAULT";
    int filterHoursUsed = 0;
    int fanSpeed = 2;

    AirPurifier(String model, String serialNo) {
        this.model = model;
        this.serialNo = serialNo;
        totalCreated++;
    }

    void turnOn(){power = true;}
    void turnOff(){power = false;}
    int getPm25level(){return pm25level;}
    void changeMode(String getMode){
        String modeTraned = getMode.toUpperCase();
        switch (modeTraned) {
            case "DEFAULT" -> {
                mode = "DEFAULT";
                fanSpeed = 2;
            }
            case "TURBO" -> {
                mode = "TURBO";
                fanSpeed = 4;
            }
            case "SLEEP" -> {
                mode = "SLEEP";
                fanSpeed = 1;
            }
            case "AUTO" -> {
                mode = "AUTO";
                adjustFanSpeed();
            }
            default -> IO.println("Invalid mode");

        }
    }
    void updatePmLevel(int newData){
        pm25level = newData;
        if("AUTO".equals(mode)){
            adjustFanSpeed();
        }
    }
    void adjustFanSpeed(){
        if (pm25level <= 50)       fanSpeed = 1;
        else if (pm25level <= 75)  fanSpeed = 2;
        else if (pm25level <= 100) fanSpeed = 3;
        else                       fanSpeed = 4;

    }
    void filterUsage(){
        switch (mode) {
            case "DEFAULT" -> filterHoursUsed = filterHoursUsed + 2;
            case "SLEEP" -> filterHoursUsed = filterHoursUsed + 1;
            case "TURBO" -> filterHoursUsed = filterHoursUsed + 4;
            case null, default -> filterHoursUsed = filterHoursUsed + 3;
        }
    }
    int getFanSpeed(){
        return fanSpeed;
    }

    static int totalCreated;
    static int getTotalCreated(){
        return totalCreated;
    }
}
