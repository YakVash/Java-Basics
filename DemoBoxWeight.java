//This program uses inheritance to extend Box.
class Box {
    double width;
    double height;
    double depth;

    //construct clone of an object
    Box(Box ob) {//Pass object to constructor
       width = ob.width;
       height = ob.height;
       depth = ob.depth;


    }

    //Constructors used when all dimensions are specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    //Constructors when dimensions not specified
    Box() {
        width = -1;//use -1 to indicate
        height = -1;//uninitailized
        depth = -1;//box
    }

    //Constructor when cube is created
    Box(double len) {
        width = height = depth = len;
    }
    
    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}

//Here, Box is extended to include weight
class BoxWeight extends Box {
    double weight; //Weight of box

    //Constructor fir BoxWeight
    BoxWeight (double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String[] args){
        BoxWeight mybox1 = new BoxWeight(10, 20, 24, 34.5);
        BoxWeight mybox2 = new BoxWeight(2, 3,4 , 0.054);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is "+ mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " +vol);
        System.out.println("Weight of mybox2 is "+ mybox2.weight);

    }
}