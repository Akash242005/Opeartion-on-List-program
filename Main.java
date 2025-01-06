import java.util.*;
public class Main{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================OPERATION IN LIST=======================================");
        while(true)
        {
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Display the list");
            System.out.println("4. Sort the list");
            System.out.println("5. Exit");
            System.out.print("Enter the choice of operation : ");
            int choice = sc.nextInt();
            if(choice==1)
            {
                System.out.print("Enter the number of elements to add : ");
                int n = sc.nextInt();
                for(int i=0;i<n;i++)
                {
                    System.out.print("Enter the element : ");
                    list.add(sc.nextInt());
                    System.out.println("The element added succesfully : "+list.get(i));
                }
            }
            else if(choice == 2)
            {
                while(true)
                {
                    System.out.println("Choices to remove the element");
                    System.out.println("1. Delete by index.");
                    System.out.println("2. Delete by value.");
                    System.out.print("Enter your choice to remove th element : ");
                    int del = sc.nextInt();
                    if(del == 1)
                    {
                        System.out.print("Enter the index to delete : ");
                        int index = sc.nextInt();
                        if(index<=list.size())
                        {
                            list.remove(index);
                            System.out.println("The element deleted at the index : "+index);
                            break;
                        }
                        else{
                            System.out.println("Enter the element within the limit");
                        }
                    }
                    else if(del == 2)
                    {
                        System.out.print("Enter the number to delete : ");
                        int val = sc.nextInt();
                        if(list.indexOf(val) != -1)
                        {
                            list.remove(Integer.valueOf(val));
                            System.out.println("The element removed is : "+val);
                            break;
                        }
                        else{
                            System.out.println("Enter the element that is in the list");
                        }
                    }
                    else{
                        System.out.println("Enter the valid choice to remove element");
                    }
                }
            }
            else if(choice == 3)
            {
                if(!list.isEmpty())
                {
                    System.out.println("The list is : "+list);
                }
                else{
                    System.out.println("The List is Empty");
                }
            }
            else if(choice ==4)
            {
                while(true)
                {
                    System.out.println("The Order's Available to sort : ");
                    System.out.println("1. Ascending Order");
                    System.out.println("2. Descending Order");
                    System.out.print("Enter the choice to sort : ");
                    int so = sc.nextInt();
                    if(so == 1)
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp = list;
                        Collections.sort(temp);
                        System.out.println("The list after sorting in ascending order is : "+(temp));
                        break;
                    }
                    else if(so == 2)
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp = list;
                        temp.sort(Comparator.reverseOrder());
                        System.out.println("The list after sorting in descending order is : "+(temp));
                        break;
                    }
                    else{
                        System.out.println("Enter the valid choice ");
                    }
                }
            }
            else if(choice == 5)
            {
                System.out.println("The operations on the list are Over!!!!!");
                break;
            }
            else
            {
                System.out.println("Enter the valid choice of operation");
            }
        }
    }
}
