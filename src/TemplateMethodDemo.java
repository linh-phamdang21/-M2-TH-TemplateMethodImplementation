public class TemplateMethodDemo {
    public static void main(String[] args) {

        Meal meal1 = new HambugerMeal();
        meal1.doMeal();

        System.out.println();

        Meal meal2 = new TacoMeal();
        meal2.doMeal();

    }
}
