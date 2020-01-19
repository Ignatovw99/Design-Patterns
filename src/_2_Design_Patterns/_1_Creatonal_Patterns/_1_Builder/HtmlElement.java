package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HtmlElement {

    private String name;

    private String text;

    private List<HtmlElement> innerElements;

    private final Integer indentSize = 2;

    private final String newLine = System.lineSeparator();

    public HtmlElement() {
        innerElements = new ArrayList<>();
    }

    public HtmlElement(String name, String text) {
        this();
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean addInnerElement(HtmlElement element) {
        return innerElements.add(element);
    }

    private String toStringImpl(int indent) {
        StringBuilder stringBuilder = new StringBuilder();
        String indentSpace = String.join("", Collections.nCopies(indent * indentSize, " "));
        stringBuilder.append(String.format("%s<%s>%s", indentSpace, name, newLine));
        if (text != null && !text.isEmpty()) {
            stringBuilder
                    .append(String.join("", Collections.nCopies(indentSize * (indent + 1), " ")))
                    .append(text)
                    .append(newLine);
        }

        for (HtmlElement element : innerElements) {
            stringBuilder.append(element.toStringImpl(indent + 1));
        }

        stringBuilder.append(String.format("%s<%s>%s", indentSpace, name, newLine));
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}
