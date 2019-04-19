public class Programmer extends Person {
    Programmer(String name, String id, int salary) {

        super(name, id, salary);
    }
    @Override
    public void work() {
        System.out.println("code...");
    }
}
