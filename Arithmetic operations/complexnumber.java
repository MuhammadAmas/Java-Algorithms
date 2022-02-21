public class complexnumber {
	int real, imaginary;
    public complexnumber(){ } //Default constructor
    public complexnumber (int r, int i){ //Constructor with parameters
        this.real = r;
        this.imaginary = i;
    }
    public complexnumber(complexnumber a){ //copy constructor
        real = a.real;
        imaginary = a.imaginary;
    }
    public void display()
    {
        System.out.println(+real+"+"+imaginary+"i");
    }
    complexnumber addition(complexnumber a){ //addition of two complex numbers
         complexnumber ad = new complexnumber();
         ad.real = this.real + a.real;
         ad.imaginary = this.imaginary + a.imaginary;
         return (ad);
    }
    complexnumber subtract(complexnumber a){ //subtraction of two numbers
        complexnumber ad = new complexnumber();
        ad.real = this.real - a.real;
        ad.imaginary = this.imaginary - a.imaginary;
        return (ad);
   }
   complexnumber multiply(complexnumber a){ //multiplication of two numbers
    complexnumber ad = new complexnumber();
    ad.real = this.real * a.real;
    ad.imaginary = this.imaginary * a.imaginary;
    return (ad);
}
    public static void main(String[] args){
        complexnumber obj = new complexnumber(); //invoking null construtor
        complexnumber obj1= new complexnumber(5,6); //invoking parametric construtor
        complexnumber obj2 = new complexnumber(3,4);
        complexnumber obj3 = new complexnumber(obj2); //invoking copy constructor
        complexnumber obj4 = new complexnumber();

        obj4 = obj1.addition(obj2); //invoking addition method
        obj4.display(); //displaying result

        obj4 = obj1.subtract(obj2); // invoking subtraction method
        obj4.display(); //displaying result

        obj4 = obj1.multiply(obj2); // invoking multiplication method
        obj4.display(); //displaying result
    }
}