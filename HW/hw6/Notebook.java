package HW.hw6;

// сущность ноутбук
public class Notebook {
    // 1. поля(свойства класса)
    /** поле номер по порядку */
    private int id;
    /** поле модель производителя */
    private String model;
    /** поле ОЗУ */
    private int ramType;
    /** поле Объем ЖД */
    private int ssdType;
    /** поле Операционная система */
    private String osType;
    /** поле цвет */
    private String color;
    /** поле установить антивирус */
    private boolean avInstalled;

    /**
     * 2. Конструктор - создание нового объекта с определенными значениями
     * 
     * @param id          - номер по порядку
     * @param model       - модель производителя
     * @param ramType     - ОЗУ
     * @param ssdType     - Объем ЖД
     * @param osType      - Операционная система
     * @param color       - цвет
     * @param avInstalled - установить антивирус
     * @see Notebook#Notebook()
     */
    public Notebook(int id, String model, int ramType, int ssdType, String osType, String color, boolean avInstalled) {
        this.id = id;
        this.model = model;
        this.ramType = ramType;
        this.ssdType = ssdType;
        this.osType = osType;
        this.color = color;
        this.avInstalled = avInstalled;
    }

    /**
     * 3.
     * Процедура определения номера по порядку {@link Notebook#id}
     * 
     * @param id - номер по порядку
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Процедура определения производителя {@link Notebook#model}
     * 
     * @param model - производитель
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Процедура определения производителя {@link Notebook#ramType}
     * 
     * @param ramType - ОЗУ
     */
    public void setRamType(int ramType) {
        this.ramType = ramType;
    }

    /**
     * Процедура определения производителя {@link Notebook#ssdType}
     * 
     * @param ssdType - Объем ЖД
     */
    public void setSsdType(int ssdType) {
        this.ssdType = ssdType;
    }

    /**
     * Процедура определения производителя {@link Notebook#osType}
     * 
     * @param osType - Операционная система
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * Процедура определения производителя {@link Notebook#color}
     * 
     * @param color - цвет
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Процедура определения производителя {@link Notebook#avInstalled}
     * 
     * @param avInstalled - установить антивирус
     */
    public void setAvInstalled(boolean installedAv) {
        this.avInstalled = installedAv;
    }

    /**
     * 4.
     * Функция получения значения поля {@link Notebook#id}
     * 
     * @return возвращает номер по порядку
     */
    public int getId() {
        return id;
    }

    /**
     * Функция получения значения поля {@link Notebook#model}
     * 
     * @return возвращает модель
     */
    public String getModel() {
        return model;
    }

    /**
     * Функция получения значения поля {@link Notebook#ramType}
     * 
     * @return возвращает ОЗУ
     */
    public int getRamType() {
        return ramType;
    }

    /**
     * Функция получения значения поля {@link Notebook#osType}
     * 
     * @return возвращает операционную систему
     */
    public String getOsType() {
        return osType;
    }

    /**
     * Функция получения значения поля {@link Notebook#ssdType}
     * 
     * @return возвращает объем ЖД
     */
    public int getSsdType() {
        return ssdType;
    }

    /**
     * Функция получения значения поля {@link Notebook#color}
     * 
     * @return возвращает цвет
     */
    public String getColor() {
        return color;
    }

    /**
     * 5.
     * Метод устанавливает антивирус {@link Notebook#makeAvInstalled}
     * 
     * @param avInstalled - установить антивирус
     */
    public void makeAvInstalled() {
        this.avInstalled = true;
    }

    /**
     * 6.
     * Метод отображает содержимое сущности {@link Notebook#toString}
     * 
     * @return возвращает символьную строку описывающую объект
     */
    @Override
    public String toString() {
        return " " + id + " Ноутбук: (" + model + "): " +
                ", ОЗУ " + ramType +
                ", Объем ЖД " + ssdType +
                ", Операционная система: " + osType + '\'' +
                ", Цвет: " + color +
                ", Установить антивирус: " + avInstalled;
    }

    /**
     * 7.
     * Метод производит сравнение объектов {@link Notebook#equals}
     * 
     * @return true - если содержимое эквивалентно
     */
    @Override
    public boolean equals(Object obj) {
        Notebook t = (Notebook) obj;
        return id == t.id && model == t.model;
    }

    /**
     * 8.
     * Метод для получения уникального целочисленного номера объекта
     * {@link Notebook#hashCode}
     * 
     * @return для одного и того же объекта должен возвращать одинаковые
     *         хеш-значения
     */
    @Override
    public int hashCode() {
        return id;
    }
}
