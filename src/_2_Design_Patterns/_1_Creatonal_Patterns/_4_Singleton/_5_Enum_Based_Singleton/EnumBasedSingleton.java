package _2_Design_Patterns._1_Creatonal_Patterns._4_Singleton._5_Enum_Based_Singleton;

/**
 * By default the enum is serializable, but only the name of values will be serialized
 *
 * When we deserialize an enum and the value in not stored in a the serialized format, the enum is created with invoke of the constructor,
 * otherwise it is created with setting the value of the serialized enum
 *
 * So the two problems with enum based singleton are serialization and deserialization problems and inheritance, because the enum can not
 * be inherited
 */
public enum EnumBasedSingleton {

    INSTANCE;

    private int value;

    // The constructor of an enum is always private
    EnumBasedSingleton() {
        value = 32;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
