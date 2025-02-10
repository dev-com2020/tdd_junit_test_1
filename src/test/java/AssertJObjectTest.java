import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJObjectTest {

    static class Person {
        String name;
        int age;

        Person(String name,int age){
            this.name = name;
            this.age = age;
        }
    }

    @Test
    void testPerson(){
        Person person = new Person("Alicja", 30);
        assertThat(person)
                .hasFieldOrPropertyWithValue("name","Alicja");
    }
}
