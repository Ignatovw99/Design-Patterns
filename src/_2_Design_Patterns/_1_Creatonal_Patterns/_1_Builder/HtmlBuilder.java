package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder;

public class HtmlBuilder {

    private String rootName;

    private HtmlElement root;

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root = new HtmlElement();
        root.setName(rootName);
    }

    // Returning a HtmlBuilder, allowing you to create fluent interface(method chaining)
    public HtmlBuilder addChild(String childName, String childText) {
        HtmlElement element = new HtmlElement(childName, childText);
        root.addInnerElement(element);
        return this; // It returns a reference to the particular component(instance)
    }

    public void clear() {
        root = new HtmlElement();
        root.setName(rootName);
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
