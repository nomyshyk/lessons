public class JavaFunc {
    public static void main(String[] args) {
        getComputersArray("CS");
    }

    static int[] getComputersArray(String nameOfGame){
        Computer[] computers = new Computer[20];
        int result[] = new int[20];
        for(int i = 0; i< computers.length; i+=2){
            computers[i] = new Computer("CS", i+1);
        }
        for(int i = 0; i< computers.length; i+=3){
            computers[i] = new Computer("Diablo", i+1);
        }
        for(int i = 0; i< computers.length; i+=5){
            computers[i] = new Computer("Mario", i+1);
        }

        int i = 0;
        for(Computer c : computers){
            if(c != null && c.gameName != null && c.gameName.equals(nameOfGame)){
                result[i++] = c.number;
                System.out.println(c.gameName + " " + c.number);
            }
        }

        return result;
    }

    static class Computer{
        String gameName;
        int number;

        public Computer(String gameName, int number){
            this.gameName = gameName;
            this.number = number;

        }
    }
}