package HW.hw6;

// сущность ноутбук
public class Notebook {
    // 1. поля(свойства класса)
    /** поле номер по порядку */
    private int id;
    /** поле модель производителя */
    private String modelType;
    /** поле ОЗУ */
    private int ramType;
    /** поле Объем ЖД */
    private int ssdType;
    /** поле Операционная система */
    private String osType;
    /** поле цвет */
    private String colorType;
    /** поле установить вирус */
    private boolean virusInstalled;

    /**
     * 2. Конструктор - создание нового объекта с определенными значениями
     * 
     * @param id             - номер по порядку
     * @param modelType      - модель производителя
     * @param ramType        - ОЗУ
     * @param ssdType        - Объем ЖД
     * @param osType         - Операционная система
     * @param colorType      - цвет
     * @param virusInstalled - установить вирус
     * @see Notebook#Notebook()
     */
    public Notebook(int id, String modelType, int ramType, int ssdType, String osType, String colorType,
            boolean virusInstalled) {
        this.id = id;
        this.modelType = modelType;
        this.ramType = ramType;
        this.ssdType = ssdType;
        this.osType = osType;
        this.colorType = colorType;
        this.virusInstalled = virusInstalled;
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
     * Процедура определения производителя {@link Notebook#modelType}
     * 
     * @param modelType - производитель
     */
    public void setModelType(String modelType) {
        this.modelType = modelType;
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
     * Процедура определения производителя {@link Notebook#colorType}
     * 
     * @param colorType - цвет
     */
    public void setColorType(String colorType) {
        this.colorType = colorType;
    }

    /**
     * Процедура определения производителя {@link Notebook#virusInstalled}
     * 
     * @param virusInstalled - установить антивирус
     */
    public void setVirusInstalled(boolean virusInstalled) {
        this.virusInstalled = virusInstalled;
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
     * Функция получения значения поля {@link Notebook#modelType}
     * 
     * @return возвращает модель
     */
    public String getModelType() {
        return modelType;
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
     * Функция получения значения поля {@link Notebook#colorType}
     * 
     * @return возвращает цвет
     */
    public String getColorType() {
        return colorType;
    }

    /**
     * 5.
     * Метод устанавливает антивирус {@link Notebook#makeAvInstalled}
     * 
     * @param virusInstalled - установить антивирус
     */
    public void makeVirusInstalled() {
        this.virusInstalled = true;
    }

    /**
     * 6.
     * Метод отображает содержимое сущности {@link Notebook#toString}
     * 
     * @return возвращает символьную строку описывающую объект
     */
    @Override
    public String toString() {
        return " " + id + " Ноутбук: " + modelType + ": " +
                ", ОЗУ " + ramType +
                ", Объем ЖД " + ssdType +
                ", Операционная система: " + osType + '\'' +
                ", Цвет: " + colorType +
                ", Вирусы: " + virusInstalled;
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
        return id == t.id && modelType == t.modelType;
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
