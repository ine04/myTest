import java.util.ArrayList;
import java.util.List;

public class QLNL {
    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
        System.out.println("Thêm nhân lực thành công: " + person);
    }

    public Person searchByName(String hoTen) {
        for (Person person : persons) {
            if (person.getHoTen().equalsIgnoreCase(hoTen)) {
                return person;
            }
        }
        return null;  
    }

    public void displayPersons() {
        if (persons.isEmpty()) {
            System.out.println("Không có nhân lực nào trong danh sách");
            return;
        }
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
