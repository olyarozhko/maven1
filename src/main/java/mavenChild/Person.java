package mavenChild;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    public void whoAmI() {
        System.out.printf("\nMy name is - %s. I am - %d", name, age);
    }
}
