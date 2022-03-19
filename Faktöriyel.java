public class Faktöriyel {

    public static void main(String[] args){
        System.out.println(faktoriyel(5));

    }

    public static int faktoriyel(int sayi){
        if(sayi==1){
            return 1;
        }

        return sayi * faktoriyel(--sayi);
    }
}
