class ParkingSystem {
    int big, medium,small;
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small=small;
    }

    public boolean addCar(int carType) {
        switch(carType){
            case 1:
                if(big>0){
                    big--; return true;
                } break;
            case 2:
                if(medium>0){
                    medium--; return true;
                }break;
            case 3:
                if(small>0){
                    small--; return true;
                }break;
        }
        return false;
    }
}
class lc1603{
    public static void main(String[] args) {
        ParkingSystem p=new ParkingSystem(1,1,0);
        System.out.println(p.addCar(1)+" "+p.addCar(2)+" "+p.addCar(3)+" "+p.addCar(1));
    }
}
