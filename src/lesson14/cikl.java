package lesson14;

public class cikl {
    static void cikl(){
        for (int chas = 0; chas <6 ; chas++) {
            for (int minuta = 0; minuta <60 ; minuta++) {
                if (chas>1 && minuta%10==0) {
                    break;
                }
                    for (int sekunda = 0; sekunda < 60; sekunda++) {
                        if (sekunda*chas>minuta){
                            break;
                        }
                        System.out.println(chas + ":" + minuta + ":" + sekunda);
                    }

            }
        }
    }

    public static void main(String[] args) {
        cikl();
    }
}
