package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder;

public class HtmlBuilderDemo {

    public static void main(String[] args) {
        HtmlBuilder htmlBuilder = new HtmlBuilder("ul");
        htmlBuilder
                .addChild("li", "hello")
                .addChild("li", "world");

        System.out.println(htmlBuilder);
    }
}
