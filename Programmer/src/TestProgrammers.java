public class TestProgrammers {
    public static void main(String[] args){

        Programmer programmer1 = new Programmer("Carmy",30,false);
        programmer1.drinkCoffee();
        programmer1.printDetails();

        Programmer programmer2 = new Programmer("Lula",25,true);
        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}