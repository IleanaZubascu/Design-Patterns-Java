package builder;//builder se foloseste pentru obiectele care pot produce diferite obiecte
//folosind acelasi proces de constructie pas cu pas

public class Main {
    public static void main(String[] args) {
        Pizza pizza=new PizzaBuilder().setDough("Thin Crust")
                                      .setSauce("Tomato")
                                      .setTopping("Pepperoni")
                                      .build();
        System.out.println(pizza);
    }
}