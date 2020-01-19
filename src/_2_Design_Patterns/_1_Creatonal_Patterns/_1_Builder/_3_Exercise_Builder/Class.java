package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder._3_Exercise_Builder;

import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class {

    private String className;

    private List<Pair<String, String>> fields;

    private String lineSeparator = System.lineSeparator();

    private final int indentSize = 2;

    public Class(String className) {
        this.className = className;
        fields = new ArrayList<>();
    }

    public boolean addField(String name, String type) {
        return fields.add(new Pair<>(name, type));
    }

    @Override
    public String toString() {
        String classTemplate = "public class %s" + lineSeparator + "{" + lineSeparator + "%s" + "}";

        StringBuilder fieldsBuilder = new StringBuilder();
        for (Pair<String, String> field : fields) {
            String type = field.getValue1();
            String name = field.getValue0();

            fieldsBuilder.append(
                    String.join("", Collections.nCopies(indentSize, " "))
            )
                    .append("public ")
                    .append(type)
                    .append(" ")
                    .append(name)
                    .append(";")
                    .append(lineSeparator);
        }

        return String.format(classTemplate, className, fieldsBuilder);
    }
}
