public class TestProgrammers {
    public static void main(String[] args){
        //Primo Programmer object + valori variabili
        Programmer programmer1 = new Programmer();
        programmer1.name = "Carmy";
        programmer1.age = 30;
        programmer1.wearsGlasses = false;

        //Secondo programmer object + valori variabili
        Programmer programmer2 = new Programmer();
        programmer2.name = "Lula";
        programmer2.age = 25;
        programmer2.wearsGlasses = true;

        //Call methods
        programmer1.drinkCoffee();
        programmer1.printDetails();
        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}
