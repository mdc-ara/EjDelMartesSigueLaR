
package es.medac.ejdelmartessiguelar;

/**
 *
 * @author asier.ruiz
 */
public class EjDelMartesSigueLaR {

    public static void main(String[] args) {
        char[] a_c = {'A','B','C','D','E'};
        method_a(a_c);
    }

    private static void method_a(char[] a_c) {
        for(int s=1;s<=a_c.length;s++){
            System.out.println("S "+s+":");
            method_b(a_c,new char[s],0,0);
        }
    }

    private static void method_b(char[] a_c, char[] com, int st, int de) {
        if(de==com.length){
            System.out.println(new String(com));
            return;
        }
        for(int i=st;i<a_c.length;i++){
            com[de]=a_c[i];
            method_b(a_c,com,i+1,de+1);
        }
    }
}
