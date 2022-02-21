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
        System.out.println(+real+"+("+imaginary+")i");
    }

    complexno add(complexno a, complexno b){
         complexno ad = new complexno();
         ad.real = a.real + b.real;
         ad.imaginary = a.imaginary + b.imaginary;
         return (ad);
    }

    public static void main(String[] args){
        complexno obj = new complexno(); //invoking null construtor

        complexno obj1= new complexno(5,6); //invoking parametric construtor
        
        complexno obj2 = new complexno(3,4);

        complexno obj3 = new complexno(obj2); //invoking copy constructor

        complexno obj4 = new complexno();
        obj4 = obj4.add(obj1, obj2);
        obj4.display();
        
    }
}


