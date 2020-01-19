package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder._3_Exercise_Builder;

public class CodeBuilder {

    private Class clazz;

    public CodeBuilder(String className) {
        clazz = new Class(className);
    }

    public CodeBuilder addField(String name, String type) {
        clazz.addField(name, type);
        return this;
    }

    @Override
    public String toString() {
        return clazz.toString();
    }
}
