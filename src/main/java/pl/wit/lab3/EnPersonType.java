package pl.wit.lab3;

public enum EnPersonType {
    student("student"),
    teacher("nauczyciel");

    private String name;
    private EnPersonType(String name) {
        this.name = name;
    }

    public String getName() {return name;}


}
