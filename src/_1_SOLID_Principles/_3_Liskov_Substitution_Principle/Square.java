package _1_SOLID_Principles._3_Liskov_Substitution_Principle;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(int size) {
        super(size, size);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
