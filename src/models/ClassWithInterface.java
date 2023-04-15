package models;

public class ClassWithInterface implements InterfaceModel {

    private String name;


    @Override
    public void saySomething() {

    }

    @Override
    public void solveTheProblem(String name) {
        this.name = name;
    }

    public String returnName() {
        return this.name;
    }
}
