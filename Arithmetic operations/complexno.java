public class complexno {
	int real, imaginary;
    public complexno(){ } //Default constructor
    public complexno (int r, int i){ //Constructor with parameters
        this.real = r;
        this.imaginary = i;
    }
    public complexno(complexno a){ //copy constructor
        real = a.real;
        imaginary = a.imaginary;
    }
    public void display()
    {
        System.out.println(+real+"+"+imaginary+"i");
    }
    complexno addition(complexno a){ //addition of two complex numbers
         complexno ad = new complexno();
         ad.real = this.real + a.real;
         ad.imaginary = this.imaginary + a.imaginary;
         return (ad);
    }
    complexno subtract(complexno a){ //subtraction of two numbers
        complexno ad = new complexno();
        ad.real = this.real - a.real;
        ad.imaginary = this.imaginary - a.imaginary;
        return (ad);
   }
   complexno multiply(complexno a){ //multiplication of two numbers
    complexno ad = new complexno();
    ad.real = this.real * a.real;
    ad.imaginary = this.imaginary * a.imaginary;
    return (ad);
}
    public static void main(String[] args){
        complexno obj = new complexno(); //invoking null construtor
        complexno obj1= new complexno(5,6); //invoking parametric construtor
        complexno obj2 = new complexno(3,4);
        complexno obj3 = new complexno(obj2); //invoking copy constructor
        complexno obj4 = new complexno();

        obj4 = obj1.addition(obj2); //invoking addition method
        obj4.display(); //displaying result

        obj4 = obj1.subtract(obj2); // invoking subtraction method
        obj4.display(); //displaying result

        obj4 = obj1.multiply(obj2); // invoking multiplication method
        obj4.display(); //displaying result
    }
}