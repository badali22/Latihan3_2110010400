package geometri;

public class Lingkaran {
    double radius;
    
    public Lingkaran (double radius ){
        this.radius = radius;
    }

    Lingkaran(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double luas(){
        return Math.PI * radius * radius;
    }
    
    public double keliling(){
        return 2 * Math.PI * radius;
    }
    
}
