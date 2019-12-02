import java.util.Scanner;
public class R3Vector {

        private double x,y,z;
        public static void help(){
            System.out.println("Для сложения векторов введите 1");
            System.out.println("Для вычитания векторов введите 2");
            System.out.println("Для умножения вектора на число  введите 3");
            System.out.println("Для вычисления скалярного произведения введите 4");
            System.out.println("Для вычисления векторного произведения введите 5");
            System.out.println("Для вычисления смешанного произведения введите 6");
            System.out.println("Для изменения значений  вектора 1 введите 7");
            System.out.println("Для изменения значений  вектора 2 введите 8");
            System.out.println("Для выключения программы введите 0");
        }
        public R3Vector(double x, double y, double z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public R3Vector(){
            x = 0;
            y = 0;
            z = 0;
        }
        /*
        public static R3Vector summa(R3Vector a, R3Vector b){
            R3Vector summa = new R3Vector();
            summa.x = a.x+b.x;
            summa.y = a.y+b.y;
            summa.z = a.z+b.z;
            printvector(summa);
            return summa;
        }
        public static R3Vector raznost(R3Vector a, R3Vector b){
            R3Vector raznost = new R3Vector();
            raznost.x = a.x-b.x;
            raznost.y = a.y-b.y;
            raznost.z = a.z-b.z;
            printvector(raznost);
            return raznost;
        }
        public static R3Vector multiplication(int count, int multiplie, R3Vector a, R3Vector b){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите, какой вектор хотите умножить");
            count =  in.nextInt();
            System.out.println("Введите, на какое целое число вы хотите умножить вектор");
            multiplie =  in.nextInt();
            if(count == 1){
                R3Vector multiplication = new R3Vector();
                multiplication.x = a.x*multiplie;
                multiplication.y = a.y*multiplie;
                multiplication.z = a.z*multiplie;
                printvector(multiplication);
                return multiplication;
            }
            if(count == 2){
                R3Vector multiplication = new R3Vector();
                multiplication.x = b.x*multiplie;
                multiplication.y = b.y*multiplie;
                multiplication.z = b.z*multiplie;
                printvector(multiplication);
                return multiplication;
            }
            if(count != 1 && count !=2){
                System.out.println("Ошибка! Вектор не выбран ");
                return null;
            }
            return null;
        }
        public static void skalyarmultiplication(R3Vector a, R3Vector b){
            System.out.println("Скалярное произведение векторов равняется " + a.x*b.x+a.y*b.y+a.z*b.z);
        }
        public static R3Vector vectormultiplication(R3Vector a, R3Vector b){
            R3Vector vectormultiplication = new R3Vector();
            vectormultiplication.x = a.y*b.z-a.z*b.y;
            vectormultiplication.y = a.z*b.x-a.x*b.z;
            vectormultiplication.z = a.x*b.y-a.y*b.x;
            printvector(vectormultiplication);
            return vectormultiplication;
        }
        public static void mixedmultiplication(R3Vector a, R3Vector b, R3Vector c){
            System.out.println("Введите координаты третьего вектора");
            System.out.println("Смешанное произведегние векторов 1 и 2, а также добавочного вектора, равняется " + (c.x*(a.y*b.z-a.z*b.y)-c.y*(a.z*b.x-a.x*b.z)+c.z*(a.x*b.y-a.y*b.x)));
        }
        public static void changevectora(R3Vector a){
            Scanner in = new Scanner(System.in);
            a.x = in.nextDouble();
            a.y = in.nextDouble();
            a.z = in.nextDouble();
        }
        public static void changevectorb(R3Vector b){
            Scanner in = new Scanner(System.in);
            b.x = in.nextDouble();
            b.y = in.nextDouble();
            b.z = in.nextDouble();
        }
        */
        public static void printvector(R3Vector a){
            System.out.println("{" + a.x + ", " + a.y + ", " + a.z + "}");
        }
        public static R3Vector scale(R3Vector a,double k){
            return new R3Vector(k*a.x, k*a.y, k*a.z);
        }
        public static R3Vector translate(R3Vector a, double kx, double ky, double kz){
            R3Vector translate = new R3Vector();
            translate.x = kx*a.x;
            translate.y = kx*a.y;
            translate.z = kx*a.z;
            printvector(translate);
            return translate;
        }
        public static R3Vector rotateX(R3Vector a, double u){
            Scanner in = new Scanner(System.in);
            a.x = in.nextDouble();
        return new R3Vector(a.x, a.y, a.z);
        }
         public static R3Vector rotateY(R3Vector a, double u){
             Scanner in = new Scanner(System.in);
             a.y = in.nextDouble();
             return new R3Vector(a.x, a.y, a.z);
        }
        public static R3Vector rotateZ(R3Vector a, double u){
            Scanner in = new Scanner(System.in);
            a.z = in.nextDouble();
            return new R3Vector(a.x, a.y, a.z);
        }
        public static R3Vector rotate(R3Vector a, double ux, double uy, double uz){
            Scanner in = new Scanner(System.in);
            a.x = in.nextDouble();
            a.y = in.nextDouble();
            a.z = in.nextDouble();
            return new R3Vector(a.x, a.y, a.z);
        }

}
