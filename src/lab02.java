public class lab02 {
    public static void main(String[] args) {
        AirPurifier f = new AirPurifier("Xiaomi Pro", "K69");

        System.out.println("=== constructor ===");
        System.out.println("model: " + f.model + " (expected Xiaomi Pro)");
        System.out.println("serialNo: " + f.serialNo + " (expected K69)");
        System.out.println("power: " + f.power + " (expected false)");
        System.out.println("mode: " + f.mode + " (expected DEFAULT)");
        System.out.println("fanSpeed: " + f.getFanSpeed() + " (expected 2)");

        System.out.println("=== turnOn / turnOff ===");
        f.turnOn();
        System.out.println("power: " + f.power + " (expected true)");
        f.turnOff();
        System.out.println("power: " + f.power + " (expected false)");

        System.out.println("=== changeMode ===");
        f.changeMode("turbo");
        System.out.println("turbo fanSpeed: " + f.getFanSpeed() + " (expected 4)");
        System.out.println("mode: " + f.mode + " (expected TURBO)");
        f.changeMode("sleep");
        System.out.println("sleep fanSpeed: " + f.getFanSpeed() + " (expected 1)");
        System.out.println("mode: " + f.mode + " (expected SLEEP)");
        f.changeMode("abc");
        System.out.println("after invalid mode, mode: " + f.mode + " (expected SLEEP)");

        System.out.println("=== AUTO mode ===");
        f.changeMode("auto");
        f.updatePmLevel(50);
        System.out.println("pm=50 fanSpeed: " + f.getFanSpeed() + " (expected 1)");
        f.updatePmLevel(51);
        System.out.println("pm=51 fanSpeed: " + f.getFanSpeed() + " (expected 2)");
        f.updatePmLevel(101);
        System.out.println("pm=101 fanSpeed: " + f.getFanSpeed() + " (expected 4)");

        System.out.println("=== filterUsage ===");
        f.filterUsage();
        System.out.println("AUTO filterHoursUsed: " + f.filterHoursUsed + " (expected 3)");

        System.out.println("=== totalCreated ===");
        AirPurifier g = new AirPurifier("Mi 4", "K70");
        System.out.println("totalCreated: " + AirPurifier.getTotalCreated() + " (expected 2)");
    }
}