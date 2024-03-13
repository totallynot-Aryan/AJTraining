abstract class HillStations{
    abstract void location();
    abstract void famousFor();
}
class Manali extends HillStations{
    @Override
    public void location(){
        System.out.println("Manali is located in Himachal Pradesh");
    }
    @Override
    public void famousFor(){
        System.out.println("Manali is famous for Snow-capped-Mountains");
    }
}

class Mussoorie extends HillStations{
    @Override
    public void location(){
        System.out.println("Mussoorie is located in Uttrakhand");
    }
    @Override
    public void famousFor(){
        System.out.println("Manali is famous for mesmerizing waterfalls");
    }
}

class Gulmarg extends HillStations{
    @Override
    public void location(){
        System.out.println("Gulmarg is located in Jammu & Kashmir");
    }
    @Override
    public void famousFor(){
        System.out.println("Gulmarg is famous for Snow-capped-Mountains and Valleys");
    }
}

public class HillStationQues {
    public static void main(String[] args) {
        Manali mn = new Manali();
        mn.location();
        mn.famousFor();
        System.out.println();
        Mussoorie ms = new Mussoorie();
        ms.location();
        ms.famousFor();
        System.out.println();
        Gulmarg gm = new Gulmarg();
        gm.location();
        gm.famousFor();
    }
}