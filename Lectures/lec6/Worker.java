package Lectures.lec6;

// Сущность
public class Worker {
    // наполняем сущность
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        // переопределение метода для отображения информации а не хешкода
        return String.format("id:%d fn:%s ln:%s s:%d", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object o) {
        // проверка на равенство, сравнивание полей
        Worker t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        // в качестве хеша используем идентификатор
        return id;
    }
}
