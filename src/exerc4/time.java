
package exerc4;
public class time {
    private int hour;
    private int minute;
    time (){} ;
    void setH(int x){
        hour = x;
    }
    void setM(int x){
        minute = x;
    }
    void writetime(){
        System.out.println("The time now is " +hour+":"+minute);    
        
    }
    public static void main(String[] args) {
        time t = new time();
        t.setH(3);
        t.setM(25);
        t.writetime();
    }    
}
