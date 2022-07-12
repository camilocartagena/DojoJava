public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre Incremento
        int i = 1;
        System.out.println("Inicial de i = " + i);
        int  j = ++i; // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Incremento
        i=2;
        System.out.println("Inicial de i = " + i);
        j=i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre Decremento
        i=3;
        System.out.println("Inicial de i = " + i);
        j= --i; // i = i - 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Decremento
        i=4;
        System.out.println("Inicial de i = " + i);
        j=i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++)); // El valor final es de 6

        System.out.println("j = " + j);
    }
}
