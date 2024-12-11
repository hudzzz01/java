package enigma.robot;

public class Robot {
    private Integer yCordinat = 0;
    private Integer xCordinat = 0;


    public Robot(Integer xCordinat, Integer yCordinat) {
        this.yCordinat = yCordinat;
        this.xCordinat = xCordinat;
    }

    public String getCordinat(){
        return "(" + xCordinat + "," + yCordinat+")";
    }

    public void R(Robot robot){
        robot.xCordinat += 1;
    }

    public void L(Robot robot){
        robot.xCordinat -= 1;
    }

    public void F(Robot robot){
        this.yCordinat += 1;
    }

    public void B(Robot robot){
        robot.yCordinat -= 1;
    }



    @Override
    public String toString() {
        return "Area{" +
                "yCordinat=" + yCordinat +
                ", xCordinat=" + xCordinat +
                '}';
    }

    public Integer getyCordinat() {
        return yCordinat;
    }

    public void setyCordinat(Integer yCordinat) {
        this.yCordinat = yCordinat;
    }

    public Integer getxCordinat() {
        return xCordinat;
    }

    public void setxCordinat(Integer xCordinat) {
        this.xCordinat = xCordinat;
    }

}
