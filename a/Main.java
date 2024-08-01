package HML_projects.a;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //to use a non-static method in a static one you have to create an object of the class
        //and then use the instance method of that object
        Main obj = new Main();
        obj.not_static_method();

        People nigeria = new People();
        System.out.println(nigeria.getPopulation());
        nigeria.setPopulation(200);

    }
    public void not_static_method() {
        System.out.println("Hello World im not static");
    }
}