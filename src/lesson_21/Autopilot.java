package lesson_21;

/**
 * Author Waldemar Ilz
 * {code data} 21.11.2024
 */

public class Autopilot {
    private String softwareVersion;
    // Двунаправленная связь
    private Autobus autobus;

    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public String toString() {
        return "Autopilot: {" +
                "SV: '" + softwareVersion + '\'' +
                '}';
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}


