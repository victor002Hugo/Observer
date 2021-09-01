public class Main {
    public static void main(String[] args) {

        ConcreteSubject s = new ConcreteSubject();

        Observer o1 = new ConcreteObserver(s,true);


        s.setState("Filme 1");
        s.setState("Filme 2");
        s.setState("Filme 3");
        s.setState("Filme 4");
    }
}
