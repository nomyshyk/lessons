public class Pension {
    public static void main(String[] args) {
        setSizeOfArray(10000, 80);
    }

    static void showMyDocument(int age){
        if(age<17){
            System.out.println("Свидетельство о рождении ");
        } else
        if(age<24){
            System.out.println("Паспорт и диплом ");
        } else
        if(age<61){
            System.out.println("Трудовая книжка ");
        } else
        {
            System.out.println("Пенсионное удостоверение ");
        }
        System.out.println(age);
    }

    static void setSizeOfArray(int quantity, int ageLimit){
        int[] ages = new int[quantity];
        for(int i = 0; i<ages.length; i ++){
            ages[i] = (int) (Math.random()*ageLimit);
            showMyDocument(ages[i]);
        }
    }
}
