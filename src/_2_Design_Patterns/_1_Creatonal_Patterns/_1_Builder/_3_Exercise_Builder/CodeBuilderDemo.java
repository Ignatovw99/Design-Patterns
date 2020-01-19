package _2_Design_Patterns._1_Creatonal_Patterns._1_Builder._3_Exercise_Builder;

public class CodeBuilderDemo {

    public static void main(String[] args) {
        CodeBuilder codeBuilder = new CodeBuilder("Person")
                .addField("firstName", "String")
                .addField("lastName", "String")
                .addField("age", "Integer");

        System.out.println(codeBuilder);
    }
}
