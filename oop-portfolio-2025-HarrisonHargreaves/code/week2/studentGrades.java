package code.week2;

public class studentGrades {
    public static void main(String[] args) {

        String borderTop = "///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\";
        String borderBottom = "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////";
        String header = "==          Student Points          ==";
        String columns = "Name\t\tLab\t\tBonus\t\tTotal";
        String separator = "----\t\t---\t\t-----\t\t-----";

        System.out.println(borderTop + "\n" + borderBottom + "\n" + header + "\n" + columns + "\n" + separator);
        System.out.println("Jess\t\t47\t\t4\t\t\t"+(47+4));
        System.out.println("Dave\t\t32\t\t9\t\t\t"+(32+9));
        System.out.println("Billy\t\t43\t\t2\t\t\t"+(43+2));
        System.out.println("Samuel\t\t39\t\t8\t\t\t"+(39+8));
        System.out.println("Lucas\t\t50\t\t10\t\t\t"+(50+10));

    }
}