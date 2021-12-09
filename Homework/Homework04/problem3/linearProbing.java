import java.util.*;

public class linearProbing {
    public static void scanForElements(ArrayList<String> arrli, int arraySize) {
        char ch;
        do {
            Scanner scan = new Scanner(System.in);
            //System.out.println("Enter The array Size");
            System.out.println("\nHash Table Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. get");
            System.out.println("3. delete");
            int k = 0;
            String key = "";
            int choice = Integer.parseInt(scan.nextLine());
            System.out.println("You have entered:" + choice);
            switch (choice) {
                case 1:
                    System.out.println("Enter the key");
                    key = scan.nextLine();
                    int l = 0;
                    k = hashFunc(key, arraySize);
                    //System.out.println(k);
                    if (arrli.get(k) == "") {
                        arrli.add(k, key);
                        //System.out.println("#");
                    } else {
                        l = k;
                        k = k + 1;
                        while (k < arraySize && arrli.get(k) != "") {
                            k = k + 1;
                            //System.out.println("Hello");
                        }
                        if (k >= arraySize) {
                            k = 0;
                            while (k < l && arrli.get(k) != "") {
                                k = k + 1;
                            }
                            if (k > l) {
                                System.out.println("No index is leftout");
                            } else {
                                arrli.add(k, key);
                            }
                        } else {
                            arrli.add(k, key);
                        }
                    }
                    System.out.println(k);
                    break;

                case 2:
                    System.out.println("Enter key");
                    key = scan.nextLine();
                    //System.out.println(key);
                    int f = hashFunc(key, arraySize);
                    int index = search(f, arrli, key, arraySize);
                    if (index != -1) {
                        if (arrli.get(index) == "") {
                            System.out.println("No such item exists");
                        } else {
                            System.out.println("The index is:");
                            System.out.println(index);
                        }
                    }
                    //System.out.println(index);
                    //System.out.println(arrli.get(12));
                    break;

                case 3:
                    System.out.println("Enter the key to be deleted");
                    key = scan.nextLine();
                    int z = hashFunc(key, arraySize);
                    int ind = search(z, arrli, key, arraySize);
                    if (arrli.get(ind) == "") {
                        System.out.println("It does not exists to delete");
                    } else {
                        if (ind != -1) {
                            arrli.set(ind, "");
                            System.out.println("deleted");
                        } else {
                            System.out.println("Sorry! try to provide the right key");
                        }
                    }
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }

    public static int search(int f, ArrayList<String> arrli, String key, int arraySize) {
        if (arrli.get(f) == key) {
            //System.out.println("hello");
            //System.out.println(f);
            return f;
        } else {
            int l = f;
            f = f + 1;
            while (f < arraySize && (arrli.get(f) != key)) {
                f = f + 1;
            }
            if (f >= arraySize) {
                f = 0;
                while (f < l && (arrli.get(f) != key)) {
                    f = f + 1;
                }
                if (f > l) {
                    System.out.println("wrong key value");
                    return -1;
                } else {
                    return f;
                }
            } else {
                return f;
            }
        }
    }

    public static int hashFunc(String key, int arraySize) {
        int hashVal = 0;
        for (int j = 0; j < key.length(); j++) // left to right
        {
            int letter = key.charAt(j) - 96; // get char code
            hashVal = (hashVal * 27 + letter) % arraySize; // mod
        }
        return hashVal;
    }
}
