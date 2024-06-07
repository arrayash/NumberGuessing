import java.util.Scanner;



public class NumberGuessing{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int [] power = {1,2,4,8,16,32,64};
        int add=0;
        int num=1; int i,j,k;
        int sum=0;
        System.out.print("CHOOSE NUMBER BETWEEN 1 TO 99:\n");

        System.out.println("done? \ny-->yes");
        String tell=sc.nextLine();

        for(k=0; k<7; k++) {
            switch (k) {
                case 0:
                    num = 1;
                    for (i = 1; i <= 5; i++) {
                        for (j = 1; j <= 10; j++) {
                            System.out.print(" " + (2 * num - 1));
                            num++;
                            if (num >= 100) {
                                break;
                            }
                        }
                        System.out.println();
                    }//System.out.println(k);

                    System.out.println("is your number in this set ?\nyes or no");
                    String one =sc.nextLine();
                    if (one.equals("yes"))
                    {
                        add = add + (1 * power[k]);
                    }
                    if (one.equals("no"))
                    {
                        add = add + (0 * power[k]);
                    }
                    break;
                case 1:
                    num = 2; //add[-1]=0;
                    //for 2+num
                    for (i = 1; i <= 5; i++) {

                        for (j = 1; j <= 10; j++) {
                            System.out.print(" " + num);
                            num++;
                            if (num % 4 == 0 || num % 8 == 0 || num % 16 == 0 || num % 32 == 0 || num % 64 == 0) {
                                num = num + 2;
                            }
                            if (num >= 100) {
                                break;
                            }
                        }
                        System.out.println();
                    }System.out.println(k);
                    System.out.println("is your number in this set ?\nyes or no");
                    String two= sc.nextLine();
                    if (two.equals("yes"))
                    {
                        add = add + (1 * power[k]);
                    }
                    if (two.equals("no"))
                    {
                        add = add + (0 * power[k]);
                    }
                    //break;
                    System.out.println(); break;
                case 2:
                    num = 4;
                    //for 4+num
                    for (i = 1; i <= 5; i++) {
                        for (j = 1; j <= 10; j++) {
                            System.out.print(" " + num);
                            num++;
                            if (num % 8 == 0 || num % 16 == 0 || num % 32 == 0 || num % 64 == 0) {
                                num = num + 4;
                            }
                            if (num >= 100) {
                                break;
                            }
                        }
                        System.out.println();
                    }//System.out.println(k);

                    System.out.println("is your number in this set ?\nyes or no");
                    String four= sc.nextLine();
                    if (four.equals("yes"))
                    {
                        add = add + (1 * power[k]);
                    }
                    if (four.equals("no"))
                    {
                        add = add + (0 * power[k]);
                    } // break;
                    System.out.println(); break;
                case 3:
                    num = 8;
                    //for 8+num
                    for (i = 1; i <= 5; i++) {
                        for (j = 1; j <= 10; j++) {
                            System.out.print(" " + num);
                            num++;
                            if (num % 16 == 0 || num % 32 == 0 || num % 64 == 0) {
                                num = num + 8;
                            }
                            if (num >= 100) {
                                break;
                            }
                        }
                        System.out.println();
                    }
                    //System.out.println(k);
                    System.out.println("is your number in this set ?\nyes or no");
                    String eth = sc.nextLine();
                    if (eth.equals("yes"))
                    {
                        add = add + (1 * power[k]);
                    }
                    if (eth.equals("no"))
                    {
                        add = add + (0 * power[k]);
                    }//break;
                    System.out.println(); break;
                case 4:
                    num = 16;
                    //for 16+num
                    for (i = 1; i <= 5; i++) {
                        for (j = 1; j <= 10; j++) {
                            System.out.print(" " + num);
                            num++;
                            if (num % 32 == 0 || num % 64 == 0) {
                                num = num + 16;
                            }
                            if (num >= 100) {
                                break;
                            }
                        }
                        System.out.println();
                    }
                    // System.out.println(k);
                    System.out.println("is your number in this set ?\nyes or no");
                    String sixtin = sc.nextLine();
                    if (sixtin.equals("yes"))
                    {
                        add = add + (1 * power[k]);
                    }
                    if (sixtin.equals("no"))
                    {
                        add = add + (0 * power[k]);
                    }//break;
                    System.out.println();break;
                case 5:
                    num = 32;
                    int fourth;//for 32+num

                    for (i = 1; i <= 5; i++) {
                        for (j = 1; j <= 10; j++) {
                            System.out.print(" " + num);
                            num++;
                            if (num % 64 == 0) {
                                num = num + 32;
                            }
                            if (num >= 100) {
                                break;
                            }
                        }
                        System.out.println();
                    }

                    System.out.println("is your number in this set ?\nyes or no");
                    String thtwo = sc.nextLine();
                    if (thtwo.equals("yes"))
                    {
                        add = add + (1 * power[k]);
                    }
                    if (thtwo.equals("no"))
                    {
                        add = add + (0 * power[k]);
                    }//break;
                    System.out.println();break;
                case 6:
                    num = 64;
                    //for 64+num;
                    for (i = 1; i <= 5; i++) {
                        for (j = 1; j <= 10; j++) {
                            System.out.print(" " + num);
                            num++;
                            if (num >= 100) {
                                break;
                            }
                        }
                        System.out.println();

                    }
                    System.out.println();

                    System.out.println("is your number in this set ?\nyes or no");
                    String sixfor = sc.nextLine();
                    if (sixfor.equals("yes"))
                    {
                        add = add + (1 * power[k]);
                    }
                    if (sixfor.equals("no"))
                    {
                        add = add + (0 * power[k]);
                    }break;

            }
        }
        System.out.println("your number " +add);
        




    }
}
