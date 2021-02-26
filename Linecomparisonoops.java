public class Linecomparisonoops {


   public  Double points(double x1, double x2, double y1, double y2) {


    Double length = Math.floor(Math.sqrt((x2-y1)*(x2-y1)) + ((y2-y1)*(y2-y1)));

   return length;
}

    public static void main(String[] args) {

   Linecomparisonoops line = new Linecomparisonoops();

  double x1= Math.floor(Math.random() * 10);
  double x2= Math.floor(Math.random() * 10);
  double y1= Math.floor(Math.random() * 10);
  double y2= Math.floor(Math.random() * 10);

  Double length1 =  line.points(x1, x2, y1, y2);
  Double length2 =  line.points(x1, x2, y1, y2);



   System.out.println("length is =" +length1);
   System.out.println("length is =" +length2);

   System.out.println(length1.equals(length2));
   System.out.println(length1.compareTo(length2));




  }
}


