
package Decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        University course = new ISCourse(new SECourse(new ISCourse(new Student())));
        course.aggregator();
    }
    
}
