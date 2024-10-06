package ocomplex;

public class OComplex {
    private double real;  
    private double imaginary;  

    public OComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public OComplex add(OComplex z) {
        return new OComplex(this.real + z.real, this.imaginary + z.imaginary);
    }

    public OComplex multiply(OComplex z) {
        double newReal = (this.real * z.real) - (this.imaginary * z.imaginary);
        double newImaginary = (this.real * z.imaginary) + (this.imaginary * z.real);
        return new OComplex(newReal, newImaginary);
    }

    public String toString() {
        if (imaginary > 0) {
            return real != 0 ? 
            		real + " + " + imaginary + "i"
            		: 
            		imaginary + "i";
        } else if(imaginary < 0) {
            return real != 0 ? 
            		real + " + " + imaginary + "i"
            		: 
            		imaginary + "i";
        }else {
        	return real != 0 ? 
            		real + "" 
            		: 
            		"0";
        }
    }

    public static void main(String[] args) {
        OComplex z1 = new OComplex(1, 0); 
        OComplex z2 = new OComplex(0, 0); 
        System.out.println("z1 + z2 = " + z1.add(z2));
        System.out.println("z1 * z2 = " + z1.multiply(z2));
    }
}