package HW.hw6;

public class Notebook {
    private int id;
    private String model;
    private int ramType;
    private int ssdType;
    private String osType;
    private String color;
    private boolean avInstalled;

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRamType(int ramType) {
        this.ramType = ramType;
    }

    public void setSsdType(int ssdType) {
        this.ssdType = ssdType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAvInstalled(boolean installedAv) {
        this.avInstalled = installedAv;
    }

    @Override
    public String toString() {
        return "" + id + "Ноутбук: (" + model + "): " +
                ", ОЗУ " + ramType +
                ", Объем ЖД " + ssdType +
                ", Операционная система: " + osType + '\'' +
                ", Цвет: " + color +
                ", Установить антивирус: " + avInstalled;
    }

    @Override
    public boolean equals(Object obj) {
        Notebook t = (Notebook) obj;
        return id == t.id && model == t.model;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
