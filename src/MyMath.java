public class MyMath {

    class lingkaran{
        public  static Double menghitungLuasLingkaranJariJAri(double r){

            return 3.14 * ( r * r );
        }

        public static Double menghitungLuasLingkaranDiameter(double d){

            return 0.25 * 3.14 * (d * d);
        }

        public  static Double menghitungKelilingingkaranJariJAri(double r){

            return 2 * 3.14 * r;
        }

        public static Double menghitungKelilingLingkaranDiameter(double d){

            return d * 3.14;
        }

    }

    class persegi{
        public static  Double menghitungLuasPersegi(double s){

            return  s*s;
        }

        public static  Double menghitungLuasPersegi(double p, double l){

            return  p*l;
        }



    }

    class segitiga{
        public static Double menghitungLuasSegitiga(double a, double t){

            return a*t / 2;
        }

        public static double menghiungKelilingSegitiga(double a, double b, double c){

            return a+b+c;
        }
    }



}
