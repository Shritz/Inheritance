/* Matt Nguyen
   Chinemerem Anunkor
     February 20, 2020
     Purpose: This purpose of this java class is to serve as the tester
     Inputs: DessertItems
     Output: DessertItems and formatting them a certain way
*/

import java.util.Collections;
class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();


        System.out.println("------------------------------------------");
        System.out.println("CANDY TEST:");
        Candy candy = new Candy("", 0.0, 0);
        System.out.println(candy.toString());
        Candy candy1 = new Candy("Corn", 1.5, 725);
        candy1.setCalories(500);
        checkout.enterItem(candy1);
        System.out.println(candy1.toString());
        Candy candy2 = new Candy("Lollipop", 2.5, 825);
        candy2.setCalories(640);
        checkout.enterItem(candy2);
        System.out.println(candy2.toString());


        System.out.println("------------------------------------------");
        System.out.println("COOKIE TEST:");
        Cookie cookie = new Cookie("", 0, 0);
        System.out.println(cookie.toString());
        Cookie cookie1 = new Cookie("ChocChip", 17, 499);
        cookie1.setCalories(250);
        checkout.enterItem(cookie1);
        System.out.println(cookie1.toString());
        Cookie cookie2 = new Cookie("Oatmeal", 15, 399);
        cookie2.setCalories(240);
        checkout.enterItem(cookie2);
        System.out.println(cookie.toString());


        System.out.println("------------------------------------------");
        System.out.println("ICECREAM TEST:");
        IceCream icecream = new IceCream("", 0);
        System.out.println(icecream.toString());
        IceCream icecream1 = new IceCream("Vanilla", 10.05);
        icecream1.setCalories(500);
        System.out.println(icecream1.toString());
        checkout.enterItem(icecream1);
        IceCream icecream2 = new IceCream("Chocolate", 9.99);
        icecream2.setCalories(500);
        System.out.println(icecream2.toString());
        checkout.enterItem(icecream2);


        System.out.println("------------------------------------------");
        System.out.println("SUNDAE TEST:");
        Sundae sundae = new Sundae("", 0, "", 0);
        System.out.println(sundae.toString());
        Sundae sundae1 = new Sundae("Caramel", 7.7, "HotFudge", 0);
        sundae1.setCalories(600);
        checkout.enterItem(sundae1);
        System.out.println(sundae1.toString());
        Sundae sundae2 = new Sundae("BananaSplit", 6.9, "Strawberries", 0);
        sundae2.setCalories(560);
        System.out.println(sundae2.toString());
        checkout.enterItem(sundae2);


        System.out.println("------------------------------------------");
        System.out.println("Output Receipt:");
        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.print("Total cost: " + checkout.totalCost() + "\n");
        System.out.print("Total tax: " + checkout.totalTax() + "\n");
        System.out.print("Cost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout.toString());

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Max Test with Same DessertItems Types");
        DessertItem d = DessertItem.max(candy1, candy2);
        if (d == candy1) {
            System.out.println(d.getName() + "(Candy) with " + d.getCalories() + " calories is bigger than "
                    + candy2.getName() + " with " + candy2.getCalories() + " calories.");
        } else if (d == candy2) {
            System.out.println(d.getName() + "(Candy) with " + d.getCalories() + " calories is bigger than "
                    + candy1.getName() + " with " + candy1.getCalories() + " calories");
        } else if (d == null) {
            System.out.println(candy1.getName() + "(Candy) with " + candy1.getCalories() + " equals to " +
                    candy2.getName() + " with " + candy2.getCalories() + " calories");
        }


        DessertItem p = DessertItem.max(cookie1, cookie2);
        if (p == cookie1) {
            System.out.println(p.getName() + "(Cookie) with " + p.getCalories() + " calories is bigger than "
                    + cookie2.getName() + "(Cookie) with " + cookie2.getCalories() + " calories");

        } else if (p == cookie2) {
            System.out.println(p.getName() + "(Cookie) with " + p.getCalories() + " calories is bigger than "
                    + cookie1.getName() + "(Cookie) with " + cookie1.getCalories() + " calories ");
        } else if (d == null) {
            System.out.println(cookie1.getName() + "(Cookie) with " + cookie1.getCalories() + " equals to " +
                    cookie2.getName() + "(Cookie) with " + cookie2.getCalories() + " calories");
        }

        DessertItem q = DessertItem.max(icecream1, icecream2);
        if (q == icecream1) {
            System.out.println(q.getName() + "(IceCream) with " + q.getCalories() + " calories is bigger than "
                    + icecream2.getName() + "(IceCream) with " + icecream2.getCalories() + " calories");
        } else if (q == icecream2) {
            System.out.println(q.getName() + "(IceCream) with " + q.getCalories() + " calories is bigger than "
                    + icecream1.getName() + "(IceCream) with " + icecream1.getCalories() + " calories");
        } else if (q == null) {
            System.out.println(icecream1.getName() + "(IceCream) with " + icecream1.getCalories() + " equals to "
                    + icecream2.getName() + "(IceCream) with " + icecream2.getCalories() + " calories");
        }

        DessertItem s = DessertItem.max(sundae1, sundae2);
        if (s == sundae1) {
            System.out.println(s.getName() + "(Sundae) with " + s.getCalories() + " calories is bigger than "
                    + sundae2.getName() + "(Sundae) with " + sundae2.getCalories() + " calories");
        } else if (s == sundae2) {
            System.out.println(s.getName() + "(Sundae) with " + s.getCalories() + " calories is bigger than " +
                    sundae1.getName() + "(Sundae) with " + sundae1.getCalories() + " calories");
        } else if (s == null) {
            System.out.println(sundae1.getName() + "(Sundae) with " + sundae1.getCalories() + " equals to "
                    + sundae2.getName() + "(Sundae) with " + sundae2.getCalories() + " calories");
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Max Test with Different DessertItem Types:");
        DessertItem t = DessertItem.max(candy2, cookie2);
        if ( t == candy2) {
            System.out.println(t.getName() + "(Candy) with " + t.getCalories() + " calories is bigger than "
            + cookie2.getName() + "(Cookie) with " + cookie2.getCalories() + " calories");
        }
        else if ( t == cookie2) {
            System.out.println(t.getName() + "(Cookie) with " + t.getCalories() + " calories is bigger than "
            + candy2.getName() + "(Candy) with " + candy2.getCalories() + " calories");
        }
        else if ( t == null) {
            System.out.println(candy2.getName() + "(Candy) with " + candy2.getCalories() + " equals to "
            + cookie2.getName() + "(Cookie) with " + cookie2.getCalories() + " calories");
        }

        DessertItem y = DessertItem.max(sundae2, icecream2);
        if ( y == sundae2) {
            System.out.println(y.getName() + "(Sundae) with " + y.getCalories() + " calories is bigger than " +
                    icecream2.getName() + "(IceCream) with " + icecream2.getCalories() + " calories");
        }
        else if ( y == icecream2) {
            System.out.println(y.getName() + "(IceCream) with " + y.getCalories() + " calories is bigger than " +
                    sundae2.getName() + "(Sundae) with " + sundae2.getCalories() + " calories");
        }

        else if (y == null) {
            System.out.println(sundae2.getName() + "(Sundae) with " + sundae2.getCalories() + " equals to "
            + icecream2.getName() + "(IceCream) with " + icecream2.getCalories() + " calories");
        }

        DessertItem u = DessertItem.max(candy1, icecream1);
        if ( u == candy1) {
            System.out.print(u.getName() + "(Candy) with " + u.getCalories() + " calories is bigger than "
            + icecream1.getName() + "(IceCream) with " + icecream1.getCalories() + " calories");
        }
        else if ( u == icecream1) {
            System.out.println(u.getName() + "(IceCream) with " + u.getCalories() + " calories is bigger than " +
                    candy1.getName() + "(Candy) with " + candy1.getCalories() + " calories");
        }
        else if ( u == null) {
            System.out.println(candy1.getName() + "(Candy) with " + candy1.getCalories() + " equals to "
            + icecream1.getName() + "(IceCream) with " + icecream1.getCalories() + " calories");
        }

        DessertItem i = DessertItem.max(sundae1, cookie1);
        if ( i == sundae1) {
            System.out.println(i.getName() + "(Sundae) with " + i.getCalories() + " calories is bigger than "
                    + cookie1.getName() + "(Cookie) with " + cookie1.getCalories() + " calories");
        }

        if ( i == cookie1) {
            System.out.println(i.getName() + "(Cookie) with " + i.getCalories() + " calories is bigger than " +
                    sundae1.getName() + "(Sundae) with " + sundae1.getCalories() + " calories");
        }

        else if (i == null) {
            System.out.println(sundae1.getName() + "(Sundae) with" + sundae1.getCalories() + " equals to "
            + cookie1.getName() + "(Cookie) with " + cookie1.getCalories() + " calories");
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("The unsorted DessertList is:");
        for (DessertItem x: checkout.dessertItems)
            System.out.println(""+x.getName() + "(" + x.getClass().getName() + ")"  + " has " + x.getCalories() + " calories");

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("The sorted DessertList is:");
        Collections.sort(checkout.dessertItems);
        for (DessertItem a : checkout.dessertItems)
        {
            System.out.println(""+a.getName()  +"(" + a.getClass().getName() + ")" + " has " + a.getCalories() + " calories");
        }

    }
}


















