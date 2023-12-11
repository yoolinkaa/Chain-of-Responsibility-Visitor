package visitor;

public class Main {
    public static void main(String[] args) {
        Group<Integer> nestedGroup = new Group<>();
        Signature<Integer> s1 = new Signature<>(System.out::println);
        nestedGroup.addTask(s1).addTask(new Signature<>(x -> System.out.println(x * x)));
        Group<Integer> group = new Group<>();
        group.addTask(nestedGroup).addTask(new Signature<>(x -> System.out.println(x * x * x)));
        group.apply(10);
        s1.getHeader("groups");
    }
}
