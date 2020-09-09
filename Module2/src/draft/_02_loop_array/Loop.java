package _02_loop_array;

public class Loop {
    public static void main(String[] args) {

        for (int index = 1; index <= 10; index++) {
            System.out.print(index + "\t");
        }
        System.out.println();

//        List<Integer> listNumber = new ArrayList<>();
//        listNumber.add(1);
//        listNumber.add(2);
//        listNumber.add(3);
//        listNumber.add(4);
//
//        for (Integer element: listNumber) {
//            System.out.print(element +"\t");
//        }

        int index_2 = 1;
        while (index_2 <= 10) {
            System.out.print(index_2 + "\t");
            index_2++;
        }

        System.out.println();
//        Scanner scanner = new Scanner(System.in);
//        int number;
//        do {
//            System.out.print("input number: ");
//            number = scanner.nextInt();
//            if (number == 1) {
//                System.out.println("one");
//            } else if (number == 2) {
//                System.out.println("two");
//            } else if (number == 0) {
////                System.out.println("----");
////                System.exit(0);
////                break;
//            }
//        } while (number != 0);
//        System.out.println("ket thuc chuong trinh");


        loop_1:
        for (int i = 0; i < 3; i++) {
//            if(i==1)
//                continue;
            System.out.print("i: "+i+"\t");
            loop_2:
            for (int j = 0; j < 3; j++) {
//                if(j==2)
//                    break;
//                if(j==0)
//                    break;

                System.out.print(j+"\t");
                if(j==1)
                    break loop_1;
            }
            //System.out.println();
        }
    }
}
