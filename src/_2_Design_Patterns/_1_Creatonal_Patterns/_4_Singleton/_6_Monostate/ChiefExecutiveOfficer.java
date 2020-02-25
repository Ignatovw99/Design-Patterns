package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._6_Monostate;

/**
 * This is the Monostate design pattern
 *
 * You can create many instances of this class, but the values of its fields will be always the same. The instances share the same data storage
 *
 * This design pattern is not he best approach, because it is a little confusing.
 * Is is a good idea for sharing date storage between many instances of the class, but it does not show you if the class is singleton
 */
public class ChiefExecutiveOfficer {

    private static String name;

    private static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        ChiefExecutiveOfficer.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        ChiefExecutiveOfficer.age = age;
    }

    @Override
    public String toString() {
        return "ChiefExecutiveOfficer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
